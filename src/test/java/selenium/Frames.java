package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saikrishna.vandanapu\\OneDrive - Qentelli\\Documents\\CCST\\Selenium\\seleniumTesting\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));

		action.moveToElement(ele).build().perform();

		Thread.sleep(2000);

		// a[@href='Static.html']

		action.moveToElement(driver.findElement(By.xpath("//a[@href='Frames.html']"))).click().build().perform();

		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.id("singleframe")));

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Saikrishna");

		driver.switchTo().defaultContent();
//
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();

	}

}
