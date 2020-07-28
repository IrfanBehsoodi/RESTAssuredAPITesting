package datadriventestcases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;

public class Test_PostRequest extends TestData{
	
		
	@Test(dataProvider = "DataForPost")
	public void testAPI(int id, String petid, String quantity, String shipDate, String status, boolean complete ) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("id", id);
		map.put("petId", petid);
		map.put("quantity", quantity);
		map.put("shipDate", shipDate);
		map.put("status", status);
		map.put("complete", complete);
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		System.out.println(request);
		
		given().
			header("content-type", "application/json").
			contentType(ContentType.JSON).accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://petstore.swagger.io/v2/store/order").
		then().statusCode(200);
		
	}
}
