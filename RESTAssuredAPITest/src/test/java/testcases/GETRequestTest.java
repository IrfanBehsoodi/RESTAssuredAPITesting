package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GETRequestTest {
	
	@Test
	void getAPI() {
		
		Response response = RestAssured.get("https://petstore.swagger.io/v2/store/inventory");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
		System.out.println(response.header("content-type"));
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	void resultAPI() {
		
		given();
		RestAssured
				.get("https://petstore.swagger.io/v2/store/inventory")
		.then()
				.statusCode(200);
		
	}

	// Methods
	private RestAssured given() {
		// TODO Auto-generated method stub
		return null;
	}

}
