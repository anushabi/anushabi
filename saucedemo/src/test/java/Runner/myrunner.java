package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",
				glue= {"StepDefination", "Hooks"}							
		
		
		)


public class myrunner extends AbstractTestNGCucumberTests{
	
	

}
