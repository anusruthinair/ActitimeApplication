package actitime.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import actitime.genericLib.BaseClass;
import elementRepository.Settings_General_Sett;

@Listeners(actitime.genericLib.ListernerImplementation.class)
public class DropDownHandlingTest extends BaseClass {
	@Test(groups={"smoke","system"})
	public void GeneralSettings() {
		    Settings_General_Sett gs = new Settings_General_Sett(driver);
		    WebElement dropdown = gs.dropDnAction();
		    cu.getSelectVisibleText(dropdown, "Product Line");
		   
		    System.out.println(gs.getModified().getText());
		    Assert.assertTrue((gs.getModified().getText()).contains("MODIFICATIONS"));
		    Reporter.log("Dropdown TC Pass", true);
	  }


	@AfterMethod(dependsOnMethods = "logout")
	public void discard() {
		cu.textToBePresentWait(driver, By.id("ConfirmWarning"), "Warning! You modified general settings, but did not save them.");
		Settings_General_Sett.discard(driver);
	       }

	}

