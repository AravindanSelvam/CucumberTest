package org.test;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class MapData {
	static WebDriver driver;
	@Given("The user is in the gurutelecom page")
	public void the_user_is_in_the_gurutelecom_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravindan\\eclipse-workspace new\\CucumberNew\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		    driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("The user goes to add customer page")
	public void the_user_goes_to_add_customer_page() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("The user fills in the customer page")
	public void the_user_fills_in_the_customer_page(DataTable TarrifCharges) {
		Map<String, String> TarrifChargesMap = TarrifCharges.asMap(String.class, String.class);
		System.out.println(TarrifCharges);
		driver.findElement(By.id("rental1")).sendKeys(TarrifChargesMap.get("MR"));
		driver.findElement(By.id("local_minutes")).sendKeys(TarrifChargesMap.get("FLM"));
		driver.findElement(By.id("inter_minutes")).sendKeys(TarrifChargesMap.get("FIM"));
		driver.findElement(By.id("sms_pack")).sendKeys(TarrifChargesMap.get("FSP"));
		driver.findElement(By.id("minutes_charges")).sendKeys(TarrifChargesMap.get("LPMC"));
		driver.findElement(By.id("inter_charges")).sendKeys(TarrifChargesMap.get("IPMC"));
		driver.findElement(By.id("sms_charges")).sendKeys(TarrifChargesMap.get("SPC"));

	}

	@When("The user click submit button")
	public void the_user_click_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the success message in final page")
	public void the_user_should_see_the_success_message_in_final_page() {
		Assert.assertEquals("Congratulation you add Tariff Plan",driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText());
	}
	
}