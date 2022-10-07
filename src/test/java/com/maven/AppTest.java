package com.maven;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.BrowserSelection;
import com.Utility.Utility;

public class AppTest 
{
	WebDriver driver;
	SearchFlight searchFlightObj;
	OneStopFlightWithLeastFare flObj;
	Utility utilityObj = new Utility();


	@BeforeTest
	public void setupInitiation()
	{ 
		BrowserSelection browserObj = new BrowserSelection();
		driver = browserObj.usingChrome();		
		searchFlightObj = PageFactory.initElements(driver, SearchFlight.class);
		flObj = PageFactory.initElements(driver, OneStopFlightWithLeastFare.class);
	}

	@Test
	public void verifyOneStopFlightCount() throws IOException {
		searchFlightObj.searchFlightsBetweenSourceToDestination(driver, utilityObj.getValueFromProp("url"), utilityObj.getValueFromProp("source"), utilityObj.getValueFromProp("destination"));
		System.out.println("No. of Flights having one stop--> "+ flObj.getOneStopFlightCount());
		System.out.println("Branch2Minimum fare from source to destination is--> " +flObj.getMinimumFare());

	}
	@AfterTest
	public void tearDown()
	{ 
		driver.quit();
	}

}
