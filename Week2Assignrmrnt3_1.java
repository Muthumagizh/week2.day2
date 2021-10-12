package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.java.swing.plaf.windows.resources.windows;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignrmrnt3_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.close();
		Thread.sleep(2000);
		WebElement elelogin=driver.findElement(By.id("username"));
		WebElement elepass=driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]"));
		elelogin.sendKeys("Demosalesmanager");
		elepass.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[3]")).click();
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[2]")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Muthukumaran");
		driver.findElement(By.id("lastNameField")).sendKeys("Kaliyamoorthy");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Muthu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("K");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("SCB@SCB.com");
		WebElement state= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select statedrwn= new Select(state);
		statedrwn.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[1]")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("important note");
		driver.findElement(By.xpath("//td[@colspan='4']//input")).click();
		System.out.println(driver.getTitle());
	}
	}
