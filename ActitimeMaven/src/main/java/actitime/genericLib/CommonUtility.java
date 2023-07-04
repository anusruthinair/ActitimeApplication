package actitime.genericLib;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtility {

	public void alert_cancel(WebDriver driver) {
		Alert al=driver.switchTo().alert();
		al.dismiss();
		
	}
	public void alert_agree(WebDriver driver) {
		Alert al=driver.switchTo().alert();
		al.accept();	
		}
	public String getAlertinfo(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al=driver.switchTo().alert();
		return al.getText();
	}
	
	public int getRandomNum() 
	{
	 Random r  = new Random();
	 return r.nextInt(20000);
    }
	public void textToBePresentWait(WebDriver driver,By locater,String name) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(locater, name));	
	}
	public void explicithalftext(WebDriver driver,By locater,String name) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementValue(locater, name));	
	}
	
	
	public void getSelectVisibleText(WebElement dropdown,String visibletext) {
		Select s = new Select(dropdown);
		s.selectByVisibleText(visibletext);
	}
	
	public void getSelectindex(WebElement dropdown,int index) {
		Select s = new Select(dropdown);
		s.selectByIndex(index);
	}
	public void getSelectvalue(WebElement dropdown,String value) {
		Select s = new Select(dropdown);
		s.selectByValue(value);
	}

	//getOptions
	public void getdropdown(WebDriver driver ,By locator) {
		WebElement sublist =driver.findElement(locator); 
	    Select s = new Select(sublist);
	    List<WebElement> listopt = s.getOptions();
	    int i=1;
		for (WebElement dropdown:listopt)
			{ 
			System.out.println(i+"."+dropdown.getText());
			i++;  }
	}
	//movecursor
	public void move_cursor(WebDriver driver ,By locator) {
		WebElement element =driver.findElement(locator);
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	//dualclick
	public void dualclick(WebDriver driver,By locator) {
		WebElement element = driver.findElement(locator);
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
}
