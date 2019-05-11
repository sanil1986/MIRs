package mirsBase;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
	
	Properties prop = new Properties();
	FileInputStream fis= new FileInputStream("C:\\Users\\sanil1986\\git\\test2\\MIRs\\src\\main\\java\\mirsBase\\data.properties");
	prop.load(fis);
	String browser = prop.getProperty("browser");
	
	if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
		
	}
	else if (browser.equals("firefox"))
	{
		
	}
	else if (browser.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sanil1986\\Desktop\\eclipse\\MicrosoftWebDriver.exe");
		driver = new InternetExplorerDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	return driver;
}
}
