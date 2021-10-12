package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

import com.sun.java.swing.plaf.windows.resources.windows;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Week2Assignment3_3 {
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
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
	driver.findElement(By.xpath("//ul[@class='x-tab-strip x-tab-strip-top']//li[3]")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("Ajith@Ajith.com");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	String fname=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).getText();
	System.out.println(fname);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		Thread.sleep(2000);
		String dup=driver.getTitle();
	if(dup.equals("Duplicate Lead"))
	{
		System.out.println("true");
	}
	driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[1]")).click();
driver.findElement(By.xpath("(//td[@colspan='4']//input)[3]")).click();
String Dupfname=driver.findElement(By.id("viewLead_firstName_sp")).getText();
if (Dupfname.equals(fname)) {
	System.out.println(fname+ "Matches");
	Thread.sleep(2000);
	driver.close();
}
}
	}
