package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task_TabCustomer {
	
	@FindBy(id="container_tasks")
	private WebElement tasktab;
	
	@FindBy(css=".addNewButton > .downIcon")
	private WebElement addNew;
	
	@FindBy(className ="createNewCustomer")
	private WebElement newCustomer;
	
	@FindBy(className = "inputNameField")
	private WebElement customerName;
	
	@FindBy(xpath = "//textarea[contains(@placeholder,'Description')]")
	private WebElement description;
	
	@FindBy(className = "commitButtonPlaceHolder")
	private WebElement genrateCustomer;
	
	@FindBy(css=".titleEditButtonContainer>.title")
	private WebElement dispalyName;
	
	public Task_TabCustomer(WebDriver driver) {
    	
    	PageFactory.initElements(driver,this);
	}
	
	
	
    public WebElement getTasktab() {
		return tasktab;
	}
	
	public WebElement getAddNew() {
		return addNew;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getCustomerName() {
		return customerName;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getGenrateCustomer() {
		return genrateCustomer;
	}

	public WebElement getDispalyName() {
		return dispalyName;
	}


	public void tasktabIcon() {
		getTasktab().click();
	}
	
	public void customerGenrateAction(String name,String info) {
		
		getAddNew().click();
		getNewCustomer().click();
		getCustomerName().sendKeys(name);
		getDescription().sendKeys(info);
		getGenrateCustomer().click();
	}
	
	public String nameFinal() {
		
		return getDispalyName().getText();
	}
	
	
	
	
	
	
	
	/*
	public void setTasktab(WebElement tasktab) {
		this.tasktab = tasktab;
	}
	
	public void setAddNew(WebElement addNew) {
		this.addNew = addNew;
	}
	
	public void setNewCustomer(WebElement newCustomer) {
		this.newCustomer = newCustomer;
	}
	
	public void setCustomerName(WebElement customerName) {
		this.customerName = customerName;
	}
	
	public void setDescription(WebElement description) {
		this.description = description;
	}
	
	public void setGenrateCustomer(WebElement genrateCustomer) {
		this.genrateCustomer = genrateCustomer;
	}
	
	public void getDispalyName(WebElement dispalyName) {
		this.dispalyName = dispalyName;
	}
    */
}
