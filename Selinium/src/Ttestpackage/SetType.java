package Ttestpackage;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SetType  extends BaseClass{
	public static void main(String[] args) {
		driver.get("http://www.google.com");
		List<WebElement> list = driver.findElements(By.tagName("//a"));
		System.out.println(list.getClass().getName());
		driver.get("http://www.naukri.com");
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.getClass().getName());
	}
}