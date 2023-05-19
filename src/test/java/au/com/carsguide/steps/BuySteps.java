package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import au.com.carsguide.pages.ResultPage;
import au.com.carsguide.pages.UsedCarSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I mouse hover on 'buy\\+sell' tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuySellTab();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickSearchCarsLink();
    }

    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String textNewAndUsed)  {
        Assert.assertEquals(textNewAndUsed,new NewAndUsedCarSearchPage().getTextNewAndUsedCarForSale(),"Error");
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make)  {
        new NewAndUsedCarSearchPage().selectMakesDropdown(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model)  {
        new NewAndUsedCarSearchPage().selectModelDropdown(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new NewAndUsedCarSearchPage().selectLocationDropdown(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new NewAndUsedCarSearchPage().selectPriceDropdown(price);
    }

    @And("^I click on Find My Next Car Tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCar();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make)  {
        Assert.assertEquals(make,new ResultPage().verifyTheResultOfMake(),"Error");
        //Assert.assertTrue(new ResultPage().verifyTheResultOfMake().contains(make));
    }

    @And("^I click 'Used' link$")
    public void iClickUsedLink() {
        new HomePage().clickUsedLink();
    }

    @Then("^I navigate to the \"([^\"]*)\" page$")
    public void iNavigateToThePage(String textUsedCar)  {
        Assert.assertEquals(textUsedCar,new UsedCarSearchPage().getTextUsedCarForSale(),"Error");
    }

}
