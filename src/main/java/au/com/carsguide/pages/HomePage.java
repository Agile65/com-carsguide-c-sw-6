package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='buy + sell']" )
    WebElement buySellTab;
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Search Cars']" )//
    WebElement searchCarsLink;
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Used']" )
    WebElement usedLink;
    @FindBy(xpath ="//a[normalize-space()='Find a Dealer']" )
    WebElement findDealerLink;

    public void mouseHoverOnBuySellTab(){
        mouseHoverToElement(buySellTab);
        log.info("Mouse hover to element " + buySellTab.toString());
    }
    public void clickSearchCarsLink(){
        clickOnElement(searchCarsLink);
        log.info("Click search cars link : " + searchCarsLink.toString());
    }

    public void clickUsedLink(){
        clickOnElement(usedLink);
        log.info("Click used link : " + usedLink.toString());
    }

    public void clickFindDealerLink(){
        clickOnElement(findDealerLink);
        log.info("Click find dealer link : " + findDealerLink.toString());
    }

}
