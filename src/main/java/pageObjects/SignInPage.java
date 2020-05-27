package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	public WebDriver driver;
	 By Account_Overview=By.xpath("//a[@id='ctl00_lnkDashboard']");
	 
	 public SignInPage(WebDriver driver)
	 {
		 this.driver=driver;
		 
	 }
	 
	 public WebElement SignInPage_tag()
	 {
		return driver.findElement(Account_Overview);
		 
	 }

}
