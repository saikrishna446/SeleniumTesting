package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitwait {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saikrishna.vandanapu\\OneDrive - Qentelli\\Documents\\CCST\\Selenium\\seleniumTesting\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get("https://demo.automationtesting.in/Register.html");
		driver.navigate().to("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
		ele.sendKeys("saikrishna");
		
		//driver.findElement(By.name("lastname")).sendKeys("saikrishna");

		
	}

}
