package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	public ContactPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath="(//a[text()='Contacts'])[1]")
	private WebElement contactLink;
	
	
	public WebElement getContactLink() {
		return contactLink;
	}
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createcontactlink;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(xpath="//input[normalize-space(@value)='Save']")
	private WebElement savebutton;
	
	@FindBy(xpath="//input[@title='Duplicate [Alt+U]']")
	private WebElement duplicateButton;
		
	
	public WebElement getDuplicateButton() {
		return duplicateButton;
	}

	public WebElement getCreatecontactlink() {
		return createcontactlink;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

		}
	

