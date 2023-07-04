package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutLocators {
	
	public LogoutLocators(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}
	
	public void logoutApp() {
		getLogout().click();
		
	}

}
