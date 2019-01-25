package MobileProgrammingLLC.Tests;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MobileProgrammingLLC.PageLibraries.Amazon_MobileAccountPage;
import MobileProgrammingLLC.PageLibraries.Amazon_MobileHomePage;
import MobileProgrammingLLC.Resources.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Amazon_SigningIn {
	AndroidDriver<AndroidElement> driver;
	Logger log = LogManager.getLogger(Amazon_SigningIn.class.getName());
	Properties locators = new Properties();
	Properties config = new Properties();
	Properties data = new Properties();
	Amazon_MobileHomePage mhp;
	Amazon_MobileAccountPage map;
	Base b = new Base();
	
	@BeforeClass
	public  void initConfigs() {
		log.info("Initializing Configurations...");
		locators = b.loadLocators();
		config = b.loadConfig();
		data = b.loadData();
		driver = b.createAppiumServerConnection(config.getProperty("ip"),config.getProperty("port"), config.getProperty("DeviceType"));
		b.navigateToSite(driver, config.getProperty("Website"));
		mhp = new Amazon_MobileHomePage(driver);
		map = new Amazon_MobileAccountPage(driver);
		log.info("Configurations Successfully Initialized.");
	}
	
	@Test
	public void navigateToSignInPage() {
		b.flash(mhp.gethamburgMenuLink());
		b.clickOn(mhp.gethamburgMenuLink());
		b.scrollPage(driver);
		b.waitForSometime();
		b.flash(mhp.getsignInlink());
		b.clickOn(mhp.getsignInlink());

	}
	
	@Test(dependsOnMethods= {"navigateToSignInPage"})
	public void verifySignInErrorMsg() {
		b.flash(map.getUserNameTF());
		b.enterContentInto(map.getUserNameTF(), data.getProperty("UserName"));
		b.waitForSometime();
		b.flash(map.getContinueBtn());
		b.clickOn(map.getContinueBtn());
		b.flash(map.geterrorMsg());
		b.compareContent(map.geterrorMsg(), data.getProperty("ErrorMsg"));
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		b.stopAppiumServer();
	}
}
