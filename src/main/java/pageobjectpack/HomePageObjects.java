package pageobjectpack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



	public class HomePageObjects extends BaseObjects {

		@FindBy(xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Women']")
		private WebElement womentab;

		@FindBy(xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Dresses']")
		private WebElement dressestab;

		@FindBy(xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='T-shirts']")
		private WebElement tshirttab;

		
		@FindBy(xpath = "//*//div[@id='center_column']/*/*//Span[contains(text(),'Women')]")
		private WebElement navigatedtowomen;
		
		@FindBy(xpath = "//*//div[@id='center_column']/*/*//Span[contains(text(),'Dresses')]")
		private WebElement navigatedtodresses;
		
		@FindBy(xpath = "//*//div[@id='center_column']/*/*//Span[contains(text(),'T-shirts')]")
		private WebElement navigatedtotshirts;
		
		@FindBy(xpath = "//*[@id='newsletter-input']")
		private WebElement newsletter;
					
		@FindBy(xpath = "//*[@id='newsletter_block_left']/*//button[@type='submit']")
		private WebElement newlettersubmit;
		 
		public HomePageObjects() {
			PageFactory.initElements(driver, this);
		}

		public boolean iswomentabpresent()
		{
			return elementFound(womentab);
				
		}
		public boolean isdresstabpresent()
		{
			return elementFound(dressestab);
		
		}
		public boolean istshirttabpresent()
		{
			return elementFound(tshirttab);
		
		}		
		public void clickwomentab()
		{
			womentab.click();
		}
		
		public boolean isnavigatedtowoman()	
		{
			      					
			return elementFound(navigatedtowomen);
		
		}
		public void clickdresstab()
		{
			dressestab.click();
		}
		
		public boolean isnavigatedtodresses()	
		{
			      					
			return elementFound(navigatedtodresses);
		}
		
		public void clicktshirttab()
		{
			tshirttab.click();
		}
		
		public boolean isnavigatedtotshirts()	
		{
			      					
			return elementFound(navigatedtotshirts);
		}
		
		
		public boolean issubscriptiontextpresent()		
		{
			return elementFound(newsletter);
		}
		
		public void enteringvalidmail()
		{
			newsletter.click();
			newsletter.sendKeys("lokeshforall@gmail.com");
			newlettersubmit.click();
		}
		
	}


