package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath ="//h1" )
    WebElement textNewAndUsedCarForSale;
    @CacheLookup
    @FindBy(id ="makes" )
    WebElement dropdownMakes;
    @CacheLookup
    @FindBy(id ="models" )
    WebElement dropdownModel;
    @CacheLookup
    @FindBy(id ="locations" )
    WebElement dropdownLocation;
    @CacheLookup
    @FindBy(id ="priceTo" )
    WebElement dropdownPrice;
    @CacheLookup
    @FindBy(id ="search-submit" )
    WebElement findMyNextCarTab;
    @CacheLookup
    @FindBy(xpath="//div[contains(text(),'BMW')]")
    WebElement makeResult;


    public  String getTextNewAndUsedCarForSale(){
        log.info("Navigated to Used cars For sale page:  " + textNewAndUsedCarForSale.toString());
        return getTextFromElement(textNewAndUsedCarForSale);
    }
    public void selectMakesDropdown(String carMakes){
        selectByVisibleTextFromDropDown(dropdownMakes,carMakes);
        log.info("Select makes dropdown :  " + dropdownMakes.toString());
    }
    public void selectModelDropdown(String carModel){
        selectByValueFromDropDown(dropdownModel,carModel);
        log.info("Select model dropdown :  " + dropdownModel.toString());
    }
    public void selectLocationDropdown(String location){
        selectByVisibleTextFromDropDown(dropdownLocation,location);
        log.info("Select model dropdown :  " + dropdownLocation.toString());
    }
    public void selectPriceDropdown(String price){
        selectByVisibleTextFromDropDown(dropdownPrice,price);
        log.info("Select model dropdown :  " + dropdownPrice.toString());
    }
    public void clickOnFindMyNextCar(){
        clickOnElement(findMyNextCarTab);
        log.info("Click on Find my next car :  " + findMyNextCarTab.toString());
    }
    public String seeTheMakeInResults(){
        log.info("See the make in results Text :  " + makeResult.toString());
        return getTextFromElement(makeResult);
    }
}
