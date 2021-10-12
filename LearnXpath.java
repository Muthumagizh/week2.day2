package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {
	public static void main(String[] args) throws InterruptedException {
	 {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement elelogin=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement elepass=driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		elelogin.sendKeys("Demosalesmanager");
		elepass.sendKeys("crmsfa");
		System.out.println(driver.findElement(By.xpath("//h2[text()='Leaftaps Login']")).getText());
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Leaftaps')]")).getText());
		driver.findElement(By.className("decorativeSubmit")).click();
			}
	}




}
