import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by clovisolivier on 03/01/2017.
 */
public class HomePage extends PageObject {

    @FindBy(id="lst-ib")
    private WebElement searchInput;

    @FindBy(className="btn-yamm")
    private WebElement myTiendo;

    @FindBy(xpath = "//*[@id=\"results-allOffersSection\"]/div[1]/div/div/div[2]/div[1]/div/div[1]/div[1]/span")
    private WebElement firstCatalog;

    @FindBy(className = "navbar")
    private WebElement navbar;

    public HomePage(WebDriver driver){
        super(driver);
        assertTrue(this.searchInput.isDisplayed());
    }    
    public void enterResearch(String research){
        this.searchInput.clear();
        this.searchInput.sendKeys(research);
    }

    public ResearchPage submit(){
        searchInput.click();
        return new ResearchPage(driver);
    }


    public boolean isInitializedNavbar() {
        return navbar.isDisplayed();
    }
    public boolean isInitialized() {
        return searchInput.isDisplayed();
    }

}
