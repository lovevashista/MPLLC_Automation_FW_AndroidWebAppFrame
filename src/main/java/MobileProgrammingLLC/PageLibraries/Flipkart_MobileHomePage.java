package MobileProgrammingLLC.PageLibraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Flipkart_MobileHomePage {
	public Flipkart_MobileHomePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@class='_1V3kw-']") WebElement SignInOverlayCloseIcon;
	public WebElement getSignInOverlayCloseIcon() {
		return SignInOverlayCloseIcon;
	}
	
	@FindBy(xpath="(//input[@class='_1eMB9R'])[1]") WebElement SearchTF;
	public WebElement getSearchTF() {
		return SearchTF;
	}
	
	@FindBy(xpath="(//img[@class='_1V3kw-'])[4]") WebElement VoiceSearchCloseIcon;
	public WebElement getVoiceSearchCloseIcon() {
		return VoiceSearchCloseIcon;
	}
	
	@FindBy(xpath="//input[@id='input-search']") WebElement AfterVoiceSearchTF;
	public WebElement getAfterVoiceSearchTF() {
		return AfterVoiceSearchTF;
	}
}
