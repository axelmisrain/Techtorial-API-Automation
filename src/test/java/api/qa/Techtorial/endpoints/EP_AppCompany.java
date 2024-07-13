package api.qa.Techtorial.endpoints;

import api.qa.Techtorial.pojo.PJ_AppCompany;
import api.qa.Techtorial.pojo.PJ_AppLogin;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import utils.ConfigReader;

public class EP_AppCompany {
    public void validateCompanyInformation(String expectedMessage, String companyName, String companyEmail, String companyPhone){
        RestAssured.baseURI= ConfigReader.readProperty("baseUrl");
        RestAssured.basePath=ConfigReader.readProperty("basePath");


        Response response = RestAssured.given().accept("application/json")
                .header("Authorization", ConfigReader.readProperty("bearer_token"))
                .when().get().then().statusCode(200).log().body().extract().response();

        PJ_AppCompany deserializedResponse = response.as(PJ_AppCompany.class);

        Assertions.assertEquals(expectedMessage, deserializedResponse.getMessage());
        Assertions.assertEquals(companyName, deserializedResponse.getData().getCompany_name());
        Assertions.assertEquals(companyEmail, deserializedResponse.getData().getCompany_email());
        Assertions.assertEquals(companyPhone, deserializedResponse.getData().getCompany_phone());
    }

    public void validateAppInformation(String message, String name){

        RestAssured.baseURI=ConfigReader.readProperty("UrlApp");
        RestAssured.basePath=ConfigReader.readProperty("PathApp");

        Response response = RestAssured.given().accept("application/json").contentType("application/json")
                .body("{\"email\":\"testemployee@example.com\",\n" +
                        "\"password\":\"1234567890\"\n" +
                        "}").when().post().then().statusCode(200).log().body().extract().response();

        PJ_AppLogin appLogin = response.as(PJ_AppLogin.class);

        Assertions.assertEquals(message, appLogin.getMessage());
        Assertions.assertEquals(name, appLogin.getData().getUser().getName());
        Assertions.assertNotNull(appLogin.getData().getToken());
    }
}
