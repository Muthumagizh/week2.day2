package week2.day2;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignemnt6_3 {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/a)[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/a)[2]")).getAttribute("href");
		String url=driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/a)[3]")).getAttribute("href");
		if(url.contains("error")) {System.out.println("Broken link");}
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/a)[4]")).click();
		driver.navigate().back();
		WebElement link=driver.findElement(By.tagName("a"));
		System.out.println(link);
		
		
}

}
