package testScripts;
 
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import supportLibraries.CommonFunctions;
import supportLibraries.MasterClass;
import supportLibraries.ObjectRepository_Gmail;

public class GmailMethods extends MasterClass{

	CommonFunctions cf=new CommonFunctions();
	ObjectRepository_Gmail gmail=new ObjectRepository_Gmail();

	public void loginGmail() {
		try {
        //enter Email Id
		cf.expwait(gmail.GmailUsername);
		driver.findElement(gmail.GmailUsername).sendKeys("santest.hiver@gmail.com");
		cf.print("Enter Username", "User enters email ID");
		cf.sleep(5000);
		
		//click Next Button
		cf.expwait(gmail.GmailNextButton);
		driver.findElement(gmail.GmailNextButton).click();
	
	//	cf.click(gmail.GmailNextButton);
		cf.print("click Next", "user clicks next button after giving email ID");
		cf.sleep(10000);
		
		//enter password
        cf.expwait(gmail.GmailPassword);
		driver.findElement(gmail.GmailPassword).sendKeys("san@hiving0101");
		cf.print("enter password", "user enters password");
		cf.sleep(2000);
	    
		//click Next Button
        cf.expwait(gmail.GmailPasswordNext);
		driver.findElement(gmail.GmailPasswordNext).click();;
		cf.print("click Next", "user clicks next button after giving Password");
		cf.sleep(4000);
		}
		catch(Exception e) {
			cf.print("exception", "exception in Gmaillogin method " + e);
		}
	}
	
	public void switchToMailBox() 
	{
	try {	
		//click expansion option
		cf.expwait(gmail.expandGoggleApp);
		driver.findElement(gmail.expandGoggleApp).click();;
		cf.print("expand Google apps","user expands list of google apps");
		
		//switch into frame
				driver.switchTo().frame(0);
		//click Gmail
		cf.expwait(gmail.clickGmailapp);
		driver.findElement(gmail.clickGmailapp).click();
		cf.print("click Gmail", "user clicks Gmail App");
		
		//switching to new Gmail tab
				Set<String> ab=driver.getWindowHandles();
				Iterator<String> it=ab.iterator();
				while(it.hasNext()) {
					driver.switchTo().window(it.next());
				}
	}catch(Exception e) {
	cf.print("Exception", "Exception to view Gmail mailBox " +e);	
	}
	}
}
