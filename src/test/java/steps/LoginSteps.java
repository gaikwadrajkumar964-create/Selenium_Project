package steps;

import baseLayer.BaseTest;
import io.cucumber.java.en.Given;
import pageLayer.LoginPage;

public class LoginSteps {

    BaseTest baseTest = new BaseTest();
    LoginPage loginpage;

    @Given("user is on login page")
    public void user_is_on_login_page() {

        baseTest.initialization();   // ✅ driver initialized here
        loginpage = new LoginPage(); // ✅ AFTER driver init
    }

    @Given("user enter username")
    public void user_enter_username() {

        loginpage.enterUserName("prafulp1010@gmail.com");
    }
}
