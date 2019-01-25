package MobileProgrammingLLC.PageLibraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Flipkart_MobilePLP {
	public Flipkart_MobilePLP(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//div[@class='_nZXcO']/div[2]/div/div/a/div/div/div[2]/div[1]/div/div") WebElement FirstResultLnk;
	//div[@class='_2DArFC']
	@FindBy(xpath="//a[contains(@href,'dl.flipkart.com')]") WebElement FirstResultLnk;
	public WebElement getFirstResultLnk() {
		return FirstResultLnk;
	}
}
