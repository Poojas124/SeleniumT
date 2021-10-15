package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Poojasa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","C:\\Users\\poojasa\\eclipse-selenium\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://google.com");
	Thread.sleep(3000);
driver.quit();	

	}

}
