# CRM
jenkins integratio os crm with git
package com.qa.sikulix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class CaptureYoutubeVideoImage {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		WebDriver driver = new FirefoxDriver();
		// maximize window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the url
		driver.get("https://www.youtube.com/watch?v=8Dh_4ql4L84");
		Screen s = new Screen();
		//pattrn for play buttn
		/*Pattern playimg = new Pattern("YT_Play.PNG");
		s.wait(playimg, 2000);
		s.click();*/
		//pattern for settings button
		Pattern settings = new Pattern("YT_Settings.PNG");
		s.wait(settings, 2000);
		s.click();
		

	}

}
