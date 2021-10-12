package week2.day2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement6_1 {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("muthu@muthu.com");
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//input)[2]")).sendKeys("Append2");
		String str=driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//input)[3]")).getText();
		System.out.println(str);
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//input)[4]")).clear();
		System.out.println();
		WebElement fieldenb=driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//input)[5]"));
		boolean enabled=fieldenb.isEnabled();
		System.out.println(enabled);
}
}