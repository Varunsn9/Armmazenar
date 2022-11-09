package com.Armazenar.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Armazenar.Generic.WebDriver_Utilities;

public class HomePage {

	@FindBy(xpath ="//tr/descendant::td[@class='tabUnSelected']/child::a[contains(text(),'Organizations')]")
	private WebElement organizations;
	
	@FindBy(xpath ="//tr/descendant::td[@class='tabUnSelected']/child::a[contains(text(),'Leads')]")
	private WebElement leads;
	
	@FindBy(xpath ="//tr/descendant::td[@class='tabUnSelected']/child::a[contains(text(),'Contacts')]")
	private WebElement contacts;
	
	@FindBy(xpath ="//tr/descendant::td[@class='tabUnSelected']/child::a[contains(text(),'Opportunities')]")
	private WebElement opportunities;
	
	@FindBy(xpath ="//tr/descendant::td[@class='tabUnSelected']/child::a[contains(text(),'Products')]")
	private WebElement products;
	
	@FindBy(xpath ="//tr/descendant::td[@class='tabUnSelected']/child::a[contains(text(),'Documents')]")
	private WebElement documents;

	@FindBy(xpath ="//tr/descendant::td[@class='tabUnSelected']/child::a[contains(text(),'Trouble Tickets')]")
	private WebElement trouble_Tickets;

	@FindBy(xpath ="//tr/descendant::td[@class='tabUnSelected']/child::a[contains(text(),'Dashboard')]")
	private WebElement dashboard;

	@FindBy(xpath ="//a[contains(text(),'More')]")
	private WebElement more;

	@FindBy(xpath ="//tr/descendant::td[@class='tabUnSelected']/child::a[contains(text(),'Email')]")
	private WebElement email;
	
	@FindBy(xpath ="(//span[contains(text(),'Administrator')]/parent::td/following-sibling::td/child::img)[1]")
	private WebElement userPreference_icon;
	
	@FindBy(xpath ="//a[contains(text(),'Sign Out')]")
	private WebElement signOut;
	
	@FindBy(name="SMSNotifier")
	private WebElement sMSNotifier;

	@FindBy(name="Our Sites")
	private WebElement our_Sites;

	@FindBy(name="Integration")
	private WebElement integration;
	
	@FindBy(name="Mail Manager")
	private WebElement mail_Manager;
	
	@FindBy(name="PBX Manager")
	private WebElement pBX_Manager;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void OrganizationsModule(WebDriver driver) {
		organizations.click();
	}
	public void SignOut(WebDriver driver) {
		WebDriver_Utilities wBU=new WebDriver_Utilities();
		wBU.MoveToElement(driver,userPreference_icon);
		signOut.click();
	}
	public void contacts(WebDriver driver) {
		contacts.click();
	}
	public void opportunities(WebDriver driver) {
		opportunities.click();
	}
	public void email(WebDriver driver) {
		email.click();
	}
	public void troubleTickets(WebDriver driver) {
		trouble_Tickets.click();
	}
	public void documents(WebDriver driver) {
		documents.click();
	}
	public void Dashboard(WebDriver driver) {
		dashboard.click();
	}
	public void leads(WebDriver driver) {
		leads.click();
	}
	public void products(WebDriver driver) {
		products.click();
	}
	public void our_Sites(WebDriver driver) {
		WebDriver_Utilities wBU=new WebDriver_Utilities();
		wBU.MoveToElement(driver, more);
		our_Sites.click();
	}
	public void sMSNotifier(WebDriver driver) {
		WebDriver_Utilities wBU=new WebDriver_Utilities();
		wBU.MoveToElement(driver, more);
		sMSNotifier.click();
	}
	public void pBXManager(WebDriver driver) {
		WebDriver_Utilities wBU=new WebDriver_Utilities();
		wBU.MoveToElement(driver, more);
		pBX_Manager.click();
	}
	public void mailManager(WebDriver driver) {
		WebDriver_Utilities wBU=new WebDriver_Utilities();
		wBU.MoveToElement(driver, more);
		mail_Manager.click();
	}
	
	
}
