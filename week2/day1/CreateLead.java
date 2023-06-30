package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Madhumitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murali");
		
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select dropdown1 = new Select(Source);
        dropdown1.selectByVisibleText("Employee");
        
        WebElement marketCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select dropdown2 = new Select(marketCampaign);
        dropdown2.selectByValue("9001");
        
        
        WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select dropdown3 = new Select(ownership);
        dropdown3.selectByIndex(5);
        
        WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
        Select dropdown4 = new Select(Country);
        dropdown4.selectByVisibleText("India");
        
        driver.findElement(By.name("submitButton")).click();
        
        System.out.println(driver.getTitle());
	}

}
