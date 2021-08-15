package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefination2 extends Utils {
	RequestSpecification ress;
	ResponseSpecification resspecc;
	Response responsee;
	TestDataBuild dataa = new TestDataBuild();

	@When("user calls {string} resource with {string} http request")
	public void user_calls_resource_with_http_request(String resource, String method) {
		APIResources resourceAPI = APIResources.valueOf(resource);
		//System.out.println(resource);
		//System.out.println(method);
		resspecc = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();

		if (method.equalsIgnoreCase("POST"))
			responsee = ress.when().post(resourceAPI.getResource());
		else if (method.equalsIgnoreCase("GET"))
			responsee = ress.when().get(resourceAPI.getResource());
		System.out.println(responsee.toString() + "  ");
	}

	@Given("Validate the username")
	public void validate_the_username() {
		try {
			//System.out.println(getGlobalValue("baseUrl1"));
			ress = given().spec(requestSpecificationn(getGlobalValue("baseUrl1")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("verify {string} in response body is {string}")
	public void verify_in_response_body_is(String keyValue, String Expectedvalue) {
		assertEquals(getJsonPath(responsee, keyValue), Expectedvalue);
	}

}
