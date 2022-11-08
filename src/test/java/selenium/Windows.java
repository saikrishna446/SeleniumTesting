package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {

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
		
		driver.findElement(By.xpath("//a[@href='Windows.html']")).click();
		
		Thread.sleep(2000);
		String parentwindow= driver.getWindowHandle();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[@href='#Seperate']")).click();
		
		driver.findElement(By.xpath("//div[@id='Seperate']//button")).click();
		Thread.sleep(2000);
		
		//System.out.println(driver.getTitle());
		
		Set<String> child= driver.getWindowHandles();
		
		Iterator<String> itr = child.iterator();
		String firstwindow= itr.next();
		String second=itr.next();
		driver.switchTo().window(second);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.switchTo().window(firstwindow);
		System.out.println(driver.getTitle());
		
		
		
	}

}
