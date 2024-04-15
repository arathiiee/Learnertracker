package com.learner.pages;

import org.testng.annotations.Test;

public class TestClass extends BaseClass{
		
		
		LoginPage lobj;
		LearnerForm formobj;
		TrainerDashboard trainobj;
		PofficerDashboard pofficerobj;
		@Test(priority=1)
		public void validate() throws InterruptedException
		{
			lobj=new LoginPage(driver);
			lobj.inputmsg("trainer","trainer@123");
			
			
		}
		
		@Test(priority=3)
		public void learnerform() throws InterruptedException
		{
			formobj=new LearnerForm(driver);
			formobj.sendKeys("Ar-1","Akhil", 1, 3, 2, 1);
			formobj.clickOk();
		}
 	@Test(priority=2)
		public void invalidform() throws InterruptedException
		{
 		formobj=new LearnerForm(driver);
 		formobj.add();
		formobj.sendKeys("","Akhil", 1, 3, 2, 0);
		driver.navigate().refresh();
		}
		@Test(priority=4)
		public void uploadfile() throws InterruptedException
		{
			trainobj=new TrainerDashboard(driver);
			trainobj.csvbtn();
			
		}
		
		@Test(priority=5)
		public void pofficerlogin() throws InterruptedException
		{
		     lobj.inputmsg("pofficer", "pofficer@123");	
		}
		@Test(priority=6)
		public void update() throws InterruptedException {
			pofficerobj=new PofficerDashboard(driver);
		    pofficerobj.update();
		    pofficerobj.input(1);
		    pofficerobj.Logout();
		}
//
//	
}
