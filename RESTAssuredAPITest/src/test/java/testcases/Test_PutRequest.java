package testcases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;

public class Test_PutRequest {
	
	@Test
	public void testAPI() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "test doggie");
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		System.out.println(request);
		
		given().
			header("content-type", "application/json").
			contentType(ContentType.JSON).accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("https://petstore.swagger.io/v2/pet").
		then().statusCode(200).log().all();	
		
	}
		
}

