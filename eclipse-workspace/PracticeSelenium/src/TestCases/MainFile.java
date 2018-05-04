package TestCases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.MakemyTripLoginPage;

public class MainFile {
	
@Test
public void Login() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\499529\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id ='ch_login_icon']")).click();
//	Thread.sleep(3000);
//	driver.switchTo().alert().dismiss();
//	
	
	MakemyTripLoginPage m1 = new MakemyTripLoginPage(driver);
	
	m1.Email();
	m1.Password();
	m1.Login();
	
	
}


}
