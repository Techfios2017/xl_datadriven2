package demo;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import reader.ReadData;
import util.BrowserFactory;
import util.ExcelDataConfig;

public class LoginTest {

	//ReadData readExcelData = new ReadData();
	ExcelDataConfig Excel= new ExcelDataConfig("../WordpressDemo/data/login.xlsx");
	
	@Test
	public void loginTest() throws IOException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php?loggedout=true");
				
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		String username=Excel.getData(0, 1, 0);
		String password=Excel.getData(0, 1, 1);
		
			
		loginPage.login_demo(username, password);
		
		driver.close();
		driver.quit();
		
		
	}

	@Test
	public void TechfiosTest() throws IOException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/?ng=login/");
				
		
		Techfios_login login = PageFactory.initElements(driver, Techfios_login.class);		
		String user=Excel.getData(0, 1, 0);
		String pass=Excel.getData(0, 1, 1);			
		login.login_techfios(user, pass);
		
		Techfios_homepage click = PageFactory.initElements(driver, Techfios_homepage.class);		
		click.click_Account();
		
			
		New_Bank account = PageFactory.initElements(driver, New_Bank.class);		
		String account_title=Excel.getData(0, 1, 2);
		String Desc=Excel.getData(0, 1, 3);
		String balan=Excel.getData(0, 1, 4);
		
		account.select_account(account_title, Desc,balan);
		
		
		driver.close();
		driver.quit();
		
		
	}








}
