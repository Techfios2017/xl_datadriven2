package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Techfios_homepage {

	@FindBy(how=How.XPATH,using=".//*[@id='side-menu']/li[5]/a")
	WebElement bankcash;


	@FindBy(how=How.XPATH,using=".//*[@id='side-menu']/li[5]/ul/li[1]/a")
	WebElement new_account;

	
public void click_Account(){
	
	bankcash.click();
	new_account.click();	
	
	
}


}
