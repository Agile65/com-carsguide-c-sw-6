package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(css="div[data-gtm-label='zero results page']:first-of-type")
    WebElement titleResultPage;
    public String verifyTheResultOfMake(){
        log.info("Getting result from making the car : " + titleResultPage.toString());
        return getTextFromElement(titleResultPage);
    }
    //
//    @CacheLookup
//    @FindBy(xpath = "//div[@class='listing-col listing-col-title col-sm-16 col-md-12 col-lg-13 col']")
//    WebElement titleResultPage;

//    public String verifyTheResultOfMake(){
//        log.info("Getting result from making the car : " + titleResultPage.toString());
//        return getTextFromElement(titleResultPage);
//    }

}
