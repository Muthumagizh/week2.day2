package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignemnt6_6 {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.xpath("(//div[@id='first']//input)[1]")).click();
		WebElement checked1=driver.findElement(By.xpath("(//label[@for='Checked']//input)[1]"));
		WebElement checked2=driver.findElement(By.xpath("(//label[@for='Unchecked']//input)[1]"));
		boolean default1=checked1.isSelected();
		System.out.println(default1);
		boolean default2=checked2.isSelected();
		System.out.println(default2);
		if(default1==true) {System.out.println("checked is default");}
		if(default2==true) {System.out.println("unchecked is default");}
		
		WebElement checked3=driver.findElement(By.xpath("(//input[@class='myradio'])[3]"));
		WebElement checked4=driver.findElement(By.xpath("(//input[@class='myradio'])[4]"));
		WebElement checked5=driver.findElement(By.xpath("(//input[@class='myradio'])[5]"));
		boolean default3=checked1.isSelected();
		boolean default4=checked1.isSelected();
		boolean default5=checked1.isSelected();
		if(default3==true)
			{
			System.out.println("already selected");
			{
			if(default4==true)
			{
			System.out.println("already selected");
									
			if(default5==true)
			{
			System.out.println("already selected");
			
						}
				}
			}
			}
		else {driver.findElement(By.xpath("(//input[@class='myradio'])[3]")).click();}
}
}
		
		
		

