package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page
{

	public static WebElement element=null;
	public static WebElement txt_UserName(WebDriver driver)
	{
		element= driver.findElement(By.id("Email"));
		return element;
	}
	public static WebElement txt_Password(WebDriver driver)
	{
		element= driver.findElement(By.id("Password"));
		return element;
	}
	public static WebElement btn_login(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//input[@value=\"Log in\"]"));
		return element;
	}
}
