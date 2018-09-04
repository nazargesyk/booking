package pages;

import org.openqa.selenium.WebDriver;

public class comparison_function {
	
WebDriver driver;
	
	public comparison_function(WebDriver driver){
        this.driver = driver;
	}
		
	public Boolean description(String description){
		Boolean found = description.contains("Нью-Йорк");
		return found;
    }
	
	public void error(){
		System.out.println("У выборке присутствует не только Нью-Йорк");
    }	
}
