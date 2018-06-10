package test;

import java.io.IOException;
import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.New_Bank;
import page.Techfios_homepage;
import page.Techfios_login;
import reader.ReadData;
import util.BrowserFactory;

public class New_BankTest {
	ReadData readExcelData = new ReadData();
	
	String username ;
	String password;
	String accounttile;
	String description;
	String blance;
	
	public New_BankTest() throws IOException{
		
		String userdata[][]= readExcelData.getLogInDataFromExcelFile();	
		for(int j=1; j<userdata.length;j++)
		{
			username = userdata[j][0];
			password = userdata[j][1];
			accounttile = userdata[j][2];
			description = userdata[j][3];
			blance = userdata[j][4];
	    }		
	}
		
	@Test
	public void TechfiosTest() throws IOException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		Techfios_login login = PageFactory.initElements(driver, Techfios_login.class);
		login.login_techfios(username, password);
		Techfios_homepage click = PageFactory.initElements(driver, Techfios_homepage.class);		
		click.click_Account();
	
		New_Bank account = PageFactory.initElements(driver, New_Bank.class);	
		account.select_account(accounttile, description, blance);
		
		driver.close();
		driver.quit();
	}
}










