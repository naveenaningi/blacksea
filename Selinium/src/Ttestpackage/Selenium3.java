package Ttestpackage;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\java\\Selinium\\drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://www.google.com");
      WebElement src = driver.findElement(By.name("q"));
      driver.findElement(By.name("q")).sendKeys("goa beach");
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_ENTER);
	}
	}


