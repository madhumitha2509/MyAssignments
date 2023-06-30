package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//Setup the driver
		ChromeDriver driver = new ChromeDriver();
		
		//load url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//find the element   enter the user_name
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        
        //find the element of password enter password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        //find element click login button
        driver.findElement(By.className("decorativeSubmit")).click();
        
        //get the title of current open page
        //  String title = driver.getTitle();    //ctrl+2+l
        System.out.println(driver.getTitle());
        
        //Find the Element crm/sfa and click the element
        driver.findElement(By.partialLinkText("CRM")).click();
        
        //driver.findElement(By.linkText("CRM/SFA")).click();
        
        //click lead
        driver.findElement(By.linkText("Leads")).click();
        
        //click create lead
        
        driver.findElement(By.partialLinkText("Create")).click();
        //Enter company name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
       //Enter the first name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Madhumitha");
        //Enter the Last name
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murali");
         
        driver.findElement(By.name("submitButton")).click();
             
		
		//close the window
		//driver.close();
		

	}

}
