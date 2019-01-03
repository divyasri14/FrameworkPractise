package commonlibs.implementation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonlibs.contracts.iDropDown;

public class DropDownControl implements iDropDown {
	
	private Select getElement(WebElement element) {
		
		Select select = new Select(element);
		 return select;
	}

	@Override
	public void selectViaVisibleText(WebElement element, String visibleText) throws Exception {
		
		getElement(element).selectByVisibleText(visibleText);
		
	}

	@Override
	public void selectViaValue(WebElement element, String value) throws Exception {
		getElement(element).selectByValue(value);
		
	}

	@Override
	public void selectViaIndex(WebElement element, int index) throws Exception {
		
		getElement(element).selectByIndex(index);
	}

	@Override
	public boolean isMultiple(WebElement element) throws Exception {
		
		return getElement(element).isMultiple();
	}

	@Override
	public List<WebElement> getAllOptions(WebElement element) throws Exception {
		
		return getElement(element).getOptions();
	}

	@Override
	public List<WebElement> getAllSelectedOptions(WebElement element) throws Exception {
		
		 return getElement(element).getAllSelectedOptions();
	}

	@Override
	public WebElement getFirstSectedOption(WebElement element) throws Exception {
		
		return getElement(element).getFirstSelectedOption();
	}

}
