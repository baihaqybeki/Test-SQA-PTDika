package com.sqa.test.ptdika.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sqa.test.ptdika.driver.DriverSingleton;

public class RentCar {
	
	private WebDriver driver;
	
	public RentCar() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-16uyjmq r-rs99b7 r-18yzcnr r-1777fci r-yc9v9c']//div[@class='css-1dbjc4n r-1q9bdsx r-d045u9 r-tbmifm r-16eto9q']")
	private WebElement noDriverRadio;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-16uyjmq r-rs99b7 r-18yzcnr r-1777fci r-yc9v9c']//div[@class='css-1dbjc4n r-1q9bdsx r-d045u9 r-tbmifm r-16eto9q']")
	private WebElement withDriverRadio;
	
	@FindBy(xpath = "//input[@placeholder='Cari kota atau wilayah']")
	private WebElement location;
	
	@FindBy(xpath = "//div[@aria-label='Jakarta']//h3[@role='heading']")
	private WebElement resultLocation;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[5]/div/div[2]/div/div/div[4]/div[1]/div/div[1]/input")
	private WebElement date;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[5]/div/div[2]/div/div/div[4]/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[3]/div[23]/div")
	private WebElement calendar;
	
	@FindBy(xpath = "")
	private WebElement dashboard;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[5]/div/div[2]/div/div/div[4]/div[5]/div/div[1]/input")
	private WebElement hours;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1loqt21 r-1777fci r-tuq35u r-1otgn73 r-1i6wzkk r-lrvibr']//div[@class='css-901oao r-1sixt3s r-1b43r93 r-majxgm r-rjixqe r-q4m81j'][normalize-space()='8']")
	private WebElement eightClock;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]")
	private WebElement zeroMinute;
	
	@FindBy(xpath = "//div[@class='css-901oao r-1sixt3s r-cygvgh r-b88u0q r-1iukymi r-q4m81j']")
	private WebElement doneBtn;
	
	@FindBy(xpath = "//div[@class='css-18t94o4 css-1dbjc4n r-kdyh1x r-oo3563 r-1loqt21 r-10paoce r-1e081e0 r-5njf8e r-1otgn73 r-lrvibr']//div[@class='css-1dbjc4n r-1awozwy r-13awgt0 r-18u37iz r-1777fci r-6dt33c']")
	private WebElement searchCarBtn;
	
	public void noDriver() {
		noDriverRadio.click();
		delay(1);
	}
	
	public void withDriver() {
		withDriverRadio.click();
	}
	
	public void fillLocation() {
		this.location.sendKeys("Jakarta");
		delay(1);
		resultLocation.click();
	}
	
	public void fillDate() {
		date.click();
		calendar.click();
	}
	
	public void fillTime() {
		hours.click();
		delay(1);
		eightClock.click();
		zeroMinute.click();
		doneBtn.click();
		delay(1);
	}
	
	public void clickSearch() {
		searchCarBtn.click();
	}
	
	public String getLink() {
		return driver.getCurrentUrl();
	}
	
	static void delay(int second) {
		try {
			Thread.sleep(second*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}




