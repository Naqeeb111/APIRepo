package org.testing.utilities;

import com.jayway.restassured.response.Response;

public class ResponseDataParsingUsingJsonPath {
	
	public static String response_parsing(Response res, String JsonPath) {
		return res.jsonPath().get(JsonPath);
	}

}
