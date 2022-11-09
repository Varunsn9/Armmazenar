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
}
