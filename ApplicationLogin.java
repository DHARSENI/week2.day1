package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplicationLogin {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement eleUsername= driver.findElement(By.name("USERNAME"));
		eleUsername.sendKeys("demosalesmanager");
		WebElement elePassword = driver.findElement(By.name("PASSWORD"));
		elePassword .sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DHARSENI");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T S");
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Employee");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Car and Driver");
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hari");
		  driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Priya");
		  driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Welcome");
		  driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("17/02/1999");
		  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Worker");
		  driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("$50000");
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		  driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Media");
		  driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("34567");
		  driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("Corporation");		  
		  driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("67");
		  driver.findElement(By.name("sicCode")).sendKeys("89890-34567");
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("Employee Details");
		  driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("#&");
		  driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Good");
		  //Contact Info
		  driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
		  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("4531674890");
		  driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("7");
		  driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Quick");
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf@gmail.com");
		  driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http:\\www.testleaf.com");
		  //Primary Address
		  driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Dharseni");
		  driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("T S");
		  driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No:4/38");
		  driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Olapattiyar Thottam");
		  driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Namakkal");
		  driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Indiana");		  
		  driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("689567");
		  driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("97987");
		  driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("689567");
		  driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("97987");
		  String strTitle= driver.getTitle();
		  System.out.println(strTitle);		  	            
		  if (strTitle.contains("Create Lead | opentaps CRM")) {
			System.out.println("Tile is available as expected");
		} 
		  else
		  {
				System.out.println("Title is not displayed as expected");
			} 
		  
		  String strName = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		  System.out.println("First Name: "+strName);
		  Thread.sleep(2000);
		  driver.findElement(By.name("submitButton")).click();
		 driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(2000);
		 driver.close();

	}

}
