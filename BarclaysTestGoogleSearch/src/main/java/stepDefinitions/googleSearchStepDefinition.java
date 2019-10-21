package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class googleSearchStepDefinition {
	
	 WebDriver driver;
	 //WebDriver testDriver;
	 WebDriverWait Wait;

	
	@Given("^I have chrome browser opened$")
	public void i_have_chrome_browser_opened(){
		System.setProperty("webdriver.chrome.driver", "C:\\LogFiles\\Selenium\\JarFiles\\Drivers\\ChromeWebDriver.exe");
		driver= new ChromeDriver();
		Wait = new WebDriverWait(driver, 20);	
	}
	
	@When("^I go to https://www.google.com/$")
	public void i_go_to_https_www_google_com(){
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Google", title);
	    
	}

	@And("^I type Barclays into search bar$")
	public void i_type_Barclays_into_search_bar(){
		driver.findElement(By.name("q")).sendKeys("Barclays");
	  
	}

	@And("^I hit search$")
	public void i_hit_search(){
		
		 WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit'and @value='Google Search']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", searchBtn);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		 
	}

	@Then("^https://www.barclays.co.uk/ is first url on search results$")
	public void https_www_barclays_co_uk_is_first_url_on_search_results(){
		
		List<WebElement> listofSites =  driver.findElements(By.className("TbwUpd"));
			String linkText = null;
	        linkText = listofSites.get(0).getText();//get the first link text 
			Assert.assertTrue(linkText.contains("www.barclays.co.uk")); 
			driver.quit();	
}		

	
		
		
	
		
	
	    
}
