package Ttestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FireDemo{
	
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","F:\\java\\Selinium\\drivers\\geckodriver.exe");
	FirefoxProfile profile = new FirefoxProfile();
	//url - http://kb.mozillazine.org/About:config_entries#Browser
	String key ="browser.helperApps.neverAsk.saveTodisk";
	String value="app;ication/zip";
	profile.setPreference(key, value);
	FirefoxOptions option = new FirefoxOptions();
	option.setProfile(profile);
	WebDriver driver = new FirefoxDriver(option);
	driver.get("https://www.seleniumhq.org/download/");
	//click on download link aginst java
	WebElement element = driver.findElement(By.xpath("//td[text()='Java']//following-sibling::td[3]/a"));
	element.click();
	
	
	
}
}
