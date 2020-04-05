package test.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC2 {
	
	@Test(priority=2)
	public void testcase2() throws IOException {
		Properties pr=PropertiesFileLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response  res=http.GetRequest("QA_URI",TC1.idValue);
		System.out.println("Respons Code:" + res.statusCode());
		System.out.println("Second TestCase" + res.asString());
		
	}

}
