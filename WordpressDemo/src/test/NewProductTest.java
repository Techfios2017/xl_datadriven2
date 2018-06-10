package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.NewProductPage;
import page.New_Bank;
import page.Techfios_homepage;
import page.Techfios_login;
import reader.ReadData;
import util.BrowserFactory;

public class NewProductTest {

	ReadData readExcelData= new ReadData();
	
	String Username;
	String Password;
	String Name;
	String Price;
	String Itemnumber;
	String Description;
	
	public NewProductTest() throws IOException{
		
	String userdata[][]=readExcelData.getLogInDataFromExcelFile();
	for(int j=1; j<userdata.length;j++)
	{
		Username=userdata[j][0];
		Password=userdata[j][1];
		Name=userdata[j][5];
		Price=userdata[j][6];
		Itemnumber=userdata[j][7];
		Description=userdata[j][8];		
	}		
	}
	
	@Test
	public void TechfiosTest() throws IOException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		Techfios_login login = PageFactory.initElements(driver, Techfios_login.class);
		login.login_techfios(Username, Password);
		
		Techfios_homepage home = PageFactory.initElements(driver, Techfios_homepage.class);		
		home.ClickNewProducts();
	
		NewProductPage  account = PageFactory.initElements(driver, NewProductPage.class);	
		account.AddingNewProductInfo(Name, Price, Itemnumber, Description);;
		
		driver.close();
		driver.quit();
	}




}
