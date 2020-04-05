package org.testing.responseValidation;

import com.jayway.restassured.response.Response;

public class ResponseValidation {
	
	public static void responseStatusCodeValidate(int expectedStatusCode, Response res) {
		if(expectedStatusCode==res.statusCode()) {
			System.out.println("Passed with Status Code" + res.statusCode());
		}
		else {
			System.out.println("Faile with status code" + res.statusCode());
		}
	}

}
