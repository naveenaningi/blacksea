package Ttestpackage;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Selenium4 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\java\\Selinium\\drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://www.google.com");
      driver.navigate().to("www.facebok.com");
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().back();
      driver.navigate().refresh();
      
      TakesScreenshot ts = (TakesScreenshot) driver;
     File srcFile= ts.getScreenshotAs(OutputType.FILE);
     File destFile = new File("F:\\java\\Selinium\\screenshot\\google.png");
     Files.copy(srcFile,destFile);
     driver.close();
}
	}

