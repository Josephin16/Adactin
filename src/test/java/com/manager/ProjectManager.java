package com.manager;

import com.locators.BookHotel;
import com.locators.LoginPage;
import com.locators.OrderID;
import com.locators.SearchHotel;
import com.locators.SelectHotel;


public class ProjectManager{
	
	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage=new LoginPage():loginPage;
	}
	public SearchHotel getSearchHotel() {
		return (searchHotel==null)?searchHotel=new SearchHotel():searchHotel;
	}
	public SelectHotel getSelectHotel() {
		return (selectHotel==null)?selectHotel=new SelectHotel():selectHotel;
	}
	public OrderID getOrderId() {
		return (orderId==null)?orderId=new OrderID():orderId;
	}
	public BookHotel getBookHotel() {
		return (bookHotel==null)?bookHotel=new BookHotel():bookHotel;
	}
	
	private LoginPage loginPage;
	private SearchHotel searchHotel;
	private SelectHotel selectHotel;
	private OrderID orderId;
	private BookHotel bookHotel;
	
	
	
	

}
