
package com.Armazenar.Generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Armazenar.ObjectRepo.HomePage;
import com.Armazenar.ObjectRepo.LoginPage;
import com.beust.jcommander.Parameter;
 

public class BaseClass {
	
	public WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./src/main/resources/driver/geckodriver.exe");
		System.setProperty("webdriver.opera.driver","./src/main/resources/driver/operadriver.exe");
		System.setProperty("webdriver.edge.driver","./src/main/resources/driver/msedgedriver.exe");
	}	
	@Parameters("Browser")
	@BeforeClass
	public void OpenBrowser(String Browser) throws IOException {
		if(Browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleContains(""));
		}else if(Browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleContains(""));
		}else if(Browser.equalsIgnoreCase("opera")) {
			driver=new OperaDriver();
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleContains(""));
		}else if(Browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleContains(""));
		}else {
			driver=new ChromeDriver();
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleContains(""));
		}
		FileLib data=new FileLib();
		String url= data.propertyFile(driver,"url");
		driver.get(url);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	@BeforeMethod
	public void Login() throws IOException {
	
		LoginPage lp=new LoginPage(driver);
		lp.Login(driver);
	}
	
	@AfterMethod
	public void Logout() {
	HomePage hp=new HomePage(driver);
	hp.SignOut(driver);
	}
}
