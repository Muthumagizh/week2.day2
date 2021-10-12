package week2.day2;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignement4 {
	

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://acme-test.uipath.com/login");
			driver.findElement(By.xpath("//div[@class='form-group control-group']//input")).sendKeys("kumar.testleaf@gmail.com");
			driver.findElement(By.xpath("//label[@for='password']/following-sibling::input")).sendKeys("leaf@12");
			driver.findElement(By.xpath("//div[@class='controls form-check']//input[1]")).click();
			driver.findElement(By.xpath("//div[@class='control-group form-group']/following-sibling::button")).click();
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//form[@id='logout-form']/following::a[1]")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.close();
}
}
