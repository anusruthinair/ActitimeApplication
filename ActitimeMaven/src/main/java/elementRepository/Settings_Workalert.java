package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_Workalert {
	
	@FindBy(className ="popup_menu_button_settings")
	private WebElement settingIcon;
	
	@FindBy(xpath ="//a[text()='Types of Work']")
	private WebElement tywork;
	
	@FindBy(xpath = "//span[text()='Create Type of Work']")
	private WebElement createtybtn;
	
	@FindBy(name = "name")
	private WebElement workname;
	
	@FindBy(xpath = "//td[@id='ButtonPane']/input[2]")
	private WebElement cancelWk;
	
	public Settings_Workalert(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getSettingIcon() {
		return settingIcon;
	}

	public WebElement getTywork() {
		return tywork;
	}

	public WebElement getCreatetybtn() {
		return createtybtn;
	}

	public WebElement getWorkname() {
		return workname;
	}

	public WebElement getCancelWk() {
		return cancelWk;
	}
	
 public void workAlert(String wname) {
	getSettingIcon().click();
	getTywork().click();
	getCreatetybtn().click();
	getWorkname().sendKeys(wname);
	getCancelWk().click();
     }	
	
}
