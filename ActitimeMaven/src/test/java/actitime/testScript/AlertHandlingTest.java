package actitime.testScript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actitime.genericLib.BaseClass;
import elementRepository.Settings_Workalert;

@Listeners(actitime.genericLib.ListernerImplementation.class)
public class AlertHandlingTest extends BaseClass{
	@Test(groups={"system"})
	public void Handlealert()throws IOException {
		
		String workname = du.getDataFromExcelsheet("Sheet3", 0, 0); // customer name
	    int rnum =cu.getRandomNum();
	    workname = workname+rnum;
		Settings_Workalert sw = new Settings_Workalert(driver);
		sw.workAlert(workname);
		
		String displayalert=cu.getAlertinfo(driver);
	    cu.alert_agree(driver);	
	    System.out.println(displayalert);
	    Assert.assertTrue(displayalert.contains("cancel the Type"));
	    Reporter.log("Alert TC Pass", true);
	     }

	}
