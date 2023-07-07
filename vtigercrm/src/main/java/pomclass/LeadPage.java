package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
	public LeadPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	@FindBy(linkText="Leads")
	private WebElement leadsLink;
	
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement CreateLeadButton;
	
	@FindBy(name="firstname")
	private WebElement firstnameTF;
	
	@FindBy(name="lastname")
	private WebElement lastnameTF;
	
	@FindBy(name="company")
	private WebElement companynameTF;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebutton;
	
	@FindBy(xpath="//input[@title='Duplicate [Alt+U]']")
	private WebElement duplicatebutton;
	
	@FindBy(xpath="//input[@title='Delete [Alt+D]']")
	private WebElement deletebutton;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement deleteLeadsbutton;

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getCreateLeadButton() {
		return CreateLeadButton;
	}

	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getLastnameTF() {
		return lastnameTF;
	}

	public WebElement getCompanynameTF() {
		return companynameTF;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getDuplicatebutton() {
		return duplicatebutton;
	}

	public WebElement getDeletebutton() {
		return deletebutton;
	}

	public WebElement getDeleteLeadsbutton() {
		return deleteLeadsbutton;
	}

		}


