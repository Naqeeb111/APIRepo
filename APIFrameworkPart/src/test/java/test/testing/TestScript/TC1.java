package test.testing.TestScript;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.responseValidation.ResponseValidation;
import org.testing.utilities.PropertiesFileLoad;
import org.testing.utilities.ResponseDataParsingUsingJsonPath;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.jayway.restassured.response.Response;

//Post Request
public class TC1 {
	static String idValue;
	@Test(priority=1)
	public void testcase1() throws IOException {
		
		Random randowNum = new Random();
		Integer i=randowNum.nextInt();
		
		JSONObject data =new JSONObject();
		data.put("firstname", "Naqeeb");
		data.put("lastname", "Ansari");
		data.put("id", i.toString());
		data.put("designation", "QA Engineer");
		
		Properties pr=PropertiesFileLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res= http.PostRequest("QA_URI", data.toString());
		
		//System.out.println("Status Code is" +res.statusCode());
		//System.out.println("Data is" + res.asString());
		
		ResponseValidation.responseStatusCodeValidate(201, res);
		
		idValue=ResponseDataParsingUsingJsonPath.response_parsing(res, "id");
		System.out.println(" Test Case1 Id value is: " + idValue);
		
	}

}
