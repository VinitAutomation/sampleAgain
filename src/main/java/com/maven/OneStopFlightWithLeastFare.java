package com.maven;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utility.Utility;

public class OneStopFlightWithLeastFare {

	WebDriver driver;
	Utility utilityObj = new Utility();

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'filtersCollapsOuter append_bottom20')]//span[2]//label[1]//div[1]//div[1]//p[1]")
	@CacheLookup
	private WebElement oneStopFlightCount;

	@FindBy(how = How.XPATH, using = "//span[2]//label[1]//div[1]//div[1]//p[2]")
	@CacheLookup
	private WebElement minPrice;

	public OneStopFlightWithLeastFare(WebDriver driver) {
		this.driver=driver;
	}

	public String getOneStopFlightCount(){
		try {
		utilityObj.getWhenVisible(oneStopFlightCount, driver);
		String str = oneStopFlightCount.getText();
		String[] strArray = str.split(" ");
		str = strArray[2].substring(1, strArray[2].length()-1);
		return str;
	}catch(Exception e) {
		try {
			utilityObj.takeSnapShot(driver, System.getProperty("user.dir")+File.separator+"Snapshot"+File.separator+utilityObj.getTimeStamp()+"test.png");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		e.printStackTrace();
	}return null;
	}

	public String getMinimumFare(){
		try {
		utilityObj.getWhenVisible(minPrice, driver);
		String str = minPrice.getText();
		String[] strArray = str.split(" ");
		return strArray[1];
	}catch(Exception e) {
		try {
			utilityObj.takeSnapShot(driver, System.getProperty("user.dir")+File.separator+"Snapshot"+File.separator+"test.png");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		e.printStackTrace();
	}return null;
	}
}
