package com.qa.sikulix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ClickGoogleButtonBySikulix {

	public static void main(String[] args) throws FindFailed {
		WebDriver driver = new FirefoxDriver();
		// maximize window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the url
		driver.get("https://www.google.co.in/");
		Screen s = new Screen();
		Pattern signin = new Pattern("Signin.PNG");
		s.wait(signin, 2000);
		s.click();
		

	}

}
