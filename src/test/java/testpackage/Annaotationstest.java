package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annaotationstest {
	
	
	
	
	@Test(dataProvider = "testData")
	public void test1(String name)
	{
		System.out.println("Inside test1 : " +name);
	}
	
	@Test
	@Parameters({"Username","Password"})
	public void test2(String username, String pass)
	{
		System.out.println("UserName: " + username);
		System.out.println("Password: " + pass);
	}
	
	@Test(priority = 2)
	public void test3()
	{
		System.out.println("Test3");
	}
	
	
	@BeforeSuite
	public void testbs()
	{
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void testbt()
	{
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void testClass()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void testMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	
	@AfterSuite
	public void testAfs()
	{
		System.out.println("AfterSuite");
	}
	
	@AfterTest
	public void tesAft()
	{
		System.out.println("AfterTest");
	}
	
	@AfterClass
	public void testAfClass()
	{
		System.out.println("AfterClass");
	}
	
	@AfterMethod
	public void testAfMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@DataProvider(name="testData")
	public static String[] testProvider()
	{
		String[] testString = {"Ram", "Somu", "Geetha", "Sitha"};
		
		return testString;
	}
	

}
