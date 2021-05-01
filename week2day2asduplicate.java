package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week2day2asduplicate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@id='ext-gen315']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("selenium@gmai;.com");
		driver.findElement(By.linkText("10029")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String text1 = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(text1);
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
		
		
		
		
		
//		
	}

}
