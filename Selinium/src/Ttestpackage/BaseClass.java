package Ttestpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BaseClass {
		static {
		System.setProperty("webdriver.gecko.driver","F:\\java\\Selinium\\drivers\\geckodriver.exe");
	}
		public static FirefoxProfile profile = new FirefoxProfile();
		public static WebDriver driver = new FirefoxDriver();
	}


