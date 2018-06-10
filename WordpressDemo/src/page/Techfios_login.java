package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Techfios_login {

WebDriver driver;
	
	public Techfios_login(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.ID,using="username")
	WebElement username;

	@FindBy(how=How.ID,using="password")
	WebElement password;

	@FindBy(how=How.NAME,using="login")
	WebElement login;


 public void login_techfios(String user,String pass){
	 
	 username.sendKeys(user);
	 password.sendKeys(pass);
	 login.click();
	 
	 
	 
 }

















}
