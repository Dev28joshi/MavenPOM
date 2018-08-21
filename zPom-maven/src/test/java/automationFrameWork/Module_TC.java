package automationFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import appModule_ReusableFunctionsClass.Sign_Action;
import pageObject.Home_Page;
import utility.Constant;

public class Module_TC 
{

	public static WebDriver driver=null;
	@Test
	//public static void main(String[] args) {

	public static void EndToEnd() 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Zeus\\Desktop\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.url);
		Home_Page.login_lnk(driver).click();
		Sign_Action.execute(driver);
		Home_Page.lnk_logout(driver).click();
		driver.quit();

	}
}
