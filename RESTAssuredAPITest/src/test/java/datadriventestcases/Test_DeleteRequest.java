package datadriventestcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class Test_DeleteRequest extends TestData{
	
	// Data Driven	
	@Test(dataProvider = "DeleteData")
	public void testAPI(int orderId) {
			
		when().
			delete("https://petstore.swagger.io/v2/store/order/"+orderId).
		then().statusCode(404).log().all();
		
	}
	
		// Parameterization running from testng.xml
		@Parameters({"orderId"})
		@Test
		public void testAPI2(int orderId) {
			
			System.out.println("Order ID is:"+orderId);
				
			when().
				delete("https://petstore.swagger.io/v2/store/order/"+orderId).
			then().statusCode(404).log().all();
			
		}
	

}
