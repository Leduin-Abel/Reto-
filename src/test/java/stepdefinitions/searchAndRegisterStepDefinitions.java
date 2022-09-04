package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class searchAndRegisterStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^The user has a browser$")
    public void theUserHasABrowser() {
        throw new PendingException();
    }

    @When("^The user goes to the uTest webpage$")
    public void theUserGoesToTheUTestWebpage() {

        throw new PendingException();
    }

    @Then("^The user sees the uTest landing page/homepage$")
    public void theUserSeesTheUTestLandingPageHomepage() {

        throw new PendingException();
    }
}
