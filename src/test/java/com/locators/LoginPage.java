package com.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.ReusableMethods;

public class LoginPage extends ReusableMethods{
	
	public LoginPage() {
		PageFactory.initElements(drive, this);
		
	}
	
	public List<WebElement> getUser() {
		return user;
	}

	public List<WebElement> getPass() {
		return pass;
	}

	public List<WebElement> getLoginbtn() {
		return loginbtn;
	}

	@FindBy(id = "username")
	private List<WebElement> user;
	
	

	@FindBy(id = "password")
	private  List<WebElement> pass;
	
	@FindBy(id = "login")
	private  List<WebElement> loginbtn;


}
