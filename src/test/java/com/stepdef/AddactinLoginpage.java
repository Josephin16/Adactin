package com.stepdef;

import java.net.MalformedURLException;

import com.baseclass.ReusableMethods;
import com.locators.BookHotel;
import com.locators.LoginPage;
import com.locators.OrderID;
import com.locators.SearchHotel;
import com.locators.SelectHotel;
import com.manager.ProjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddactinLoginpage extends ReusableMethods {
	static ProjectManager page;
	
	LoginPage lp;
	SearchHotel srch;
	SelectHotel selhol;
	BookHotel bkhol;
	OrderID oid;

	@Given("User launched the URL")
	public void user_launched_the_URL() throws MalformedURLException {
		//launch();
		executeCloud();
	    loadurl("https://adactin.com/HotelApp/");
	}

	@When("User entered the valid login credentials {string} and {string}")
	public void user_entered_the_valid_login_credentials_and(String name, String password) {
		 page=new ProjectManager();
		//lp = page.getLoginPage();
		sendkeys(page.getLoginPage().getUser().get(0), name);
		assertall(page.getLoginPage().getUser(), name);
		sendkeys(page.getLoginPage().getPass().get(0), password);
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
		//lp = page.getLoginPage();
		cli(page.getLoginPage().getLoginbtn().get(0));
		System.out.println("Navigating");
		String expurl = "https://adactin.com/HotelApp/SearchHotel.php";
		assertmethod(expurl);
		System.out.println("Verified (Success) - Navigated to Search Hotel page");
	}

	@Given("User navigate to the search hotel URL")
	public void user_navigate_to_the_search_hotel_URL() {

	}

	@When("User search the Location{string}")
	public void user_search_the_Location(String loc) {
		//srch = page.getSearchHotel();
		//page=new ProjectManager();
		dropdown(page.getSearchHotel().getLocate().get(0), loc);

	}

	@When("User search the hotel{string}")
	public void user_search_the_hotel(String htl) {
		//srch = page.getSearchHotel();
		dropdown(page.getSearchHotel().getHotel().get(0), htl);

	}

	@When("User search the room type{string}")
	public void user_search_the_room_type(String roomtype) {
		//srch = page.getSearchHotel();
		dropdown(page.getSearchHotel().getRoomtype().get(0), roomtype);

	}

	@When("User search the number of rooms{string}")
	public void user_search_the_number_of_rooms(String rmnos) {
		//srch = page.getSearchHotel();
		dropdown(page.getSearchHotel().getRoomnum().get(0), rmnos);

	}

	@When("User select the check in date{string}")
	public void user_select_the_check_in_date(String chkindt) {
		//srch = page.getSearchHotel();

		sendkeys(page.getSearchHotel().getDatein().get(0), chkindt);

	}

	@When("User select the check out date{string}")
	public void user_select_the_check_out_date(String chkoutdt) {
		//srch = page.getSearchHotel();
		sendkeys(page.getSearchHotel().getDateout().get(0), chkoutdt);

	}

	@When("User select the adults per room{string}")
	public void user_select_the_adults_per_room(String adultrm) {
		//srch = page.getSearchHotel();
		dropdown(page.getSearchHotel().getAdultroom().get(0), adultrm);

	}

	@When("User select the children per room{string}")
	public void user_select_the_children_per_room(String childrm) {
		//srch = page.getSearchHotel();
		dropdown(page.getSearchHotel().getChildroom().get(0), childrm);

	}

	@Then("User click on search button")
	public void user_click_on_search_button() {
		//srch = page.getSearchHotel();
		cli(page.getSearchHotel().getSearch().get(0));
		System.out.println("Navigated");
		String expurl1 = "https://adactin.com/HotelApp/SelectHotel.php";
		assertmethod(expurl1);
		System.out.println("Verified (Success) - Navigated to Select Hotel page");

	}

	@Given("User should launch the select hotel URL")
	public void user_should_launch_the_select_hotel_URL() {

	}

	@When("User should select the radio button option from the options provided")
	public void user_should_select_the_radio_button_option_from_the_options_provided() {
		//selhol = page.getSelectHotel();
		//page=new ProjectManager();
		cli(page.getSelectHotel().getRad().get(0));

	}

	@Then("Click on continue button")
	public void click_on_continue_button() {
		//selhol = page.getSelectHotel();
		cli(page.getSelectHotel().getCont().get(0));
		System.out.println("Navigated");
		String expurl3 = "https://adactin.com/HotelApp/BookHotel.php";
		assertmethod(expurl3);
		System.out.println("Verified (Success) - Navigated to Book Hotel page");

	}

	@Given("User should launch the book a hotel URL")
	public void user_should_launch_the_book_a_hotel_URL() {

	}

	@When("User search the fname{string}")
	public void user_search_the_fname(String fn) {
		//page=new ProjectManager();
		//bkhol =page.getBookHotel();
		sendkeys(page.getBookHotel().getFname().get(0), fn);

	}

	@When("User search the lname{string}")
	public void user_search_the_lname(String ln) {
		//bkhol =page.getBookHotel();
		sendkeys(page.getBookHotel().getLname().get(0), ln);

	}

	@When("User search the billingaddress{string}")
	public void user_search_the_billingaddress(String billadd) {
		//bkhol =page.getBookHotel();
		sendkeys(page.getBookHotel().getBilladd().get(0), billadd);

	}

	@When("User search the number of credit card number{string}")
	public void user_search_the_number_of_credit_card_number(String ccnum) {
		//bkhol =page.getBookHotel();
		sendkeys(page.getBookHotel().getCardno().get(0), ccnum);

	}

	@When("User select the check in credit card type{string}")
	public void user_select_the_check_in_credit_card_type(String cctype) {
		//bkhol =page.getBookHotel();
		dropdown(page.getBookHotel().getCardtype().get(0), cctype);

	}

	@When("User select the check out expdate{string} and {string}")
	public void user_select_the_check_out_expdate_and(String emonth, String eyear) {
		//bkhol =page.getBookHotel();
		dropdown(page.getBookHotel().getExpmon().get(0), emonth);
		dropdown(page.getBookHotel().getExpyr().get(0), eyear);
	}

	@When("User select the adults per CCV{string}")
	public void user_select_the_adults_per_CCV(String cvvnum) {
		//bkhol =page.getBookHotel();
		sendkeys(page.getBookHotel().getCvv().get(0), cvvnum);
	}

	@Then("User click on Book Now button")
	public void user_click_on_Book_Now_button() {
		//bkhol =page.getBookHotel();
		cli(page.getBookHotel().getBookbtn().get(0));

	}

	@Then("User need to get the order ID")
	public void user_need_to_get_the_order_ID() {
		//page=new ProjectManager();
		//oid = page.getOrderId();
		ordernoid("order_no", 10);
		String txt = page.getOrderId().getOrder().get(0).getAttribute("value");
		System.out.println("Order Numbner" + txt);
	}
}
