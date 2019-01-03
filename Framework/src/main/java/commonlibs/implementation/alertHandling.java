package commonlibs.implementation;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonlibs.contracts.iAlerts;

public class alertHandling implements iAlerts {
	
	private WebDriver driver;
	
	public alertHandling( WebDriver driver) {
		
		this.driver=driver;
		
	}

	@Override
	public void acceptAlert() throws Exception {
		
		driver.switchTo().alert().accept();
		
		
		
	}

	@Override
	public void rejectAlert() throws Exception {
		
		driver.switchTo().alert().dismiss();
	}

	@Override
	public String getMessageFromAlert() throws Exception {
		
		return driver.switchTo().alert().getText();
	}

}
