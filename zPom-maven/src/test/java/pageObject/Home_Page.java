package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page
{
	public static WebElement element= null;
	
	public static WebElement Register_lnk(WebDriver driver)
	{
		element= driver.findElement(By.className("ico-register"));
		return element;
	}
	public static WebElement login_lnk(WebDriver driver)
	{
		element= driver.findElement(By.className("ico-login"));
		return element;
	}
	public static WebElement text_verify(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//div[@class=\"title\"]/strong[text()='Categories']"));
		return element;
	}
	public static WebElement lnk_logout(WebDriver driver)
	{
		element= driver.findElement(By.className("ico-logout"));
		return element;
	}
	
}
