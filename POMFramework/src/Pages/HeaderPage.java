package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
	
	private WebDriver driver;
	
	public HeaderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	 @FindBy(linkText="Logout")
	 WebElement Logout;	
	//By Logout=By.linkText("Logout");
	 
	 
	@FindBy(how=How.LINK_TEXT, using="New Lead") 
	WebElement Newlead; 
	//By Newlead=By.linkText("New Lead");
	
	
	By Leads=By.linkText("Leads");
	
	public void clickonLogout()
	{
		Logout.click();
	}
	
	public void clickOnHyperlink(String link)
	{
		driver.findElement(By.linkText(link)).click();
	}

}
