package com.learner.pages;



	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

	public class PofficerDashboard {

		

		public PofficerDashboard(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	      WebDriver driver;
	      @FindBy(xpath="//tbody/tr[2]//button[@class='btn btn-success btn btn-primary']")
	  	  private WebElement Updatebtn;
	      @FindBy(xpath="//select[@name='pstatus']")
	      private WebElement pstatus;
	      @FindBy (xpath="//button[text()='Submit']")
	      private WebElement submitbtn;
	      @FindBy(xpath="//*[@id='basic-nav-dropdown']")
	      private WebElement officer;
	      @FindBy(xpath="//*[@id='basic-navbar-nav']")
	      private WebElement Logout;
	      
	      public void update()
	      {
	    	  JavascriptExecutor js=((JavascriptExecutor)driver);
				js.executeScript("arguments[0].click();",Updatebtn);
			
	      }
	      public void input(int Pstatus) throws InterruptedException
	      {
	    	  Select dropdown=new Select(pstatus);
				dropdown.selectByIndex(Pstatus);
				submitbtn.click();
				Thread.sleep(3000);
				
	      }
	      public void Logout()
	      {
				officer.click();
				Logout.click();
			
	      }
	      
	      
	      
	      
	
}
