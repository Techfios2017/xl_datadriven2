package demo;

import java.io.IOException;
import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reader.ReadData;
import util.BrowserFactory;

public class XL_reader {
	
	
	
	ReadData readExcelData = new ReadData();	
	
	
	public void action(String username, String password, String accounttile,String description,String blance){
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/?ng=login/");
		Techfios_login login = PageFactory.initElements(driver, Techfios_login.class);
		login.login_techfios(username, password);
		Techfios_homepage click = PageFactory.initElements(driver, Techfios_homepage.class);		
		click.click_Account();
	
		New_Bank account = PageFactory.initElements(driver, New_Bank.class);	
		account.select_account(accounttile, description, blance);
		
		driver.close();
		driver.quit();
	
	}
	
	@Test
	public void TechfiosTest() throws IOException{
		
				
		String userdata[][]= readExcelData.getLogInDataFromExcelFile();	
		for(int j=1; j<userdata.length;j++)
		{
			for(int x=0;x<userdata[j].length;x++){
				
				
			}
		action(userdata[j][0], userdata[j][1], userdata[j][2], userdata[j][3], userdata[j][4]);
		
		}
		
		
		
		
		

		
		
	}



	
}










