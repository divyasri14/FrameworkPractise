package commonlibs.implementation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import commonlibs.contracts.iJavaScript;

public class javaOperations implements iJavaScript {
	
	WebDriver driver;
	
	public javaOperations(WebDriver driver) {
		this.driver= driver;
	}
	
	private JavascriptExecutor getJSEngine() {
		
		
		JavascriptExecutor jsEngine = (JavascriptExecutor) driver;
		return jsEngine;
	}

	@Override
	public void executeJavaScript(String scriptToExecute) throws Exception {
		
		getJSEngine().executeScript(scriptToExecute);
		
	}

	@Override
	public void scrollDown(int x, int y) throws Exception {
		
String jsCommand = String.format("windows.ScrollBy(%d%d)",x,y);

getJSEngine().executeScript(jsCommand);
	}

	@Override
	public String executeJavaScriptWithReturnValue(String scriptToExecute) throws Exception {
		//it is retunning object hnce converting to string
		return getJSEngine().executeScript(scriptToExecute).toString();
	}

}
