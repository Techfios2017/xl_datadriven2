package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewProductPage {
	
WebDriver driver;
	
	public NewProductPage(WebDriver ldriver){
		
		this.driver=ldriver;
}

	@FindBy(how=How.ID,using="name")
	 WebElement Prodname;
	 
	 @FindBy(how=How.ID,using="sales_price")
	 WebElement SalesPrice;
	 
	 @FindBy(how=How.ID, using="item_number")
	 WebElement item_number;
	 
	 @FindBy(how=How.ID, using="description")
	 WebElement Description;
	  
	 @FindBy(how=How.ID,using="submit")
	 WebElement submit_button;


	 public void AddingNewProductInfo(String name,String price,String itemnumber,String Desc)
	 {		 
	 Prodname.sendKeys(name);
	 SalesPrice.sendKeys(price);
	 item_number.sendKeys(itemnumber);
	 Description.sendKeys(Desc);
	 submit_button.click(); 
	 
	 }






}
