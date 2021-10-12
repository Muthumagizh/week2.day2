package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

import com.sun.java.swing.plaf.windows.resources.windows;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Week2Assignement3_4 {
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
		//driver.findElement(By.xpath("//ul[@class='x-tab-strip x-tab-strip-top']//li[3]")).click();
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("Ajith");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String id=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[3]")).click();
		
		String newcmpname="Muthu";
		
		System.out.println(newcmpname);
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(newcmpname);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String upcmpname=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		Thread.sleep(1000);
		System.out.println(upcmpname);
		String upcmpname1=upcmpname.substring(0, 5);
		if (newcmpname.equals(upcmpname1)) {
			
			System.out.println("update sucess");
			
		}
	}
	}

