package selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 {

	
	@BeforeSuite
	public void test1() {
		System.out.println("This is before suite method");
	}
	@BeforeTest
	public void test3() {
		System.out.println("This is @BeforeTest method");
	}
	@BeforeClass
	public void test2() {
		System.out.println("This is @BeforeClass method");
	}
	
	@BeforeMethod
	public void test4() {
		System.out.println("This is @BeforeMethod");
	}
	
	@Test(enabled = true)
	public void test5() {
	
		System.out.println("This is my test5 methos");
	}
	@Test
	public void test10() {
	
		System.out.println("This is my test10 methos");
	}
	@AfterSuite
	public void test6() {
		System.out.println("This is @AfterSuite suite method");
	}
	@AfterTest
	public void test7() {
		System.out.println("This is @@AfterTest method");
	}
	@AfterClass
	public void test8() {
		System.out.println("This is @AfterClass method");
	}
	
	@AfterMethod
	public void test9() {
		System.out.println("This is @@AfterMethod");
	}

}
