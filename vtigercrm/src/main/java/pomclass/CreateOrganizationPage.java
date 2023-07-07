package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}	
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement organizationTF;
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrganizationTF;
	
	@FindBy(name="accountname")
	private WebElement organizationNameTF;
	
	@FindBy(name="industry")
	private WebElement idustryname;
	
	@FindBy(name="accounttype")
	private WebElement accountTypeName;
	
	


	public WebElement getIdustryname() {
		return idustryname;
	}


	public WebElement getAccountTypeName() {
		return accountTypeName;
	}

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebutton;


	public WebElement getOrganizationTF() {
		return organizationTF;
	}


	public WebElement getCreateOrganizationTF() {
		return createOrganizationTF;
	}


	public WebElement getOrganizationNameTF() {
		return organizationNameTF;
	}


	public WebElement getSavebutton() {
		return savebutton;
	}


	
	}
	
	
		

	
	
	

		

		
