package au.com.carsguide.steps;

import au.com.carsguide.pages.FindDealerPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class FindDealersStep {
    @And("^I click 'Find a dealer'$")
    public void iClickFindADealer() {
        new HomePage().clickFindDealerLink();
    }

    @Then("^I navigate to 'car-dealers' page$")
    public void iNavigateToCarDealersPage() {
        Assert.assertEquals("Find a Car Dealership Near You",new FindDealerPage().getTextFindADealer(),"Error");
    }

    @And("^I should see the dealer names are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(DataTable dataTable) {
        List<String> dealerName = dataTable.asList(String.class);
        SoftAssert softAssertions = new SoftAssert();
        for (int i = 1; i <= dealerName.size() - 1; i++) {
            softAssertions.assertTrue(new FindDealerPage().isDealerDisplayed(dealerName.get(i)),"'"+dealerName.get(i)+"' dealer not found");
        }
        softAssertions.assertAll();
    }
}
