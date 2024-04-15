package com.learner.pages;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class TrainerDashboard {

		public TrainerDashboard(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		WebDriver driver;
	    
	    @FindBy(xpath="//tbody/tr[2]//button[@type='button' and @class='btn btn-success']")
		private WebElement editButton;
	    //@FindBy(xpath="//tbody/tr[2]//button[@type='button' and @class='btn btn-success']")
		//private WebElement deleteButton;
	    @FindBy(xpath="//*[@id='basic-nav-dropdown']")
	    private WebElement Trainer;
	    @FindBy(xpath="//*[text()='Logout']")
	    private WebElement logout;
	    
	    
	    public void csvbtn() throws InterruptedException {
		 		
			
			 editButton.click();
			 Trainer.click();
		   	 Thread.sleep(3000);
			 logout.click();
	    }
	
}
