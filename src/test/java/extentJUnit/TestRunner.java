package extentJUnit;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
	features = "Features",
	glue= {"stepDefinitions"},
	plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json"},
	tags = {"@TestJU"}
	//dryRun = true
	)
 

public class TestRunner {
	
	//@AfterClass
	public static void writeExtentReport() {
		System.out.println("This is after class");
		//Reporter.loadXMLConfig(new File(System.getProperty("user.dir").replaceAll("\\\\", "/")+"/src/main/java/extent-config.xml"));
	//	Reporter.loadXMLConfig(new File("C:/Users/ayush.gupta/workspace/ExtentJUnit/src/main/java/extent-config.xml"));	
			Reporter.loadXMLConfig("C:/Users/ayush.gupta/workspace/ExtentJUnit/src/main/java/extent-config.xml");	
		
		
	}

}
