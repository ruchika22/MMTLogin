package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakemyTripLoginPage {
	
WebDriver driver;



public MakemyTripLoginPage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[@id=\"ch_login_email\"]")
WebElement username;

@FindBy(xpath="//*[@id=\"ch_login_password\"]")
WebElement password;

@FindBy(xpath="//*[@id ='ch_login_btn']")
WebElement login;


public WebElement Email() {
	 username.sendKeys("ruchikapriya22@gmail.com");
	 return username;
}
public WebElement Password() {
	 password.sendKeys("ruchika");
	 return password;
	 
}

public WebElement Login() {
	login.click();
	return login;

}


}
