package com.Armazenar.ObjectRepo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Armazenar.Generic.FileLib;

public class LoginPage {

	@FindBy(name="user_name")
	private WebElement User_Name_TextBox;

	@FindBy(name="user_password")
	private WebElement Password_TextBox;
	
	@FindBy(id="submitButton")
	private WebElement LoginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Login(WebDriver driver) throws IOException {
		FileLib fl=new FileLib();
		String userName=fl.propertyFile(driver, "username");
		String passWord=fl.propertyFile(driver, "password");
		User_Name_TextBox.sendKeys(userName);
		Password_TextBox.sendKeys(passWord);
		LoginButton.click();
	}
}
