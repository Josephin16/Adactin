package com.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.ReusableMethods;

public class SearchHotel extends ReusableMethods{
	
	public SearchHotel() {
		PageFactory.initElements(drive, this);

	}
	
	@FindBy(id = "location")
	private List<WebElement> locate;
	
	@FindBy(id = "hotels")
	private List<WebElement> hotel;
	
	@FindBy(id = "room_type")
	private List<WebElement>roomtype;
	
	
	@FindBy(id = "room_nos")
	private List<WebElement> roomnum;
	
	@FindBy(id = "datepick_in")
	private List<WebElement> datein;
	

	public List<WebElement> getLocate() {
		return locate;
	}

	public List<WebElement> getHotel() {
		return hotel;
	}

	public List<WebElement> getRoomtype() {
		return roomtype;
	}

	public List<WebElement> getRoomnum() {
		return roomnum;
	}

	public List<WebElement> getDatein() {
		return datein;
	}

	public List<WebElement> getDateout() {
		return dateout;
	}

	public List<WebElement> getAdultroom() {
		return adultroom;
	}

	public List<WebElement> getChildroom() {
		return childroom;
	}

	public List<WebElement> getSearch() {
		return search;
	}

	@FindBy(id = "datepick_out")
	private List<WebElement> dateout;
	
	@FindBy(id = "adult_room")
	private List<WebElement> adultroom;
	
	
	@FindBy(id = "child_room")
	private List<WebElement> childroom;
    
	@FindBy(id = "Submit")
	private List<WebElement> search;

}
