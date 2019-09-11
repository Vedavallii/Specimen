package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="src/test/java/feature/Login.feature",glue="steps",monochrome=true,tags="~@smoke"/*,dryRun=true,snippets=SnippetType.CAMELCASE*/)
public class RunTest extends AbstractTestNGCucumberTests{

		

	}


