package test;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import pages.search_page;
import pages.block_search;
import pages.comparison_function;

public class test {
	  private WebDriver driver;
	  private StringBuffer verificationErrors = new StringBuffer();
	 // search_page objsearch_page;

	  @Before
	  public void setUp() {
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files (x86)\\Google\\Chrome\\Application\\webDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	
	  @Test
	  public void testCase() throws Exception {
		  
		 
		 driver.get("https://www.booking.com");
		 search_page start_search = new search_page(driver);
		 block_search search = new block_search(driver);
		 comparison_function comparison = new comparison_function(driver);
		 
		 
		 start_search.set_city_name();
		 TimeUnit.SECONDS.sleep(1);
		 start_search.click_calendar();
		 start_search.set_arrival_date();
		 start_search.set_date_departure();
		 start_search.click_Login();
		 
		 
		 Boolean result = comparison.description(search.block_first());
		 if (result!=true)
		 {
			 comparison.error();
			 driver.close();
		 }
		 TimeUnit.SECONDS.sleep(1);
		 result = comparison.description(search.block_second());
		 if (result!=true)
		 {
			 comparison.error();
			 driver.close();
		 }
		 TimeUnit.SECONDS.sleep(1);
		 result = comparison.description(search.block_third());
		 if (result!=true)
		 {
			 comparison.error();
			 driver.close();
		 }
		 TimeUnit.SECONDS.sleep(1);
		 result = comparison.description(search.center_first());
		 if (result!=true)
		 {
			 comparison.error();
			 driver.close();
		 }
		 TimeUnit.SECONDS.sleep(1);
		 result = comparison.description(search.center_second());
		 if (result!=true)
		 {
			 comparison.error();
			 driver.close();
		 }
		 TimeUnit.SECONDS.sleep(1);
		 result = comparison.description(search.center_third());
		 if (result!=true)
		 {
			 comparison.error();
			 driver.close();
		 }
		 TimeUnit.SECONDS.sleep(1);
		 result = comparison.description(search.end_first());
		 if (result!=true)
		 {
			 comparison.error();
			 driver.close();
		 }
		 TimeUnit.SECONDS.sleep(1);
		 result = comparison.description(search.end_second());
		 if (result!=true)
		 {
			 comparison.error();
			 driver.close();
		 }
		 TimeUnit.SECONDS.sleep(1);
		 result = comparison.description(search.end_third());
		 if (result!=true)
		 {
			 comparison.error();
			 driver.close();
		 }
		 
	 }
	  
	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
}