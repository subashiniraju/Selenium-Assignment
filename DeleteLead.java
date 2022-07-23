package week2.day2;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Attribute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("9677552313");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement text = driver.findElement(By.xpath("//div[text()='No records to display']"));
		boolean displayed=text.isDisplayed();
		System.out.println("text:"+displayed);
		driver.quit();
		
		// TODO Auto-generated method stub

		}

}
