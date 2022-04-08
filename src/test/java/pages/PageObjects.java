package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ParentsClass;

import java.util.List;

public class PageObjects extends ParentsClass {


    public PageObjects (){

        PageFactory.initElements(driver, this);
    }

    @FindBy (name = "search")
    public WebElement eSearchFieldInput;

    @FindBy (css = "div.caption h4")
    public List<WebElement> eSearchedProducts;

    public void verifyTextInSearchedProducts(String text){
        for (WebElement product : eSearchedProducts) {
            Assert.assertTrue(product.getText().toLowerCase().contains(text.toLowerCase()));
        }
    }

    public void searchProduct(String text){
        eSearchFieldInput.sendKeys(text+ Keys.ENTER);
    }
}
