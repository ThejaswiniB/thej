package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hook extends BaseUtil {
    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initialsTest()
    {
        System.out.println("opening the browzer");
        //pasing the WebDriver instance
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        base.driver = new FirefoxDriver();
        base.driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        base.driver.manage().window().maximize();
    }
    @After
    public void tearDownTest(Scenario scenario)
    {
        System.out.println("closing the browzer -- MOCK\n");
        base.driver.close();
        System.out.println("Scenario : "+scenario.getName());
    }
}
