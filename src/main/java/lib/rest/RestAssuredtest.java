package lib.rest;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;
import lib.utils.DataBaseUtility;
import net.minidev.json.JSONObject;
import pages.selenium.OpenIDPage;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;


public class RestAssuredtest {
	
	public static RequestSpecification setLogs() {

		RequestLogSpecification log = RestAssured.given().log();
		
		return log.all().contentType("string");
	}
	
	public static Response get(String URL){
		return setLogs().when().get(URL);	
		
	}
	
	public static Response getWithHeader(HashMap<String, String> headers, String URL){
		
		return setLogs().when().headers(headers).get(URL);
	}
	
	public static HashMap<String, String> getheader(){
		
		HashMap<String, String> reqparams=new HashMap<String, String>();
		reqparams.put("Accept", "application/json+fhir");
		reqparams.put("Content-Type", "application/json+fhir");		
		return reqparams;
		
	}
		
	}




