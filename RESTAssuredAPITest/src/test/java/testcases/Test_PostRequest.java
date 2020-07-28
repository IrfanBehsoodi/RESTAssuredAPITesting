package testcases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;

public class Test_PostRequest {
	
	@Test
	public void testAPI() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("id", "0");
		map.put("petId", "0");
		map.put("quantity", "0");
		map.put("shipDate", "2020-07-28T09:02:39.482Z");
		map.put("status", "placed");
		map.put("complete", "true");
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
