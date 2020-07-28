package testcases;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test_GetRequest {
	
	@Test
	public void testAPI() {
		
		given().
			header("content-Type", "application/json").
			get("https://petstore.swagger.io/v2/store/inventory")
			.then().statusCode(200).log().all();		
		
	}
}
