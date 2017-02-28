import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.FirefoxDriverProvider;




public class testClass {
	
	@Test
	public void method(){
		
		System.out.println("Hello");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\senth\\Downloads\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		driver.get("http://tamil.oneindia.com/");
		
		System.out.println(driver.getTitle());
	}

}
