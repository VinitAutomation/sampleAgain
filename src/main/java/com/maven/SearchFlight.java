package com.maven;

import java.io.File;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utility.Utility;

public class SearchFlight 
{
	WebDriver driver;
	Utility utilityObj = new Utility();

	@FindBy(how = How.ID, using = "fromCity")
	@CacheLookup
	private WebElement fromCity;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Delhi, India')]")
	@CacheLookup
	private WebElement clickFromCity;

	@FindBy(how = How.ID, using = "toCity")
	@CacheLookup
	private WebElement toCity;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='To']")
	@CacheLookup
	private WebElement toCityTextBox;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Mumbai, India')]")
	@CacheLookup
	private WebElement clickToCity;

	@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'From')]")
	@CacheLookup
	private WebElement enterTextInFrom;

	@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'To')]")
	@CacheLookup
	private WebElement enterTextInTo; 

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'DEPARTURE')]")
	@CacheLookup
	private WebElement departure;

	@FindBy(how = How.XPATH, using = "//a[contains(@class,'primaryBtn font24 latoBold widgetSearchBtn')]")
	@CacheLookup
	private WebElement searchBtn;

	//Initializing WebDriver instance using constructor
	public SearchFlight(WebDriver driver) {
		this.driver=driver;
	}

	/*Select any Flight from any source to 
	 * destination(say for e.g Delhi to Mumbai) on a date
	30 days later from the current date*/
	public void searchFlightsBetweenSourceToDestination(WebDriver driver, String url, String src, String dstn) {
		//Launching URL
		try {
		driver.get(url);
		
		utilityObj.hardWait(3);
		utilityObj.clickUsingJavaScript(driver, fromCity);
		fromCity.sendKeys(src);
		utilityObj.clickUsingJavaScript(driver, clickFromCity);
		utilityObj.hardWait(2);
		utilityObj.getWhenVisible(toCity, driver);
		toCityTextBox.sendKeys(dstn);
		utilityObj.getWhenVisible(clickToCity, driver);
		utilityObj.clickUsingJavaScript(driver, clickToCity);
		utilityObj.clickUsingJavaScript(driver, departure);
		//get one month later date
		String pickDate = utilityObj.selectOneMonthLaterDate();
		System.out.println("Select Next Month date--> "+pickDate);
		WebElement pickDateNextMonth = driver.findElement(By.xpath("//div[@class='DayPicker-Day']//p[contains(text(),'"+utilityObj.selectOneMonthLaterDate()+"')]"));
		utilityObj.clickUsingJavaScript(driver, pickDateNextMonth);
		utilityObj.hardWait(1);
		utilityObj.clickUsingJavaScript(driver, searchBtn);
		}catch(Exception e) {
			try {
				utilityObj.takeSnapShot(driver, System.getProperty("user.dir")+File.separator+"Snapshot"+File.separator+"test.png");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}








}
