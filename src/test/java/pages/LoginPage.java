package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver)
    {
       PageFactory.initElements(driver,this);
    }

    @FindBy(id = "username")
    WebElement userNameTb;

    @FindBy(id = "password")
    WebElement passwordTb;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement loginButton;

    public void login(String username,String paswword)
    {
        userNameTb.sendKeys(username);
        passwordTb.sendKeys(paswword);
    }

    public void login()
    {
        userNameTb.sendKeys("prabhath@cloodon.com");
        passwordTb.sendKeys("password");
    }
    public void submit()
    {
        loginButton.click();
    }

}
