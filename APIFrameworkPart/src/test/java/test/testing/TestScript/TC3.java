package test.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC3 {
	
		@Test(priority=3)
	    public void testcase3() throws IOException {
	    	JSONObject data =new JSONObject();
	    	data.put("firstname", "Naqeeb");
	    	data.put("lastname", "Ansari");
	    	data.put("id", TC1.idValue);
	    	data.put("designation", "QA Engineer");
	    	
	    	Properties pr=PropertiesFileLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
	    	HTTPMethods http=new HTTPMethods(pr);
	    	Response  res=http.putRequest("QA_URI", TC1.idValue, data.toString());
	    	System.out.println("Respons Code:" + res.statusCode());
	    	System.out.println("Third Test TestCase Post Request " + res.asString());
		
	}

}
