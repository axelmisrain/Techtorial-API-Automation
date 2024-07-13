package api.qa.Techtorial.stepdefinition;

import api.qa.Techtorial.endpoints.EP_AppCompany;
import io.cucumber.java.en.Then;

public class SD_AppCompany {
EP_AppCompany epAppCompany = new EP_AppCompany();
    @Then("User calls company endpoint and validates {string},{string},{string},{string}")
    public void user_calls_company_endpoint_and_validates(String message, String companyName, String companyEmail, String companyPhone) {
      epAppCompany.validateCompanyInformation(message, companyName, companyEmail, companyPhone);
    }

    @Then("User calls company and validates {string} {string}")
    public void userCallsCompanyAndValidatesMessageId(String message, String id) {
     epAppCompany.validateAppInformation(message, id);
    }
}
