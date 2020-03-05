package com.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.ReusableMethods;

public class SelectHotel extends ReusableMethods {
	
	
	public SelectHotel() {
		PageFactory.initElements(drive, this);

	}
	
	public List<WebElement> getRad() {
		return rad;
	}

	public List<WebElement> getCont() {
		return cont;
	}

	@FindBy(id = "radiobutton_0")
	private List<WebElement> rad;
	
	@FindBy(id = "continue")
	private List<WebElement> cont;

}
