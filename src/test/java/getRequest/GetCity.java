package getRequest;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import lib.rest.RestAssuredtest;

public class GetCity extends RestAssuredtest{
	
	
	@Test
	public  void getcitymethod(){
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	Response response=get("/Hyderabad");
	String asString = response.body().asString();
	System.out.println(asString);
	
}
	@Test
	public  void getcitymethodwitheaders(){
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		HashMap<String, String> headerresponse=getheader();		
		Response response=getWithHeader(headerresponse, "/Hyderabad");
		String responsevalue=response.body().asString();
		System.out.println(responsevalue);
	
	
	}	
}
