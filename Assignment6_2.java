package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6_2 {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		Point loc=driver.findElement(By.id("position")).getLocation();
		System.out.println(loc);
		String color=driver.findElement(By.id("color")).getCssValue("background-color");
				System.out.println(color);
		Dimension Size=driver.findElement(By.id("position")).getSize();
		System.out.println(Size);
		
		
}
}