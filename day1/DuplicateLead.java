package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DuplicateLead {

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
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Madhu");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("Leaning selenium at Testleaf");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("madhu25@gmail.com");
        
        driver.findElement(By.name("submitButton")).click();
        
        System.out.println(driver.getTitle());
      
        
        driver.findElement(By.className("subMenuButton")).click();
        
        driver.findElement(By.id("createLeadForm_companyName")).clear();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Selenium");
        
        driver.findElement(By.id("createLeadForm_firstName")).clear();
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Madhu");
        
        driver.findElement(By.className("smallSubmit")).click();
        
        System.out.println(driver.getTitle());
        
        
        

	}

}
