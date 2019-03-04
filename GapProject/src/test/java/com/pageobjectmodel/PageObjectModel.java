package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {
	WebDriver driver;
	public  PageObjectModel (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);	
		}
@FindBy (xpath="")
private WebElement SinginButton;
public WebElement getSinginButton() {
	return SinginButton;
}


}
