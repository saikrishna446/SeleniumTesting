package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saikrishna.vandanapu\\OneDrive - Qentelli\\Documents\\CCST\\Selenium\\seleniumTesting\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get("https://demo.automationtesting.in/Register.html");
		driver.navigate().to("https://www.nseindia.com/");

		driver.manage().window().maximize();
		
		List<WebElement> ele= driver.findElements(By.xpath("//table[@id='tab1Ganier']//thead//th"));
		
		System.out.println(ele.size());
		
		for(int i=0;i<ele.size();i++) {
			
			String tableheader= ele.get(i).getText();
			System.out.println(tableheader);
		}
		
      List<WebElement> ele2= driver.findElements(By.xpath("//table[@id='tab1Ganier']//tbody//tr//td[1]"));
		
		System.out.println(ele2.size());
		
		for(int i=0;i<ele2.size();i++) {
			
			String tableheader= ele2.get(i).getText();
			System.out.println(tableheader);
			if (tableheader.equalsIgnoreCase("LT")) {
				System.out.println("The test is pass");
				ele2.get(i).click();
			}
			
		}

	}

}
