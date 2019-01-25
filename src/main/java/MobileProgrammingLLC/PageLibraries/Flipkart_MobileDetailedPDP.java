package MobileProgrammingLLC.PageLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_MobileDetailedPDP {
	public Flipkart_MobileDetailedPDP(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//tr/td[2]/h3") WebElement ProductNameOnDetailedPDP;
	public WebElement getProductNameOnDetailedPDP() {
		return ProductNameOnDetailedPDP;
	}
}
