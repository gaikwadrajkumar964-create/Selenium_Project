package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseTest;

public class LoginPage extends BaseTest{
	
@FindBy(name="email")
WebElement username;

@FindBy(name="password")
WebElement password;

@FindBy(xpath="//div[text()='Login']")
WebElement loginbutton;

public LoginPage()

{
	System.out.println("constructor");
	
	PageFactory.initElements(driver, this);
	
	
	}

public void enteruserName(String username)
{
	this.username.sendKeys(username);
	}

public void enterPassword(String password)
{
	this.password.sendKeys(password);

}

public void clickOnLoginButton()
{
	this.loginbutton.click();
	}
}
