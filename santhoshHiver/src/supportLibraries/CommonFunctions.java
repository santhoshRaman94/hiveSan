package supportLibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions extends MasterClass{

	public void expwait(By by) {
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void print(String step,String stepDescription) {
		System.out.println("Step: " +step);
		System.out.println("Step Description: " +stepDescription);
		System.out.println();
	}
	
	public void sleep(int sleepTime) {
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

		

	
}
