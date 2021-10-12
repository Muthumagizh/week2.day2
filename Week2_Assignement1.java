package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2_Assignement1 {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://en-gb.facebook.com/");
	driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Muthu");
	driver.findElement(By.xpath("(//div[@class='_5dbb']//input)[2]")).sendKeys("kali");
	driver.findElement(By.xpath("(//div[@class='_5dbb']//input)[3]")).sendKeys("9841028638");
	driver.findElement(By.xpath("//div[text()='New password']/following::input")).sendKeys("pass");
	driver.findElement(By.xpath("//select[@id='day']")).sendKeys("27");
	driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Dec");
	driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1982");
	
	driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba']/label)[2]")).click();
	
	
	

}}
