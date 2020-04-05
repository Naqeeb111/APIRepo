
package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTPMethods {
	
	Properties pr;
	public HTTPMethods(Properties pr) {
		this.pr=pr;  // this.pr will ponit gloabal
	}
	
	public void PostRequest() {
		
	}
	
	public Response PostRequest(String uriKey, String body) {
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post(pr.getProperty(uriKey));
		return res;
	}
	
	public Response GetRequest(String urikey, String idValue) {
		String uri=pr.getProperty(urikey)+"/"+idValue; 
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		return res;
	}
	
	public Response GetRequest(String urikey) {
		//String uri=pr.getProperty(urikey);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(urikey));
		return res;
	}
	
	public Response putRequest(String urikey, String idValue, String body) {
		String uri=pr.getProperty(urikey)+"/"+idValue; 
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.put(uri);
		return res;
	}
	
	public Response deleteRequest(String urikey, String idValue) { 
		String uri=pr.getProperty(urikey)+"/"+idValue; 
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uri);
		return res;
	}

}
