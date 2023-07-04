package elementRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocaters {
	
	@FindBy(id="username")
	private WebElement usernameTB;
	@FindBy(name="pwd")
	private WebElement passwordTB;
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginButton;
	
	public LoginLocaters(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getusernameTB() {
		
		
		return usernameTB;
	}
	
	public WebElement getpasswordTB() {
		
		return passwordTB;
	}
	
	public WebElement getloginButton() {
		
		return loginButton;	
	}
	
	public void loginApp(String username,String password) {
		
		getusernameTB().sendKeys(username);
		getpasswordTB().sendKeys(password,Keys.RETURN);
		//getloginButton().click();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
