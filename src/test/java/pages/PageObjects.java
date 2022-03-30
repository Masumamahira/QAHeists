package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	WebDriver driver;
	
	public PageObjects (WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements( driver,this);
	
	
	 
	
	}
	
	//WebElement searchBox;
	
	//searchBox = driver.findElement(By.name("q"));
		
		
	@FindBy(name="q")
	WebElement searchBox;
	
	
	//searchBox.sendKeys(string);
	public void entersearch(String string) {
		searchBox.sendKeys(string);
		
	}
	//WebElement SearchBtn;
	//SearchBtn = driver.findElement(By.name("btnK"));
	
	@FindBy(name="btnK")
	WebElement searchBtn;
	
	//SearchBtn.click();
	//SearchBtn.submit();
	public void clickSearch() {
		searchBtn.submit();
		
	}
	
	//WebElement resultStats;
	//resultStats = driver.findElement(By.id("result-stats"));
	@FindBy(id="result-stats")
	WebElement resultStats;
	
	//String results = resultStats.getText();
	public void results() {
		System.out.println("=================================");
		System.out.println(resultStats);
		System.out.println("=================================");
		
	}
	
	//System.out.println("=================================");
	//System.out.println(results);
	//System.out.println("=================================");
	
	public void close() {
		driver.close();
		
	}
	//driver.close();
	
	
	}


