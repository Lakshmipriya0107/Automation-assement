package mavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-notification");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
        driver.findElement(By.id("password")).sendKeys("Password$123");
        driver.findElement(By.id("Login")).click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(By.className("slds-icon-waffle")).click();
        driver.findElement(By.xpath("//button[@class='slds-button']")).click();
        driver.findElement(By.xpath("//p[text()='Sales']")).click();
        
        driver.findElement(By.xpath("//a[@title='Opportunities']//parent::one-app-nav-bar-item-root")).click();
        driver.findElement(By.xpath("//div[@title='New']")).click();
              
        WebElement name = driver.findElement(By.xpath("//input[@name='Name']"));
        name.sendKeys("Salesforce Automation by Lakshmi");
        String typed = name.getAttribute("value");
        System.out.println(typed);
        driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("8/3/2022");
        driver.findElement(By.xpath("//div[@role='none']//button")).click();
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
        driver.findElement(By.xpath("//li[@data-target-selection-name='sfdc:StandardButton.Opportunity.SaveEdit']//button[1]")).click();
        
        
	}

}
