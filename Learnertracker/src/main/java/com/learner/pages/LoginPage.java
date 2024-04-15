package com.learner.pages;



	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
		
		
		WebDriver driver;
		@FindBy(xpath="//*[@id='username']")
		private WebElement Username;
		@FindBy(xpath="//*[@id='password']")
		private WebElement Password;
		@FindBy(xpath="//button[text()='Login']")
		private WebElement login;
		
		
		public LoginPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		public void inputmsg(String uname, String pword) throws InterruptedException {
			Username.sendKeys(uname);
			Password.sendKeys(pword);
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();",login);
		    Thread.sleep(3000);
		}

	
}
