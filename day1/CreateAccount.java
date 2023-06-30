package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
         driver.findElement(By.id("username")).sendKeys("demosalesManager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         System.out.println(driver.getTitle());
         driver.findElement(By.linkText("CRM/SFA")).click();
    
	     driver.findElement(By.linkText("Accounts")).click();
	     
	     driver.findElement(By.linkText("Create Account")).click();
	    
	     driver.findElement(By.id("accountName")).sendKeys("debit limited account");
	     driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("selenium automation tester");
	     driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Madhumitha");
	     driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("Test");
	     driver.findElement(By.xpath("//input[@name='annualRevenue']")).sendKeys("4500000");
	     
	     WebElement industry = driver.findElement(By.name("industryEnumId"));
	        Select dropdown1 = new Select(industry);
	        dropdown1.selectByIndex(3);
	              
	        
	     WebElement ownerShip = driver.findElement(By.name("ownershipEnumId"));
	        Select dropdown2 = new Select(ownerShip);
	        dropdown2.selectByVisibleText("S-Corporation");
	        
	        
	        WebElement source = driver.findElement(By.name("dataSourceId"));
	        Select dropdown3 = new Select(source);
	        dropdown3.selectByValue("LEAD_EMPLOYEE");
	        
	        WebElement marketingCampaign = driver.findElement(By.name("marketingCampaignId"));
	        Select dropdown4 = new Select(marketingCampaign);
	        dropdown4.selectByIndex(6);
	        
	        WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
	        Select dropdown5 = new Select(state);
	        dropdown5.selectByValue("TX");
	        
	        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	      
	        
	     System.out.println(driver.getTitle());

	}

}
