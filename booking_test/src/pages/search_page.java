package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.*;


public class search_page {
	
	WebDriver driver;
	
	By search_city = By.name("ss");
	By calendar = By.className("xp__dates-inner");
	By arrival_date = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='вс'])[2]/following::span[14]");
	By date_departure = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='вс'])[18]/following::span[20]");
	By button_submit = By.className("sb-searchbox__button");
	
	public search_page(WebDriver driver){
        this.driver = driver;
	}
	
	
	public void set_city_name(){

        driver.findElement(search_city).sendKeys("Ќью-…орк, Ўтат Ќью-…орк, —Ўј");
    }
	
	
	public void click_calendar(){

        driver.findElement(calendar).click();
	}
	
	
	public void set_arrival_date(){
        driver.findElement(arrival_date).click();
   }
	
	public void set_date_departure(){
        driver.findElement(date_departure).click();
   }
	
	public void click_Login(){

        driver.findElement(button_submit).click();
	}
	
}
