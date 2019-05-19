package Ttestpackage;

 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelinium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\java\\Selinium\\drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get(" https://www.fb.com");
      String title=driver.getTitle();
     String Url= driver.getCurrentUrl();
		System.out.println(Url+" "+title);
		System.out.println(Url);
		driver.close();
		
}
} 