package steps;

import baseLayer.BaseTest;
import io.cucumber.java.en.Given;
import pages.LoginPage;

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

        loginpage.enteruserName("prafulp1010@gmail.com");
    }
    
    @Given("user enter password")
    	public void user_enter_password()
    	{
    		loginpage.enterPassword("pr@ful0812@gmail.com");
    	}
    
    public void user_click_on_login_button() 
    	{
    		loginpage.clickOnLoginButton();
    	}
    }

