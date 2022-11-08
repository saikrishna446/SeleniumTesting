package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngGroups {

	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("This is test1 method");
		Assert.assertEquals("saikrishna", "hemanth");
	}
	@Test(groups = {"smoke"})
	public void test2() {
		System.out.println("This is test2 method");
	}
	@Test(groups = {"regression"})
	public void test3() {
		System.out.println("This is test3 method");
	}
	@Test(groups = {"regression"})
	public void test4() {
		System.out.println("This is test4 method");
	}
}
