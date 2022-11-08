package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonTestng {

	@Test(dependsOnMethods = {"openbrowser"})
	public void signin() {

		System.out.println("This is signin method");
	}

	@Test
	public void openbrowser() {

		System.out.println("This is openbrowser method");
		//Assert.fail();
	}

	@Test(dependsOnMethods = {"signin"})
	public void quit() {

		System.out.println("this is quit method");
		Assert.fail();
	}
	@Test(dependsOnMethods = {"quit"})
	public void logout() {

		System.out.println("this is logout method");
	}


}
