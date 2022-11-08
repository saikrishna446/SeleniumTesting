package selenium;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testng2 {

	@BeforeSuite
	public void lauchbrowser() {
		System.out.println(" this is browser lanching code");
	}

	@Test
	public void zbc() {

		System.out.println("This is the test1 method");
	}

	@Test
	public void zba() {

		System.out.println("This is the zbc method");
	}

	@Test(priority = 2)
	public void test2() {
		System.out.println("This is the test2 method");

	}

	@Test(priority = 1)
	public void test3() {
		System.out.println("This is the test3 method");

	}

	@Test(priority = 0, enabled = false)
	public void test4() {
		System.out.println("This is the test4 method");

	}

	@Test(priority = -1)
	public void test5() {
		System.out.println("This is the test5 method");

	}

	@Test(priority = 6)
	public void test6() {
		System.out.println("This is the test6 method");

	}

	@Test(priority = 7)
	public void test7() {
		System.out.println("This is the test7 method");

	}

	@Test(priority = 8)
	public void test8() {
		System.out.println("This is the test8 method");

	}

	@AfterSuite
	public void closebrowser() {
		System.out.println("Closing browser");
	}
}
