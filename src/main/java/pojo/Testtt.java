package pojo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
public class Testtt {

	public static void main(String[] args) {
		/*
		 * RestAssured.baseURI = "https://reqres.in/";
		 * 
		 * Listusers lu= given().log().all().queryParam("page",
		 * "2").when().get("/api/users").as(Listusers.class); System.out.println(
		 * lu.getPage()); int dcount = lu.getData().size(); System.out.println(dcount);
		 * System.out.println("======="); for(int i=0;i<dcount;i++) {
		 * System.out.println(lu.getData().get(i).getFirst_name()); }
		 */
		
		given().when().post("");
	}

}
