package com.Armazenar.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utilities extends BaseClass {
	
	public void ImpliCitlyWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void MoveToElement(WebDriver driver,WebElement element) {
		Actions MouseAction=new Actions(driver);
		MouseAction.moveToElement(element).perform();
	}

}
