package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("http://en-gb.facebook.com/");
		//manage the window
		driver.manage().window().maximize();
		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click create new account button
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		//enter first name
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Subashini");
		//enter the last name
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Raju");
		//enter mobile no
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9677552313");
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("nithika");
		//drop downs
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select drop=new Select(day);
		drop.selectByVisibleText("4");
		WebElement mon = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select drop1=new Select(mon);
		drop1.selectByVisibleText("Apr");
		//select year
		WebElement yr = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select drop2=new Select(yr);
		drop2.selectByVisibleText("1992");
		//select radio button
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		// normal click
		
		
		// TODO Auto-generated method stub

	}

}
