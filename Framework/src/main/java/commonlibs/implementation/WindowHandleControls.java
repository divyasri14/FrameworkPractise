package commonlibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;
import commonlibs.contracts.iWindowHandles;

public class WindowHandleControls implements iWindowHandles {
	
	
	WebDriver driver;
	
	public void  WindowHandleControls(WebDriver driver) {
		this.driver =driver;
		
	}
	
	

	@Override
	public void switchToAnyWindow(String windowhandle) throws Exception {
		
		driver.switchTo().window(windowhandle);
		
		
	}

	@Override
	public void switchToAnyWindow(int childWindowIndex) throws Exception {
	String  childWindow= 	driver.getWindowHandles().toArray()[childWindowIndex].toString();
	
	driver.switchTo().window(childWindow);
		
		
	}

	@Override
	public String getWindowHandle() throws Exception {
		
		return driver.getWindowHandle();
	}

	@Override
	public Set<String> getWindowHandles() throws Exception {
		
		return driver.getWindowHandles();
	}

}
