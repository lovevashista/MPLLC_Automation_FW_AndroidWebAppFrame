package MobileProgrammingLLC.PageLibraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Amazon_MobileHomePage {
	public Amazon_MobileHomePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='nav-hamburger-menu']") WebElement hamburgMenuLink;
	public WebElement gethamburgMenuLink() {
		return hamburgMenuLink;
	}
	
	@FindBy(xpath="//a[@href='/gp/aw/ya?ref=navm_em_mobile_menu_account']") WebElement accountBtn;
	public WebElement getaccountBtn() {
		return accountBtn;
	}
	
	@FindBy(xpath="//div[text()='\n" + "              Sign In\n" + "            ']") WebElement signInlink;
	public WebElement getsignInlink() {
		return signInlink;
	}
}
