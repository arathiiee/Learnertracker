package com.learner.pages;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class LearnerForm {


		public LearnerForm(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		   WebDriver driver;
	       @FindBy(xpath="//a[@href='/tadd']/button")
	       private WebElement Add;
	       @FindBy(xpath="//*[@id='learnerid']")
	       private WebElement learnerId;
	       @FindBy(xpath="//*[@id='name']")
	       private WebElement name ;
	       @FindBy(xpath="//select[@name='course']")
	       private WebElement course;
	       @FindBy(xpath="//select[@name='project']")
	       private WebElement project;
	       @FindBy(xpath="//select[@name='batch']")
	       private WebElement batch ;
	       @FindBy(xpath="//select[@name='cstatus']")
	       private WebElement status ;
	       @FindBy(xpath="//button[text()='Submit']")
	       private WebElement Submit ;
	       @FindBy(xpath="//button[text()='OK']")
	       private WebElement ok;
	       
	       
	       
	       public void add() throws InterruptedException{  
	    	JavascriptExecutor js=((JavascriptExecutor)driver);
	   		js.executeScript("arguments[0].click();",Add);
	   	    Thread.sleep(3000);
	       }
	       
	       
		   public void sendKeys(String id,String Name,int Course,int Project,int Batch,int cstatus) throws InterruptedException {
			learnerId.clear();
			learnerId.sendKeys(id);
			name.clear();
			name.sendKeys(Name);
			Thread.sleep(3000);
			Select dropdown=new Select(course);
			dropdown.selectByIndex(Course);
			
			Select dropdown1=new Select(project);
			dropdown1.selectByIndex(Project);
			
			Select dropdown2=new Select(batch);
			dropdown2.selectByIndex(Batch);
			
			Select dropdown3=new Select(status);
			dropdown3.selectByIndex(cstatus);
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
		    js.executeScript("arguments[0].click();",Submit);
		   	Thread.sleep(3000);
		   }
		   	
		   	public void clickOk()
		   	{
		   		ok.click();
		   	}
		   	
			
		   
			
				
	
}
