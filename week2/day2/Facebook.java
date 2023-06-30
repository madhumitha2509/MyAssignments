package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Madhumitha");
        driver.findElement(By.name("lastname")).sendKeys("murali");
        driver.findElement(By.name("reg_email__")).sendKeys("test123@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("987654321");
        
        WebElement birthday = driver.findElement(By.id("day"));
        Select day=new Select(birthday);
        day.selectByValue("25");
        
        WebElement birthMonth = driver.findElement(By.id("month"));
        Select month =new Select(birthMonth);
        month.selectByValue("9");
        
        WebElement birthYear = driver.findElement(By.id("year"));
        Select year=new Select(birthYear);
        year.selectByValue("2000");
        
        driver.findElement(By.xpath("//input[@value='1']")).click(); 

	}

}
