package test.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.responseValidation.ResponseValidation;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC4 {
	
	@Test(priority=4)
	 public void testcase4() throws IOException {
	    	
	    	Properties pr=PropertiesFileLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
	    	HTTPMethods http=new HTTPMethods(pr);
	    	Response  res=http.deleteRequest("QA_URI", TC1.idValue);
	    	ResponseValidation.responseStatusCodeValidate(200, res);
	    	System.out.println("Record Deleted Successfully");
		
	}

}
