package executeHiver;


import org.testng.annotations.Test;

import supportLibraries.MasterClass;
import testScripts.GmailMethods;
import testScripts.HiverOperationsMethod;

public class Tc1 extends MasterClass
{

	GmailMethods gmail=new GmailMethods();
	HiverOperationsMethod hiver=new HiverOperationsMethod();
	
	@Test
	public void executeAssignment()
	{
		//Going to Gmail
		gmail.loginGmail();
		//Switching to my mail box
		gmail.switchToMailBox();
		
		
		//click hiver gear
		hiver.hiverlaunch();
		
		//validateDashboard
		hiver.validateDashboard();
		
	}
	

}
