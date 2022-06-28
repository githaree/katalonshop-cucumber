package com.test.cucumber.objects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.cucumber.utilities.Commonlibraries;


public class HomeScreen_Pageobjects extends Commonlibraries {

	public HomeScreen_Pageobjects(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}
	
	  @FindBy(xpath = "//*[@class=' nav-menu']/li[1]")
	  public WebElement cartmenu;
	  
	  @FindBy(xpath = "//table[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']/tbody/tr")
	  public List<WebElement> carttable;

	    
	    public void click_addtocart(int randumproductnum) throws InterruptedException {
	    	String tempxpath = "//*[@class='products columns-3']/li[" + randumproductnum + "]//*[text() = 'Add to cart']";
	    	this.driver.findElement(By.xpath(tempxpath)).click();
		    Thread.sleep(1000);
	    	}
	    
	    public void click_cartmenu() {
	    	cartmenu.click();
	    	}
	    
	    public int get_cartcount() {
		    System.out.println(carttable.size());

	    	return carttable.size();
	    	}
	    
	    public int getlowestpricedproductincart() {
	    	int lowestpricedproduct = 0;
	    	float pricearr[];
	    	pricearr = new float[4];
	        Map map=new HashMap();  

	    	for (int i =1; i<=4; i++)
	    	{
	    	String tempxpath = "//table[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']/tbody/tr[" + i + "]/td[4]";
	    	String  str = this.driver.findElement(By.xpath(tempxpath)).getText().toString();
	    	str = str.substring(1, str.length());
	        Float floatVal = Float.valueOf(str).floatValue();
	        map.put(i,floatVal);  

	    	pricearr[i-1] = floatVal;
	    	}
	    	
	        Arrays.sort(pricearr);
	    	System.out.println(pricearr[0]);

	        Set set=map.entrySet();
	        Iterator itr=set.iterator();  
	        while(itr.hasNext()){  
	            Map.Entry entry=(Map.Entry)itr.next();  
	            if (entry.getValue().toString().contentEquals(Float.toString(pricearr[0])))
	            {
		            System.out.println(entry.getKey()+" "+entry.getValue());  
		            lowestpricedproduct = Integer.parseInt(entry.getKey().toString());
	            }
	        }  

	        return lowestpricedproduct;
	    	}
	    
	    
	    public void removefromcart(int index) throws InterruptedException {
	    	String tempxpath = "//table[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']/tbody/tr[" + index + "]/td[1]/a";
	    	this.driver.findElement(By.xpath(tempxpath)).click();
		    Thread.sleep(2000);

	    }

}
