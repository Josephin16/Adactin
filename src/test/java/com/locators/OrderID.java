package com.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.ReusableMethods;

public class OrderID extends ReusableMethods {
	
	public OrderID() {
		PageFactory.initElements(drive, this);
	}
	
	@FindBy(id = "order_no")
	private List<WebElement> order;

	public List<WebElement> getOrder() {
		return order;
	}

}
