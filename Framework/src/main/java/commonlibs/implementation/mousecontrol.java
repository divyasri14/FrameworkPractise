package commonlibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import commonlibs.contracts.iMouseOperation;

public class mousecontrol implements iMouseOperation {
	
	WebDriver driver;
	public mousecontrol(WebDriver driver) {
		
		this.driver =driver;
	}
	
	private Actions getaction() {
		Actions action =new Actions(driver);
		return action;
		
	}
	

	@Override
	public void dragAndDrop(WebElement element1, WebElement element2) throws Exception {
		
		getaction().dragAndDrop(element1, element2).build().perform();
	}

	@Override
	public void moveToElement(WebElement element) throws Exception {
	getaction().moveToElement(element).build().perform();
	}

	@Override
	public void rightClick(WebElement element) throws Exception {
		getaction().contextClick(element).build().perform();
		
	}

	@Override
	public void doubleClick(WebElement element) throws Exception {
		getaction().doubleClick(element).build().perform();
		
	}

	@Override
	public void moveToElementAndClick(WebElement element) throws Exception {
		getaction().moveToElement(element).click().build().perform();
	}

}
