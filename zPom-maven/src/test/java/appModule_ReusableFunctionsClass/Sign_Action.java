package appModule_ReusableFunctionsClass;

import org.openqa.selenium.WebDriver;

import pageObject.Login_Page;
import utility.Constant;

public class Sign_Action
{

	public static void execute(WebDriver driver)
	
	{
		Login_Page.txt_UserName(driver).sendKeys(Constant.email);
		Login_Page.txt_Password(driver).sendKeys(Constant.emailpwd);
		Login_Page.btn_login(driver).click();
	}
}
