# Techtorial API Automation: Postman, RestAssured, Cucumber, JUnit, Lombok, Jackson  

## Objectives
This document outlines the automation testing plan for the Techtorial API. The goal is to ensure the API functions correctly by using various tools and methods, including providing an authorization Bearer token for successful login.

## Test Cases
1 Validate companies information
2 User login succesfully
3 Validate user that user information is correct.

## Steps to automate testing

### Test 1: Validate Companies Information
#### 1 Read Swagger Documentation provided.
- Review the API documentation provided by Swagger to understand the endpoints, request formats, and expected responses.
#### 2 Mannually Test data through Postman.
- Send requests to the API endpoints using Postman.
- Verify that the actual responses match the expected data.
#### 3 Automation process
- Utilize RestAssured, Java, Lombok, and Jackson libraries to automate the testing process.
- Write test scripts to send requests, capture responses, and compare actual results with expected outcomes.

### Test 2: User Login Successfully
#### 1 Read Swagger Documentation:
- Review the API documentation to understand the login endpoint and required parameters.
#### 2 Authorization Bearer Token:
- Obtain the necessary Bearer token for authorization.
#### 3 Manual Testing with Postman:
- Send login requests using Postman with the Bearer token.
- Verify that the login is successful and the response data is as expected.
#### 4 Automation Process:
- Use RestAssured, Java, Lombok, and Jackson libraries to automate the login testing.
- Write test scripts to send login requests, handle authorization tokens, and verify the response data.

### Test 3: Validate User Information
#### 1 Read Swagger Documentation:
1- Review the API documentation to understand the endpoints related to user information.
#### 2 Manual Testing with Postman:
- Send requests to the user information endpoints using Postman.
- Verify that the actual user information matches the expected data.
#### 3 Automation Process:
- Use RestAssured, Java, Lombok, and Jackson libraries to automate the user information validation.
- Write test scripts to send requests, capture responses, and compare the actual user data with the expected information.

## Tools and Libraries
- RestAssured: For API testing and automation.
- Java: The programming language used for writing the automation scripts.
- Lombok: To reduce boilerplate code in Java.
- Jackson: For JSON parsing and data binding.

## Conclusion
By following this automation testing plan, we aim to ensure the Techtorial API performs as expected and meets the specified requirements. This structured approach will help in identifying issues early, ensuring a reliable and robust API.
