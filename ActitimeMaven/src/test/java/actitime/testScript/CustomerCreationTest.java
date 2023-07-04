package actitime.testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import actitime.genericLib.BaseClass;
import elementRepository.Task_TabCustomer;

@Listeners(actitime.genericLib.ListernerImplementation.class)
public class CustomerCreationTest extends BaseClass{
	@Test(groups={"smoke"})
	public void customerCreateion() throws IOException {
		
		String customername = du.getDataFromExcelsheet("Sheet2", 0, 0); // customer name
	    int rnum =cu.getRandomNum();
	    customername = customername+rnum;
	    String description=du.getDataFromExcelsheet("Sheet2", 0, 1); // Description
		Task_TabCustomer ttc = new Task_TabCustomer(driver);																
			
		    ttc.tasktabIcon();
			ttc.customerGenrateAction(customername, description);
			cu.textToBePresentWait(driver, By.cssSelector(".titleEditButtonContainer>.title"), customername);
			String displayName = ttc.nameFinal();
			System.out.println(displayName);
			
			Assert.assertEquals(customername, displayName);
			Reporter.log("Genrate customer TC Pass",true);
 }
}