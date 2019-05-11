package testPackage;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mirsBase.Base;

public class FirstTest2 extends Base {



	WebElement ApplicantTextElement;

/*
	@BeforeTest

	public void browser()
	{
	        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        //System.setProperty("webdriver.ie.driver", "C:\\Users\\sanil1986\\Desktop\\eclipse\\MicrosoftWebDriver.exe");
	        //driver = new InternetExplorerDriver();
	}
	
*/

	@Test(priority=1)
	public void VerifyHomePageTitle() throws IOException
	{
			driver=initializeDriver();
	        String BaseURL = "https://staging-www.mirs.dds.mil/";
	        driver.get(BaseURL);
	        String ExpectedTitle = "USMIRS 1.1";
	        String ActualTitle = driver.getTitle();
	        Assert.assertEquals(ExpectedTitle, ActualTitle);
	        System.out.println("Title match!!");
	        driver.findElement(By.xpath("//div[@class='button-container']/button[@class='button primary undefined']")).click(); }

/*
	@Test(priority=2)


	public void VerifyCACPageloginButtons()
	{
	        String Mepcom = "Proceed as MEPCOM";
	        String medical = "Proceed as Medical";
	        String Liaison = "Proceed as Liaison";
	        String Ops = "Proceed as Ops";
	        String OpsAdmin="Proceed as Ops Admin";
	        String Testing ="Proceed as Testing";
	        String Unauthorized = "Proceed as Unauthorized";
	        Assert.assertEquals(Mepcom, "Proceed as MEPCOM");
	        Assert.assertEquals(medical, "Proceed as Medical");
	        Assert.assertEquals(Liaison, "Proceed as Liaison");
	        Assert.assertEquals(Ops, "Proceed as Ops");
	        Assert.assertEquals(OpsAdmin, "Proceed as Ops Admin");
	        Assert.assertEquals(Testing, "Proceed as Testing");
	        Assert.assertEquals(Unauthorized, "Proceed as Unauthorized");


	}


	@Test(priority =3)


	public void ProceedAsMepcom()
	{
	WebElement ProceedAsMepcom = driver.findElement(By.xpath("//body//input[1]"));
	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	jse2.executeScript("arguments[0].click()", ProceedAsMepcom);

	}

	@Test(priority =4)
	public void VerifyMirsHomePageTitle()
	{ 
	        String HomeTitle = driver.getCurrentUrl();
	        Assert.assertEquals(HomeTitle,"https://staging-www.mirs.dds.mil/home");
	        }


	@Test(priority =5)
	public void VerifyMirsHomePageNavigationMenu() throws InterruptedException
	{
	
	String NavExpanded = driver.findElement(By.xpath("//div[@class='navigation-menu expanded']")).getAttribute("class");
	Assert.assertEquals(NavExpanded, "navigation-menu expanded");
	WebElement NavHamburgerIcon = driver.findElement(By.xpath("//div[@class='hamburger-icon-wrapper']"));
	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	jse2.executeScript("arguments[0].click()", NavHamburgerIcon);

	String NavMinimized = driver.findElement(By.xpath("//div[@class='navigation-menu minimized']")).getAttribute("class");
	Assert.assertEquals(NavMinimized, "navigation-menu minimized");
	Thread.sleep(3000);
	jse2.executeScript("arguments[0].click()", NavHamburgerIcon);

	}

	@Test(priority=6)
	public void VerifyApplicantPage()
	{
	        driver.findElement(By.xpath("//body//a[2]")).click();
	        ApplicantTextElement = (new WebDriverWait(driver, 10))
	                          .until(ExpectedConditions.presenceOfElementLocated(By.className("applicant-list-header-title")));
	        String ApplicantsText = driver.findElement(By.xpath("//h1[@class='applicant-list-header-title']")).getText();
	        Assert.assertEquals(ApplicantsText, "Applicants");
	}

	
	@Test(priority=7)
	public void ClickApplicantButtonAndVerifyPage()
	{
		driver.findElement(By.xpath("//div[@class='button primary']")).click();
		//https://staging-www.mirs.dds.mil/applicants/new
		Assert.assertEquals(driver.getCurrentUrl(), "https://staging-www.mirs.dds.mil/applicants/new");	
		Assert.assertEquals(driver.findElement(By.xpath("//h2[contains(text(),'Add New Applicant')]")).getText(), "Add New Applicant");
		Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Add New Applicant')]")).getText(), "Add New Applicant");
		Assert.assertEquals(driver.findElement(By.xpath("//h3[contains(text(),'Service Processing Information*')]")).getText(), "SERVICE PROCESSING INFORMATION*");	
			
	}
	/*	
	@Test(priority=8)
	public void AddApplicant()
	{
		
	}

	@AfterTest

	public void close()
	{
	        System.out.println("pass");
	}

*/

	}




