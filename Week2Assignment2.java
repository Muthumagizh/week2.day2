package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk//");
		driver.findElement(By.xpath("//div[@class='firstName textFieldInput section']//input")).sendKeys("Muthukumaran");
		driver.findElement(By.xpath("//div[@class='lastName textFieldInput section']//input")).sendKeys("kaliyamoorthy");
		driver.findElement(By.xpath("//div[@class='emailInput textFieldInput section']//input")).sendKeys("abc@sc.com");
		driver.findElement(By.xpath("//div[@class='company textFieldInput section']//input")).sendKeys("SCB");
		driver.findElement(By.xpath("//div[@class='phoneInput textFieldInput section']//input")).sendKeys("32587455555");
		
		
		
		WebElement jobtitle= driver.findElement(By.xpath("//div[@class='userTitle selectFieldInput section']//select"));
		Select jobtitledrpdwn = new Select(jobtitle);
		jobtitledrpdwn.selectByValue("Sales_Manager_AP");
		WebElement country= driver.findElement(By.xpath("//div[@class='country_field selectFieldInput']//select"));
		Select countrydrpdwn = new Select(country);
		countrydrpdwn.selectByValue("AF");
		
		WebElement employ= driver.findElement(By.xpath("//div[@class='companyEmployees selectFieldInput section']//select"));
		Select employdrpdwn = new Select(employ);
		employdrpdwn.selectByValue("9");
		
				
		driver.findElement(By.xpath("//div[@class='form_submit_button submitButton buttonCTAItemComponent parbase']//button")).click();
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
	}

}
