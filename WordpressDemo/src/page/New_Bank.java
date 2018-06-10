package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class New_Bank {

WebDriver driver;
	
	public New_Bank(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.ID,using="account")
	WebElement account;


	@FindBy(how=How.ID,using="description")
	WebElement Description;
	
	
	@FindBy(how=How.ID,using="balance")
	WebElement Balance;
	
	@FindBy(how=How.XPATH,using=".//*[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement submit;	
	
	
	public void select_account(String account_title,String Desc,String balan){
		
		account.sendKeys(account_title);	
		Description.sendKeys(Desc);
		Balance.sendKeys(balan);
	    submit.click();
	
	}

	
	
	
}
