package test.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC5 {
	
	@Test(priority=5)
	public void testcase5() throws IOException {
		System.out.println("Test Changes in GIT");
		Properties pr=PropertiesFileLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response  res=http.GetRequest("QA_URI");
		System.out.println("Respons Code:" + res.statusCode());
		System.out.println("Five TestCase" + res.asString());
		
	}

}
