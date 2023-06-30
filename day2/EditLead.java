package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditLead {

	public static void main(String[] args) {


		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.id("ext-gen248")).sendKeys("Madhumitha");
		//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Madhumitha");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//driver.findElement(By.xpath("//button[@class='x-btn-text']")).click();
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		//driver.findElement(By.className("linktext")).click();
		
		System.out.println(driver.getTitle());
		
	    driver.findElement(By.linkText("Edit")).click();
	    
	    driver.findElement(By.id("updateLeadForm_companyName")).clear();
	    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Google");
	    driver.findElement(By.xpath("//input[@value='Update']")).click();
	    
	    driver.close();
	    

	}

}
