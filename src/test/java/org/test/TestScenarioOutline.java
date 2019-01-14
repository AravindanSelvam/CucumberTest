package org.test;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestScenarioOutline {
	static WebDriver driver;
	@Given("The user is in the telecom home page s")
	public void the_user_is_in_the_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravindan\\eclipse-workspace new\\CucumberNew\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		    driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("The user navigates to add tariff plan page s")
	public void the_user_navigates_to_add_tariff_plan_page() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("The user fills in the tariff plan detailss {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fills_in_the_tariff_plan_details(String string1, String string2, String string3, String string4, String string5, String string6, String string7) {
		
		driver.findElement(By.id("rental1")).sendKeys(string1);
		driver.findElement(By.id("local_minutes")).sendKeys(string2);
		driver.findElement(By.id("inter_minutes")).sendKeys(string3);
		driver.findElement(By.id("sms_pack")).sendKeys(string4);
		driver.findElement(By.id("minutes_charges")).sendKeys(string5);
		driver.findElement(By.id("inter_charges")).sendKeys(string6);
		driver.findElement(By.id("sms_charges")).sendKeys(string7);
	}

	@When("The user clicks submit button s")
	public void the_user_clicks_submit_button() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("The user sees the success message s")
	public void the_user_sees_the_success_message() {
		Assert.assertEquals("Congratulation you add Tariff Plan",driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText());
	}
}