package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week2day2assingment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElementById("firstNameField").sendKeys("Arun");
		driver.findElementById("lastNameField").sendKeys("april");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("local");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("last");
		driver.findElementById("createContactForm_departmentName").sendKeys("Sele");
		driver.findElementById("createContactForm_description").sendKeys("love selenium");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("Selenium@gmail.com");
		//State/Prov - Dropdwon
		WebElement eledropdown1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd1 = new Select(eledropdown1);
		dd1.selectByVisibleText("Alabama");
		Thread.sleep(2000);
		//CLick Create button
		driver.findElement(By.name("submitButton")).click();
		//edit button
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("inportantlearaning");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String text1 = driver.findElement(By.id("viewContact_fullName_sp")).getText();
		System.out.println(text1);
		
		//driver.close();
		
		
		
		
//		
	}

}
