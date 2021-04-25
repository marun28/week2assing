package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week2day1Assignment {

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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("expleo");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arun");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		WebElement eledropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(eledropdown1);
		dd1.selectByVisibleText("Partner");
	//Select Marketging campaign
		WebElement eledropdown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2 = new Select(eledropdown2);
		dd2.selectByVisibleText("Automobile");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("testleaf1");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/24/21");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("first");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("training");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
		//Select Preferred Currency
		WebElement eledropdown3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dd3 = new Select(eledropdown3);
		dd3.selectByVisibleText("AFA - Afghani");
		//Thread.sleep(2000);
		//Select Industry
		WebElement eledropdown4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd4 = new Select(eledropdown4);
		dd4.selectByVisibleText("Aerospace");
		//number of employees
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
		//select partnership
		WebElement eledropdown5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd5 = new Select(eledropdown5);
		dd5.selectByVisibleText("Partnership");
		//sic code
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("9876");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("9");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("9");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("first application");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("note");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("01");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("033");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("0436343");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("043");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("newname");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@mail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("urlaafa.com");
		//to name
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("totestname");
		//attention name 
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("attname");
		//address line1
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("street1");
		//address line2 
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("street2");
		//city
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Dublin");
		//sate/province-dropdown
		WebElement eledropdown51 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd51 = new Select(eledropdown51);
		dd51.selectByVisibleText("Alabama");
		//Zip
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("6543");
		//country dropdown
		WebElement eledropdown6 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd6 = new Select(eledropdown6);
		dd6.selectByVisibleText("Afghanistan");
		//zip/postal code
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("6543");
		//zip/postal code Extension
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("6543");
		//Create buttom
		driver.findElement(By.name("submitButton")).click();
		//Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//company name
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		//new company name 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("amaze");
		driver.findElement(By.name("submitButton")).click();
		String text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text1);
		driver.close();
		
		
		
//		
	}

}
