package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class block_search {

WebDriver driver;
	
	By first_block = By.xpath("//div[@id='hotellist_inner']/div[1]/div[2]/div[1]/div[1]");
	By second_block = By.xpath("//div[@id='hotellist_inner']/div[2]/div[2]/div[1]/div[1]");
	By third_block = By.xpath("//div[@id='hotellist_inner']/div[4]/div[2]/div[1]/div[1]");
	By first_center = By.xpath("//div[@id='hotellist_inner']/div[30]/div[2]/div[1]/div[1]");
	By second_center = By.xpath("//div[@id='hotellist_inner']/div[31]/div[2]/div[1]/div[1]");
	By third_center = By.xpath("//div[@id='hotellist_inner']/div[32]/div[2]/div[1]/div[1]");
	By first_end = By.xpath("//div[@id='hotellist_inner']/div[58]/div[2]/div[1]/div[1]");
	By second_end = By.xpath("//div[@id='hotellist_inner']/div[59]/div[2]/div[1]/div[1]");
	By third_end = By.xpath("//div[@id='hotellist_inner']/div[60]/div[2]/div[1]/div[1]");
	
	public block_search(WebDriver driver){
        this.driver = driver;
	}
			
	public String block_first(){
		String block_first = driver.findElement(first_block).getText();
		return block_first;
    }
	
	public String block_second(){
        String block_second = driver.findElement(second_block).getText();
        return block_second;
    }
	
	public String block_third(){
        String block_third = driver.findElement(third_block).getText();
        return block_third;
    }
	
	public String center_first(){
        String center_first = driver.findElement(first_center).getText();
        return center_first;
    }
	
	public String center_second(){
        String center_second = driver.findElement(second_center).getText();
        return center_second;
    }
	
	public String center_third(){
        String center_third = driver.findElement(third_center).getText();
        return center_third;
    }
	
	public String end_first(){
        String end_first = driver.findElement(first_end).getText();
        return end_first;
    }
	
	public String end_second(){
        String end_second = driver.findElement(second_end).getText();
        return end_second;
    }
	
	public String end_third(){

        String end_third = driver.findElement(third_end).getText();
        return end_third;
    }
}
