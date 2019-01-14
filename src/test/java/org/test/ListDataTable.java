package org.test;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ListDataTable {
	static WebDriver driver;
	@Given("The user is in the telecom home page")
	public void the_user_is_in_the_telecom_home_page() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravindan\\eclipse-workspace new\\CucumberNew\\driver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("The user navigates to add tariff plan page")
	public void the_user_navigates_to_add_tariff_plan_page() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("The user fills in the tariff plan details")
	public void the_user_fills_in_the_tariff_plan_details(DataTable TarrifCharges) {
		List<String> TarrifChargesList = TarrifCharges.asList(String.class);
	    System.out.println(TarrifCharges);
		driver.findElement(By.id("rental1")).sendKeys(TarrifChargesList.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(TarrifChargesList.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(TarrifChargesList.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(TarrifChargesList.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(TarrifChargesList.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(TarrifChargesList.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(TarrifChargesList.get(6));
	}

	@When("The user clicks submit button")
	public void the_user_clicks_submit_button() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("The user sees the success message")
	public void the_user_sees_the_success_message() {
		Assert.assertEquals("Congratulation you add Tariff Plan",driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText());
	}


}
