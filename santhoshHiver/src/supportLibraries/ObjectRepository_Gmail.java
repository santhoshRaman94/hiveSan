package supportLibraries;

import org.openqa.selenium.By;

public class ObjectRepository_Gmail {

//all the objects of Gmail
	public static By GmailUsername=By.xpath("*//input[@type='email']");
	public static By GmailNextButton=By.id("identifierNext");
	public static By GmailPassword=By.xpath("*//input[@type='password']");
	public static By GmailPasswordNext=By.id("passwordNext");
	public static By expandGoggleApp=By.xpath("*//a[@aria-label='Google apps' and @href='https://www.google.co.in/intl/en/about/products?tab=kh']");
	public static By clickGmailapp=By.xpath("*//span[contains(text(),'Gmail')]//parent::a");
	
}
