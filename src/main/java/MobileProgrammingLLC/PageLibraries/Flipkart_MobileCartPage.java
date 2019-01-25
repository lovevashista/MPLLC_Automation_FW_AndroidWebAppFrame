package MobileProgrammingLLC.PageLibraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Flipkart_MobileCartPage {
	public Flipkart_MobileCartPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@data-aid='Product_TITLE']") WebElement ProductTitleOnCartPage;
	public WebElement getProductTitleOnCartPage() {
		return ProductTitleOnCartPage;
	}
	
}
