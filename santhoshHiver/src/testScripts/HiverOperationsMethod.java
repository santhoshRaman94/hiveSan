package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
			//dashboardview
			cf.expwait(hiver.outerFrame);
			driver.switchTo().frame(driver.findElement(hiver.outerFrame));
			
			cf.expwait(hiver.dashFrame);
			driver.switchTo().frame(driver.findElement(hiver.dashFrame));
		//	cf.expwait(hiver.viewDash);
			cf.sleep(10000);


       driver.findElement(hiver.sharedmailbox).click();
		cf.print("click created shared mailbox", "user clicks created shared mailbox");
		
		driver.findElement(hiver.clickSharedMailBox).click();
		cf.sleep(10000);
	}catch(Exception e) {
		cf.print("exception", "exceptionin validationDashboard "+e);
	}
	}		
}
