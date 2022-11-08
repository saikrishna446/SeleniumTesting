package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestng {

	@Test
	@Parameters({ "browser" })
	public void lanchbrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\saikrishna.vandanapu\\OneDrive - Qentelli\\Documents\\CCST\\Selenium\\seleniumTesting\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://demo.automationtesting.in/Register.html");

			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("firefox")) {
			//WebDriver driver = new FirefoxDriver();
			System.out.println("This is firefox browser");
		} else if (browser.equalsIgnoreCase("edge")) {
			//WebDriver driver = new EdgeDriver();
			System.out.println("This is edge browser");

		}
	}
}
