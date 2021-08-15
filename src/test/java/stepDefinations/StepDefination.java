package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefination extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data = new TestDataBuild();
	static String place_id;

	@Given("Add user with {string} and {string}")
	public void add_user_with_and(String name, String jobTitle) {
		try {
			System.out.println(getGlobalValue("baseUrl2"));
			res = given().spec(requestSpecification(getGlobalValue("baseUrl2")))
					.body(data.addUserDetails(name, jobTitle));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
		// Write code here that turns the phrase above into concrete actions
//constructor will be called with value of resource which you pass
		APIResources resourceAPI = APIResources.valueOf(resource);
		//System.out.println(resource);
		//System.out.println(method);
		resspec = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();

		if (method.equalsIgnoreCase("POST"))
			response = res.when().post(resourceAPI.getResource());
		else if (method.equalsIgnoreCase("GET"))
			response = res.when().get(resourceAPI.getResource());

	}


	@Then("the API call got success with status code {int}")
	public void the_API_call_got_success_with_status_code(int int1) {
		// Write code here that turns the phrase above into concrete actions
		//response.getStatusCode();
		assertEquals(response.getStatusCode(), int1);

	}


}
