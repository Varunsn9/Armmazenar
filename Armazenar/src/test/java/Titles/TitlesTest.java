package Titles;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Armazenar.Generic.BaseClass;
import com.Armazenar.ObjectRepo.HomePage;

public class TitlesTest extends BaseClass {

	HomePage hp;
	@Test
	public void homePageTitle() {
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM"));
	}
	@Test
	public void organizationTitle() {
		hp=new HomePage(driver);
		hp.OrganizationsModule(driver);
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM"));
	}
	@Test
	public void sMSNotifier() {
		hp=new HomePage(driver);
		hp.sMSNotifier(driver);
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Administrator - SMSNotifier - vtiger CRM 5 - Commercial Open Source CRM"));
	}
	@Test
	public void contacts() {
		hp=new HomePage(driver);
		hp.contacts(driver);
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM"));
	}
	public void opportunities() {
		hp=new HomePage(driver);
		hp.opportunities(driver);
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Administrator - Opportunities - vtiger CRM 5 - Commercial Open Source CRM"));
	}
	public void leads() {
		hp=new HomePage(driver);
		hp.leads(driver);
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Administrator - Leads - vtiger CRM 5 - Commercial Open Source CRM"));
	}
	public void troubleTickets() {
		hp=new HomePage(driver);
		hp.troubleTickets(driver);
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Administrator - Trouble Tickets - vtiger CRM 5 - Commercial Open Source CRM"));
	}
}
