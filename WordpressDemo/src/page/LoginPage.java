package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(how=How.ID,using="user_login")
	WebElement username;
	
	@FindBy(how=How.CSS,using="#user_pass")
	WebElement password;
	
	@FindBy(how=How.CSS, using="#wp-submit")
	WebElement submit_button;
	
	@FindBy(how=How.CSS, using="#rememberme")
	WebElement remember_me_chk_box;
	
	@FindBy(how=How.CSS,using="#nav>a")
	WebElement forget_password;
	
	
	public void login_demo(String uName, String pWord){
		
		//it will always wait for 10 seconds(implicit wait)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//wait until 10 seconds for the element to exist(explicit wait)
		WebDriverWait wait = new WebDriverWait(driver, 10);		 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("user_login")));
		
		username.sendKeys(uName);
		password.sendKeys(pWord);
		submit_button.click();
	}
	
	
	

}
