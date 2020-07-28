package testcases;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class Test_DeleteRequest {
	
	@Test
	public void testAPI() {
		
		
		when().
			delete("https://petstore.swagger.io/v2/store/order/12345").
		then().statusCode(404).log().all();
		
		
		
	}

}
