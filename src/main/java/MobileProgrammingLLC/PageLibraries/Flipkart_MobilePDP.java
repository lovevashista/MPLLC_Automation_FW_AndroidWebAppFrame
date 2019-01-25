package MobileProgrammingLLC.PageLibraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Flipkart_MobilePDP {
	public Flipkart_MobilePDP(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='-vBYKX']/span)[1]") WebElement ProductNameOnPDP;
	public WebElement getProductNameOnPDP() {
		return ProductNameOnPDP;
	}
	
	@FindBy(xpath="//div[@class='_2iUM2T _1bynzW']") WebElement AddToCartBtn;
	public WebElement getAddToCartBtn() {
		return AddToCartBtn;
	}
	
	@FindBy(xpath="(//a[@class='_3NH1qf'])[3]") WebElement CartIcon;
	public WebElement getCartIcon() {
		return CartIcon;
	}
	
	@FindBy(xpath="//div[text()='Product Details']") WebElement ProductDetailsLnk;
	public WebElement getProductDetailsLnk() {
		return ProductDetailsLnk;
	}
}
