package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement6_7 {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("(//div[@class='example']//input)[1]")).click();
		boolean checksel=driver.findElement(By.xpath("(//div[@class='example']//input)[6]")).isSelected();
		if(checksel== true)
		{System.out.println("selected");}
		else {System.out.println("not checked");}
		
		boolean checksel1=driver.findElement(By.xpath("(//div[@class='example']//input)[7]")).isSelected();
		boolean checksel2=driver.findElement(By.xpath("(//div[@class='example']//input)[8]")).isSelected();
		if(checksel1== true)
		{driver.findElement(By.xpath("(//div[@class='example']//input)[7]")).click();}
		if(checksel2== true)
		{driver.findElement(By.xpath("(//div[@class='example']//input)[8]")).click();}
		
		driver.findElement(By.xpath("(//div[@class='example']//input)[9]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[10]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[11]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[12]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[13]")).click();
		

}
}
