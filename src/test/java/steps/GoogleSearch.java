package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoogleBaseHeistsjava;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.PageObjects;

public class GoogleSearch extends GoogleBaseHeistsjava{
	

	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
	launchBrowser();
	    
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
		//step 1: identify the web element and give the element a name
		//8 locators:
		//id,name, tag,class name,linktext,partial linktext, Xpath, css-selector
		
		PageObjects po= new PageObjects(driver);
		po.entersearch(string);
		
	   
	}

	@When("I click on the google search button")
	public void i_click_on_the_google_search_button() {
		
		PageObjects po= new PageObjects(driver);
		po.clickSearch();
	    
	}

	@Then("I recieve related search result")
	public void i_recieve_related_search_result() {
		
		PageObjects po= new PageObjects(driver);
		po.results();
		
		po.close();
		
	    
	}


}
