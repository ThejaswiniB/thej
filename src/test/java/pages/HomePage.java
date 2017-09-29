package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//li[@id='nav_home']/a[contains(.,'My Home')]")
    WebElement myHome;

    public void verfifyHomePage() throws InterruptedException {
        Thread.sleep(10000);
        String expected = "My Home";
        String actual =  myHome.getText();
        Assert.assertTrue("Loging Successful",
                expected.equalsIgnoreCase(actual));
    }

}
