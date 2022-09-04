package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/searchAndRegister.feature",
                tags = "@stories",
                glue = "co.com.choucair.certification.User_Registration.stepdefinitions" ,
                snippets = SnippetType.CAMELCASE )

public class RunnerTags {

}
