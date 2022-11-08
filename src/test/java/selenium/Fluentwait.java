package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saikrishna.vandanapu\\OneDrive - Qentelli\\Documents\\CCST\\Selenium\\seleniumTesting\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get("https://demo.automationtesting.in/Register.html");
		driver.navigate().to("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(Exception.class);
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.name("lastname"));
			}
		});
		
		clickseleniumlink.sendKeys("saikrisj");
//		 Object element = wait.until(new Function<WebDriver, WebElement>() {
//	            public WebElement apply(WebDriver driver) {
//	                return driver.findElement(By.name("lastname"));
//
//	            }
//	        });
//	        ((WebElement) element).sendKeys("Martin");
	}

}
