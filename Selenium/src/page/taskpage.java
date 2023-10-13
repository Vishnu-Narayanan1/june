package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class taskpage {
WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement taskusername;
	@FindBy(id="password")
	WebElement taskpswd;
	@FindBy(id="login-button")
	WebElement taskloginbutton;
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement taskcart;
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	WebElement taskcart1;
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement taskcart2;
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	WebElement taskcart3;
	@FindBy(id="add-to-cart-sauce-labs-onesie")
	WebElement taskcart4;
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement taskcart5;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	@FindBy(id="checkout")
	WebElement checkout;
	@FindBy(id="first-name")
	WebElement frstname;
	@FindBy(id="last-name")
	WebElement lstname;
	@FindBy(id="postal-code")
	WebElement pstlcode;
	@FindBy(id="continue")
	WebElement finish;
	@FindBy(id="finish")
	WebElement finish1;
	@FindBy(id="back-to-products")
	WebElement  home;
	@FindBy(id="react-burger-menu-btn")
	WebElement sidebar;
	@FindBy(id="logout_sidebar_link")
	WebElement logout;


	
	
	
	
	
	
	public taskpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setValues(String username,String pswd ) {
		taskusername.sendKeys(username);
		taskpswd.sendKeys(pswd);
	}
	public void loginClick() {
		taskloginbutton.click();
	}
	public void addcart() {
		taskcart.click();
		taskcart1.click();
		taskcart2.click();
		taskcart3.click();
		taskcart4.click();
		taskcart5.click();
	}
	public void checkout() {
		cart.click();
		checkout.click();
	}
public void setValues2(String firstname,String lastname,String postal) {
	frstname.sendKeys(firstname);
	lstname.sendKeys(lastname);
	pstlcode.sendKeys(String.valueOf(postal));

}
public void finishClick() {
	finish.click();
	finish1.click();
	home.click();
	sidebar.click();
	logout.click();
}
}
