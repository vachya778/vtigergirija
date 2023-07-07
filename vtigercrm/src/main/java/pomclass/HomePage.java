package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath="//a[text()='Organizations'and contains(@href,'action=index')]")
	private WebElement organizationLink;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contacLink;
	
	@FindBy(xpath="//a[text()='Leads'and contains  (@href,'action=index')]")
	private WebElement leadsLink;
	
	@FindBy(id="qccombo")
	private WebElement quickCreateDropdown;
	
	@FindBy(name="subject")
	private WebElement subjecttextfield;
	
	@FindBy(name="date_start")
	private WebElement datestartTF;
	
	
	@FindBy(name="due_date")
	private WebElement enddateTF;
	
	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getContacLink() {
		return contacLink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getQuickCreateDropdown() {
		return quickCreateDropdown;
	}

	public WebElement getSubjecttextfield() {
		return subjecttextfield;
	}

	public WebElement getDatestartTF() {
		return datestartTF;
	}

	public WebElement getEnddateTF() {
		return enddateTF;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	@FindBy(name="button")
	private WebElement savebutton;
			
	
		}
	
	
	
	
	

	
