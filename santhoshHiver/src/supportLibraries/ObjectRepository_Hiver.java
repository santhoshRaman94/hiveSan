package supportLibraries;

import org.openqa.selenium.By;

public class ObjectRepository_Hiver extends MasterClass {

	public static By HiverLoginIcon=By.xpath("*//div[@class='hiver-nonLogged-state-con topbar-button topbar-button-set hq-identity']");
	public static By HiverLoginbutton=By.xpath("*//a[contains(text(),'Login to Hiver')]");
	public static By Hivergear=By.xpath("//div[@id='hq-accounts-icon']");
	public static By adminPanelbutton=By.xpath("//div[@data-linktype='admin_panel']");
	public static By outerFrame=By.id("Hiver_iframe_content");
	public static By dashFrame=By.xpath("//*[@id='iframe_handler']");
	public static By viewDash=By.xpath("*//div[contains(text(),'Dashboard')]");
	// //ul[@class='h-reset h-nav-ul']//li[@name='sharedmailbox']//child::*[contains(text(),'Shared')]
	public static By sharedmailbox=By.xpath("//*[@id='root']//ul/li[@name='sharedmailbox']");
	public static By clickSharedMailBox=By.xpath("//span[contains(text(),'name')]//following::span[contains(text(),'Santest.hiver')]");
	
}
