package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement6_5 {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement drp1= driver.findElement(By.id("dropdown1"));
		Select sltdrp1=new Select(drp1); 
		sltdrp1.selectByIndex(1);
		WebElement drp2= driver.findElement(By.name("dropdown2"));
		Select sltdrp2=new Select(drp2); 
		sltdrp2.selectByVisibleText("Appium");
		WebElement drp3= driver.findElement(By.id("dropdown3"));
		Select sltdrp3=new Select(drp3); 
		sltdrp3.selectByValue("3");
		WebElement drp4= driver.findElement(By.tagName("select"));
		Select sltdrp4=new Select(drp4); 
		int a= sltdrp4.getOptions().size();
		System.out.println(a);
		WebElement drp5= driver.findElement(By.xpath("(//div[@class='example']/select)[6]"));
		Select sltdrp5=new Select(drp5); 
		sltdrp5.selectByValue("3");
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Loadrunner");
		
		
}
}
