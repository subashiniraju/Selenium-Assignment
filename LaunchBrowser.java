package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sree");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1=new Select(source);
		drop1.selectByVisibleText("Direct Mail");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nithika");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Create Lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suba.cs92@gmail.com");
		WebElement source1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop2=new Select(source1);
		drop2.selectByVisibleText("Arizona");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title); 
		

		
		// TODO Auto-generated method stub

	}

}
