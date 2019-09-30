package testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectpack.BaseObjects;
import pageobjectpack.HomePageObjects;

public class HomePageTest {

	HomePageObjects homePage;
	BaseObjects bp;
    
	public HomePageTest() 
	{
		homePage = new HomePageObjects();
		bp = new BaseObjects();
	}
	
	@Test	
	public void womentabpresence()
	{
		Assert.assertEquals(true,homePage.iswomentabpresent(),"Women Tab is not Present");
		
	}
	
	@Test	
	public void dressestabpresence()
	{
		/*if(homePage.isdresstabpresent())
		{
			System.out.println("dressestab is present");
		}
		else
		{
			System.out.println("dressestab is not present");
		}*/
	Assert.assertEquals(true,homePage.isdresstabpresent(),"Dress Tab is not Present");
	
	}
	
	@Test	
		public void tshirttabpresence()
		{
		Assert.assertEquals(true,homePage.istshirttabpresent(),"T shirts Tab is not Present");
		
	}
	
	@Test
	public void navigatedwomantab()
	{
		homePage.clickwomentab();
		Assert.assertEquals(true,homePage.isnavigatedtowoman(),"Not navigated to womantab");
				
	}
	@Test
	public void navigateddressestab()
	{
		homePage.clickdresstab();
		Assert.assertEquals(true,homePage.isnavigatedtodresses(),"Not navigated to dressestab");
				
	}
	@Test
	
	public void navigatedtshirtstab()
	{
		homePage.clicktshirttab();
		Assert.assertEquals(true,homePage.isnavigatedtotshirts(),"Not navigated to tshirttab");
				
	}
	@Test
	public void verifynewsletter()
	{
		homePage.enteringvalidmail();
		Assert.assertEquals(true,homePage.issubscriptiontextpresent(),"No newslettertab");
	}
	
	
	
	
	
}



