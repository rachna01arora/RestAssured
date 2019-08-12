package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Getdata {
	
	@Test
	public void testResponse(){
		
		Response resp=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int code=resp.getStatusCode();
		System.out.println("status code is " + code);
		Assert.assertEquals(code, 200);
	}
	@Test
	public void testBody(){
		
		Response resp=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		String data=resp.asString();
		System.out.println("status code is " + data);
		//Assert.assertEquals(code, 200);
		
		System.out.println(resp.getTime());
	}
	

}
