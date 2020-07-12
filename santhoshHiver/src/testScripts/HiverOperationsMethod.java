package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import supportLibraries.CommonFunctions;
import supportLibraries.MasterClass;
import supportLibraries.ObjectRepository_Hiver;


public class HiverOperationsMethod extends MasterClass {

	CommonFunctions cf=new CommonFunctions();
	ObjectRepository_Hiver hiver=new ObjectRepository_Hiver();
	
	public void hiverlaunch() {
	
		try {
		//click hiver
			cf.sleep(10000);
	cf.expwait(hiver.HiverLoginIcon);
	driver.findElement(hiver.HiverLoginIcon).click();
	cf.print("click login to hiver icon", "user clicks Hiver icon");
	
	//click login to hiver
	cf.expwait(hiver.HiverLoginbutton);
	driver.findElement(hiver.HiverLoginbutton).click();
	cf.print("click Login to Hiver", "user clicks Login to Hiver button");
	cf.sleep(5000);
	
	//click on hiver gear
	cf.expwait(hiver.Hivergear);
	driver.findElement(hiver.Hivergear).click();
	cf.print("click HIver Gear", "user clicks HiverGear");
	
	//click on admin panel
	cf.expwait(hiver.adminPanelbutton);
	driver.findElement(hiver.adminPanelbutton).click();
	cf.print("click Admin panel", "User clicks admin panel");
	cf.sleep(10000);
	
	

	
	}catch(Exception e) {
		
		cf.print("exception", "exception in hiver login method " + e);
	}
	
	}
	public void validateDashboard() {
		
		try {
		//selecct shared mailbox from the list
			//selecct shared mailbox from the list
			//dashboardview
			//cf.expwait(hiver.outerFrame);
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			driver.switchTo().frame(driver.findElement(hiver.outerFrame));
			Thread.sleep(10000);
		//switching into frame
			cf.expwait(hiver.dashFrame);
			driver.switchTo().frame(driver.findElement(hiver.dashFrame));
		//	cf.expwait(hiver.viewDash);
			cf.sleep(4000);

//click shared mailbox from left panel view
     cf.jsClick(driver.findElement(hiver.sharedmailbox));
		cf.print("click created shared mailbox", "user clicks created shared mailbox");
		Thread.sleep(8000);
		//selecting on already created shared mailbox
		cf.jsClick(driver.findElement(hiver.clickSharedMailBox));
		cf.print("click shared mail", "user clicks created shared mail");
		cf.sleep(10000);
		//click autoresponder
		cf.jsClick(driver.findElement(hiver.autoResponder));
		cf.print("click auto responder", "user clicks auto responder");
		Thread.sleep(5000);
		
		//clicking only if toggle is off
		WebElement togg= driver.findElement(hiver.toggleMail);
		String onoff= togg.getAttribute("class");
		
		if(onoff.contains("on")) {
			cf.print("check toggle On", "Toggle already ON");

		}
		else {
			cf.jsClick(togg);
			cf.print("click toggle","Clicked on Toggle");
		}
		//entering text
		cf.sleep(5000);
		driver.switchTo().frame(driver.findElement(hiver.txtFrame));
		WebElement tbox=driver.findElement(hiver.txtBox);
		cf.jsClick(tbox);
		cf.print("click text box", "clicking on text box to enter text");
	//	Actions action=new Actions(driver);
	//	action.moveToElement(tbox).sendKeys(" this is a test!!").build().perform();
		driver.findElement(hiver.txtBox).sendKeys("  New text");

		cf.print("entering text", "enter text inside editor");
		cf.sleep(5000);
		
		//clicking save
		driver.switchTo().defaultContent();
		cf.sleep(5000);
		driver.switchTo().frame(driver.findElement(hiver.outerFrame));
		cf.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(hiver.dashFrame));	
		
		cf.jsClick(driver.findElement(hiver.saveButton));
		cf.print("click save", "user clicks save button");
		cf.sleep(5000);

		//get toast mesage
		String toast=driver.findElement(hiver.getToast).getText();
cf.print("toast message", "Toast message received as :  "+toast );
cf.sleep(5000);
		

		}catch(Exception e) {
		cf.print("exception", "exceptionin validationDashboard "+e);
	}
	}		
}
