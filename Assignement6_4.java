package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement6_4 {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//div[contains(@class,'large-6 small-12')]//img")).click();
		driver.navigate().back();
		String str=driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//img)[2]")).getAttribute("onclick");
System.out.println(str);

if(str==null) {System.out.println("Broken link");}
Coordinates pnt=(Coordinates) driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/img)[3]")).getLocation();
System.out.println(pnt);
driver.getMouse().click(pnt);

}
}
