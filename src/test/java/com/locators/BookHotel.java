package com.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.ReusableMethods;

public class BookHotel extends ReusableMethods{
	
	
	public BookHotel() {
		PageFactory.initElements(drive, this);


	}
	
	
	@FindBy(id = "first_name")
	private List<WebElement> fname;

	@FindBy(id = "last_name")
	private List<WebElement> lname;



	@FindBy(id = "address")
	private List<WebElement> billadd;


	@FindBy(id = "cc_num")
	private List<WebElement> cardno;


	@FindBy(id = "cc_type")
	private List<WebElement> cardtype;


	@FindBy(id = "cc_exp_month")
	private List<WebElement> expmon;

	@FindBy(id = "cc_exp_year")
	private List<WebElement> expyr;

	@FindBy(id = "cc_cvv")
	private List<WebElement> cvv;
	
	
	
	@FindBy(id = "book_now")
	private List<WebElement> bookbtn;
	
	
	


	public List<WebElement> getFname() {
		return fname;
	}


	public List<WebElement> getLname() {
		return lname;
	}


	public List<WebElement> getBilladd() {
		return billadd;
	}


	public List<WebElement> getCardno() {
		return cardno;
	}


	public List<WebElement> getCardtype() {
		return cardtype;
	}


	public List<WebElement> getExpmon() {
		return expmon;
	}


	public List<WebElement> getExpyr() {
		return expyr;
	}


	public List<WebElement> getCvv() {
		return cvv;
	}


	public List<WebElement> getBookbtn() {
		return bookbtn;
	}


	

}
