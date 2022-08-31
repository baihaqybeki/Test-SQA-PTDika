package com.sqa.test.ptdika.step;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.sqa.test.ptdika.pages.RentCar;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;

public class RentCarStep {
	
	public static WebDriver driver;
	private RentCar rentCar = new RentCar();
	
	public RentCarStep() {
		driver = Hook.driver;
	}
	
	@When("^navigate url$")
	public void navigate() {
		driver.get("https://www.traveloka.com/id-id/car-rental/region/jakarta?id=6922620413571084446&adloc=id-id&kw=6922620413571084446_&gmt=&gn=x&gd=c&gdm=&gcid=&gdp=&gdt=&gap=&pc=1&cp=6922620413571084446_ID_CR_STAUPR_Mobile_Hygiene_PerfMax_6922620413571084446_&aid=&wid=&fid=&gid=9072593&utm_id=4QdlvZvk&ad_id=&target_id=&click_id=EAIaIQobChMIq82ekuLw-QIV5plmAh1fVAWfEAAYASAAEgI9FvD_BwE&campaign_id=16795957360&adgroup_id=&gclid=EAIaIQobChMIq82ekuLw-QIV5plmAh1fVAWfEAAYASAAEgI9FvD_BwE");
	}
	
	@And("^choose \"([^\"]*)\" option$")
	public void chooseDriver(String option) {
		if (option.equalsIgnoreCase("without driver")) {
			rentCar.noDriver();
		} else if (option.equalsIgnoreCase("with Driver")) {
			rentCar.withDriver();
		}
	}
	
	@And("^fill location$")
	public void fillLocation() {
		rentCar.fillLocation();
	}
	
	@And("^fill date$")
	public void fillDate() {
		rentCar.fillDate();
	}
	
	@And("^fill time$")
	public void fillTime() {
		rentCar.fillTime();
	}
	
	@And("^click search$")
	public void search() {
		rentCar.clickSearch();
	}
	
	@Then("^validate link \"([^\"]*)\"$")
	public void validateLink(String expectedLink) {
		String actualLink = rentCar.getLink();
		assertEquals(actualLink,expectedLink);
	}
}
