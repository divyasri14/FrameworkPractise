package commonlibs.implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import commonlibs.contracts.iDriver;

public class commonDriver implements iDriver {
	
	
	private  WebDriver driver;
	private int pageloadTimeOut;
	private int elementDetectionTimeOut;
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public void setPageloadTimeOut(int pageloadTimeOut) {
		this.pageloadTimeOut = pageloadTimeOut;
	}


	public void setElementDetectionTimeOut(int elementDetectionTimeOut) {
		this.elementDetectionTimeOut = elementDetectionTimeOut;
	}


	public void invokeBrowser(String Browsertype) throws Exception {
		
		pageloadTimeOut=60;
		elementDetectionTimeOut=10;
		Browsertype =Browsertype.trim();
if(Browsertype.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\chromedriver02122018\\chromedriver.exe");
			driver = new  ChromeDriver();
			
			} 
			else if (Browsertype.equalsIgnoreCase("edge")) {
					
					System.setProperty("webdriver.edge.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\edgedriver\\MicrosoftWebDriver.exe");
					driver = new  EdgeDriver();
			}

			else {
				throw new Exception ("Invalid Browser");
			}
	}


	

	
	

@Override
public void navigateToFirstUrl(String url) throws Exception {
	url = url.trim();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	driver.get(url);
	
}


@Override
public String getTitle() throws Exception {

	return driver.getTitle();
}


@Override
public String getCurrentUrl() throws Exception {
	
	return driver.getCurrentUrl();
}


@Override
public String getPageSource() throws Exception {
	// TODO Auto-generated method stub
	return driver.getPageSource();
}


@Override
public void navigateToUrl(String url) throws Exception {
	url=url.trim();
	driver.navigate().to(url);
	
}


@Override
public void navigateForward() throws Exception {
	driver.navigate().forward();
	
}


@Override
public void navigateBackward() throws Exception {
	driver.navigate().back();
	
}


@Override
public void refresh() throws Exception {
	driver.navigate().refresh();
}


@Override
public void closeBrowser() throws Exception {
	if (driver != null) {
		driver.close();
	}
}


@Override
public void closeAllBrowsers() throws Exception {
	if (driver != null) {
		driver.quit();
	}
	
}

}
