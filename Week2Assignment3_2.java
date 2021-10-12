package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

import com.sun.java.swing.plaf.windows.resources.windows;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Week2Assignment3_2 {public static void main(String[] args) throws InterruptedException {
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
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
	driver.findElement(By.xpath("//ul[@class='x-tab-strip x-tab-strip-top']//li[2]")).click();
	driver.findElement(By.xpath("(//td[@class='x-table-layout-cell']/div)[14]")).click();
	
	driver.findElement(By.name("phoneNumber")).sendKeys("123");
	String lead=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
	System.out.println(lead);
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[4]")).click();
	driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
	driver.findElement(By.name("id")).sendKeys(lead);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	String norec= driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']//div")).getText();
		if(norec.equals("No records to display"))
	{
		System.out.println(norec);
	}
	driver.close();
	}
}
