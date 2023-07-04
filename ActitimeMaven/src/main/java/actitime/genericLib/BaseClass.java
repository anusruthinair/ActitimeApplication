package actitime.genericLib;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import elementRepository.LoginLocaters;
import elementRepository.LogoutLocators;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.openqa.selenium.edge.EdgeDriver;
*/

public class BaseClass {
  //@BeforeSuite(alwaysRun=true)
  //@BeforeMethod(alwaysRun=true)
  //@AfterMethod(alwaysRun=true)
  //@AfterClass(alwaysRun=true)
	public WebDriver driver;
	public DataUtility du = new DataUtility();
	public CommonUtility cu = new  CommonUtility();
	public static WebDriver listenerdriver;
	/*String a="chrome";
	String b="chrome";	
	public boolean cdn = a.equals(b);
	*/
	@BeforeClass(alwaysRun=true)
	public void launchBrowser() 
	{
	driver = new ChromeDriver();
	listenerdriver=driver;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
    }
	
	
	/*
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(String browser)  
	{
		if(browser.equals("chrome"))
			driver = new ChromeDriver();
		else
			driver = new EdgeDriver();
			
	listenerdriver=driver;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
    }
	*/
	 @BeforeMethod(alwaysRun=true)
	  public void login()throws IOException  
	  {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get(du.getDatafromProperties("Url"));
			LoginLocaters ll = new LoginLocaters(driver);
			ll.loginApp(du.getDatafromProperties("Username"),du.getDatafromProperties("Password"));
			/*
			driver.findElement(By.cssSelector(".textField"))
			 .sendKeys(du.getDatafromProperties("Username"),Keys.TAB,
			  du.getDatafromProperties("Password"),Keys.RETURN);
			  */	
	  }
	 
	 /*
  @Parameters({"url","username","password"})
  @BeforeMethod(alwaysRun=true)
  public void login(String url,String username,String password)throws IOException  
  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		//driver.get(du.getDatafromProperties("Url"));
		driver.findElement(By.cssSelector(".textField"))
		.sendKeys(username,Keys.TAB,password,Keys.RETURN);
		
			
  }*/
  
 
  @AfterClass(alwaysRun=true)
  public void closeBrowser() 
  {
	driver.close();
	Reporter.log("TestScript Pass", true);
    }
}




/*
public String ch = "1";
public void browsersettings() {
	System.out.println("1.Single Browser or 2.Cross Browser \n Enter Execution No.:");
	Scanner sc = new Scanner(System.in);
	ch=sc.next();
}
public boolean ats = ch.equals("1"); 
*/