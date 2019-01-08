package commonlibs.implementation;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import commonlibs.contracts.iScreenShots;

public class screenShotControl implements iScreenShots {
	
	WebDriver driver;
	public void  screenShotControl(WebDriver driver) {
		this.driver =driver;
		
	}

	@Override
	public String captureAndSaveScreenshot(String fileName) throws Exception {
		fileName = fileName.trim();
		
		File imgfile,tempfile;
		
		imgfile = new File(fileName);
		
		if (imgfile.exists()) {
			
			throw new Exception("File Already Present....");
		}
		
		TakesScreenshot camera;
		
		camera = (TakesScreenshot)driver;
		
		tempfile = camera.getScreenshotAs(OutputType.FILE);
		FileUtils.moveFile(tempfile, imgfile);
		
		
		
		
		return imgfile.getAbsolutePath();
	}

}
