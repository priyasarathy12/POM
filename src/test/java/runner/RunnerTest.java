package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/*@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue="steps",monochrome=true,tags="@reg")
public class RunnerTest {

}
*/

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
					glue= {"pages","steps"},monochrome=true,
					plugin= {"pretty","html:CucumberReports"},
				
					tags="@CLusingframework",
					snippets=SnippetType.CAMELCASE)

public class RunnerTest {

}
