package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import java.util.ArrayList;
import java.util.List;


public class LoginStepdefs extends BaseUtil{
    private BaseUtil base;
//for dependency injection add cucumber picocontainer dependency in pom.xml
    public LoginStepdefs(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to CloodOn login page$")
    public void i_navigate_to_CloodOn_login_page() throws Throwable {
        base.driver.get("http://staging.cloodon.com");
    }

    @Given("^I navigate to \"([^\"]*)\" login page$")
    public void i_navigate_to_http_staging_cloodon_com_login_page(String url) throws Throwable {
        base.driver.get(url);
    }

    @Given("^Enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enter_username_as_and_password_as(String userName, String password) throws Throwable {
        LoginPage lp = new LoginPage(base.driver);
        lp.login(userName,password);
    }


    @Given("^Enter username and password$")
    public void enter_username_and_password() throws Throwable {
        LoginPage lp = new LoginPage(base.driver);
        lp.login();
    }

    @Given("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        LoginPage lp = new LoginPage(base.driver);
        lp.submit();
    }

    @Then("^I should be able to see the home page$")
    public void i_should_be_able_to_see_the_home_page() throws Throwable {
        HomePage hp = new HomePage(base.driver);
        hp.verfifyHomePage();
    }

    @When("^I enter the following details$")
    public void iEnterTheFollowingDetails(DataTable table) throws Throwable {
        /*List<List<String>> data = table.raw();
        System.out.println("0 : "+data.get(0).get(0));
        System.out.println("1 : "+data.get(0).get(1));
        System.out.println("2 : "+data.get(1).get(0));
        System.out.println("3 : "+data.get(1).get(1));
        base.driver.findElement(By.id("username")).sendKeys(data.get(1).get(0));
        base.driver.findElement(By.id("password")).sendKeys(data.get(1).get(1));*/

        List<User> users = new ArrayList<User>() ;

        users = table.asList(User.class);
        LoginPage lp = new LoginPage(base.driver);

        for (User user:users ) {
            lp.login(user.username,user.password);
            }
    }
    @When("^user logged in as  \"([^\"]*)\"  and  \"([^\"]*)\"$")
    public void user_logged_in_as_and(String userName, String password) throws Throwable {
        LoginPage lp = new LoginPage(base.driver);
        lp.login(userName,password);
    }

    //POJO for data table
    public class User
    {
        public String username;
        public String password;

        public User(String userName, String password) {
            this.username = userName;
            this.password = password;
        }
    }
}
