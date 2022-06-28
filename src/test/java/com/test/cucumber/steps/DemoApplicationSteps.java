package com.test.cucumber.steps;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.cucumber.objects.HomeScreen_Pageobjects;
import com.test.cucumber.utilities.Commonlibraries;
import com.test.cucumber.utilities.ReadProperties;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoApplicationSteps {

	private WebDriver driver = Hooks.driver;
	private WebDriverWait wait;
	public Commonlibraries cl = new Commonlibraries(driver, this.wait);
	ArrayList<Double> prodRate = new ArrayList<Double>();
	ArrayList<String> wishlist = new ArrayList<String>();
	double lowestPriceProduct=0;
	String cartHeader = null;

	
	  public DemoApplicationSteps() throws Exception { ReadProperties
	  propertiesReader = new ReadProperties(); this.wait = new
	  WebDriverWait(driver, propertiesReader.getTimeout()); }
	 
	HomeScreen_Pageobjects home = new HomeScreen_Pageobjects(driver, wait);
	
	@Given("^I add four random items to my cart$")
	public void i_add_random_items_to_my_cart() throws InterruptedException {
		for (int p=1; p<=4; p++)
		{
		    home.click_addtocart(p);
		}
		System.out.println("four products have been added successfully to the cart!");

	}
	
	@When("^I view my cart$")
	public void i_view_my_cart() throws InterruptedException {
		home.click_cartmenu();
		System.out.println("cart view successful!");
	}
	
	@Then("^I find total four items listed in my cart$")
	public void i_find_four_items_in_my_cart() throws InterruptedException {
		Assert.assertTrue(home.get_cartcount()-1 == 4);
		System.out.println("four products is displayed in the cart!");
	}
	
	@And("^I am able to remove the lowest price item from my cart$")
	public void i_remove_lowest_priced_product_from_my_cart() throws InterruptedException {
		//home.getlowestpricedproductincart();
        home.removefromcart(home.getlowestpricedproductincart());
		System.out.println("removed the lowest priced product from cart!");
	}
	 
	@Then("^I am able to verify three items in my cart$")
	public void i_find_three_items_in_my_cart() throws InterruptedException {
		Assert.assertTrue(home.get_cartcount()-1 == 3);
		System.out.println("only 3 products shown on the cart after removal of lowest priced product!");
	}

}
