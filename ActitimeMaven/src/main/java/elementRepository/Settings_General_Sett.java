package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_General_Sett {
	
	@FindBy(className ="popup_menu_button_settings")
	private WebElement settingIcon;
	
	@FindBy(id="popup_menu_item_6")
	private WebElement genSetting;
	
	@FindBy(id="firstHierarchyLevelCodeSelect")
	private WebElement toplvl;
	
	@FindBy(className = "modified")
	private WebElement mofmsg;
	
	@FindBy(id="DiscardChangesButton")
	private WebElement discard;
	
	public Settings_General_Sett(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSettingIcon() {
		return settingIcon;
	}

	public WebElement getGenSetting() {
		return genSetting;
	}

	public WebElement getToplvl() {
		return toplvl;
	}

	
	public WebElement getModified() {
		return mofmsg;
	}


	public WebElement getDiscard() {
		return discard;
	}

	
	public WebElement dropDnAction() {
		getSettingIcon().click();
		getGenSetting().click();
		getToplvl().click();
		return getToplvl();
	}
	
	

	
	
	
	public void setSettingIcon(WebElement settingIcon) {
		this.settingIcon = settingIcon;
	}
	
	public void setGenSetting(WebElement genSetting) {
		this.genSetting = genSetting;
	}
	
	public void setToplvl(WebElement toplvl) {
		this.toplvl = toplvl;
	}
	
	public void setMofmsg(WebElement mofmsg) {
		this.mofmsg = mofmsg;
	}

	public static void discard(WebDriver driver) {
		Settings_General_Sett sg = new Settings_General_Sett(driver);
		sg.getDiscard().click();
	}
}
