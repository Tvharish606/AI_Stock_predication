package Step_definations_AI_Stock;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Pom_Package.Pom_AI_Stock;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class Finanacial_Ratio 
{
	WebDriver driver;
	public Pom_AI_Stock AI_stock;
	public WebDriverWait wait;
	
	@After
	public void TakescreenShot(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] Src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(Src,"Image.png","Screenshot");
			
		}
	}
	
	@Given("open the Browser and and enter the URL")
	public void open_the_browser_and_and_enter_the_url() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8501/");
		Thread.sleep(6000);
	}

	@When("user click on finanacial radio button")
	public void user_click_on_finanacial_radio_button() throws InterruptedException
	{
		
	 AI_stock=new Pom_AI_Stock(driver);
	 AI_stock.Finanical_radio_button();
	 Thread.sleep(4000);
	 
	 
	}

	@Then("User able to see the Finanacial Ratio page")
	public void user_able_to_see_the_finanacial_ratio_page()
	{
		String Excepted_Finanacial_page_heading="Predictive Investing: The Next Frontier in Financial Markets";
		WebElement Finanacial_page_heading = driver.findElement(By.xpath("//span[text()='Predictive Investing: The Next Frontier in Financial Markets']"));
		String Actual_Finanacial_heading_page = Finanacial_page_heading.getText();
		if(Excepted_Finanacial_page_heading.equals(Actual_Finanacial_heading_page))
		{
			Assert.assertTrue(true);
		}
		
		
	}

	@When("User select the Stock AAPL")
	public void user_select_the_stock_aapl() throws InterruptedException 
	{
	    AI_stock=new Pom_AI_Stock(driver);
	    Actions A=new Actions(driver);
	    A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("AAPL").perform();
	    Thread.sleep(2000);
	    AI_stock.AAPL_suggestion_Searech();
	}

	@When("click on Predict button")
	public void click_on_predict_button() throws InterruptedException
	{
	  AI_stock=new Pom_AI_Stock(driver);
	 
	  AI_stock.Predict_button();
	    
	}

	@Then("user able to see the AAPL Results of the particular Stock")
	public void user_able_to_see_the_AAPL_Results_of_the_particular_Stock()
	{
		wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Stock Name : AAPL']")));
		WebElement AAPL_Finanacial_results = driver.findElement(By.xpath("//span[text()='Stock Name : AAPL']"));
	    String AAPL_Actual_Finanacial_results = AAPL_Finanacial_results.getText();
	    String AAPL_Excepted_Finanacial_results="Stock Name : AAPL";
	    if(AAPL_Actual_Finanacial_results.equals(AAPL_Excepted_Finanacial_results))
	    {
	    	Assert.assertTrue(true);
	    }
	 
	 }
	
	@When("User select the Stock ADBE")
	public void user_select_the_stock_adbe() throws InterruptedException 
	{
		AI_stock=new Pom_AI_Stock(driver);
	    Actions A=new Actions(driver);
	    A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("ADBE").perform();
	    Thread.sleep(2000);
	    AI_stock.ADBE_suggestion_Searech();
	}
	
	@Then("user able to see the ADBE Results of the particular Stock")
	public void user_able_to_see_the_ADBE_Results_of_the_particular_Stock()
	{
		wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Stock Name : ADBE']")));
		WebElement ADBE_Finanacial_results = driver.findElement(By.xpath("//span[text()='Stock Name : ADBE']"));
	    String ADBE_Actual_Finanacial_results = ADBE_Finanacial_results.getText();
	    String ADBE_Excepted_Finanacial_results="Stock Name : ADBE";
	    if(ADBE_Actual_Finanacial_results.equals(ADBE_Excepted_Finanacial_results))
	    {
	    	Assert.assertTrue(true);
	    }
	    
	}

	@When("User select the Stock AMZN")
	public void user_select_the_stock_amzn() throws InterruptedException 
	{
		AI_stock=new Pom_AI_Stock(driver);
	    Actions A=new Actions(driver);
	    A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("AMZN").perform();
	    Thread.sleep(2000);
	    AI_stock.AMZN_suggestion_Searech();  
	}
	
	@Then("user able to see the AMZN Results of the particular Stock")
	public void user_able_to_see_the_AMZN_Results_of_the_particular_Stock()
	{
		wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Stock Name : AMZN']")));
		WebElement AMZN_Finanacial_results = driver.findElement(By.xpath("//span[text()='Stock Name : AMZN']"));
	    String AMZN_Actual_Finanacial_results = AMZN_Finanacial_results.getText();
	    String AMZN_Excepted_Finanacial_results="Stock Name : AMZN";
	    if(AMZN_Actual_Finanacial_results.equals(AMZN_Excepted_Finanacial_results))
	    {
	    	Assert.assertTrue(true);
	    }
	    
	}
	

	@When("User select the Stock MSFT")
	public void user_select_the_stock_msft() throws InterruptedException 
	{
		AI_stock=new Pom_AI_Stock(driver);
	    Actions A=new Actions(driver);
	    A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("MSFT").perform();
	    Thread.sleep(2000);
	    AI_stock.MSFT_suggestion_Searech();  
	}
	
	@Then("user able to see the MSFT Results of the particular Stock")
	public void user_able_to_see_the_MSFT_Results_of_the_particular_Stock()
	{
		wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Stock Name : MSFT']")));
		WebElement MSFT_Finanacial_results = driver.findElement(By.xpath("//span[text()='Stock Name : MSFT']"));
	    String MSFT_Actual_Finanacial_results = MSFT_Finanacial_results.getText();
	    String MSFT_Excepted_Finanacial_results="Stock Name : MSFT";
	    if(MSFT_Actual_Finanacial_results.equals(MSFT_Excepted_Finanacial_results))
	    {
	    	Assert.assertTrue(true);
	    }
	   
	}
	

	@When("User select the Stock COST")
	public void user_select_the_stock_cost() throws InterruptedException
	{
		AI_stock=new Pom_AI_Stock(driver);
	    Actions A=new Actions(driver);
	    A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("MSFT").perform();
	    Thread.sleep(2000);
	    AI_stock.MSFT_suggestion_Searech();  
	}
	
	@Then("user able to see the COST Results of the particular Stock")
	public void user_able_to_see_the_COST_Results_of_the_particular_Stock()
	{
		wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Stock Name : COST']")));
		WebElement COST_Finanacial_results = driver.findElement(By.xpath("//span[text()='Stock Name : COST']"));
	    String COST_Actual_Finanacial_results = COST_Finanacial_results.getText();
	    String COST_Excepted_Finanacial_results="Stock Name : COST";
	    if(COST_Actual_Finanacial_results.equals(COST_Excepted_Finanacial_results))
	    {
	    	Assert.assertTrue(true);
	    }
	   
	}

	@When("User select the Stock META")
	public void user_select_the_stock_meta() throws InterruptedException 
	{
		AI_stock=new Pom_AI_Stock(driver);
	    Actions A=new Actions(driver);
	    A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("META").perform();
	    Thread.sleep(2000);
	    AI_stock.META_suggestion_Searech();
	}
	
	@Then("user able to see the META Results of the particular Stock")
	public void user_able_to_see_the_META_Results_of_the_particular_Stock()
	{
		wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Stock Name : META']")));
		WebElement META_Finanacial_results = driver.findElement(By.xpath("//span[text()='Stock Name : META']"));
	    String META_Actual_Finanacial_results = META_Finanacial_results.getText();
	    String META_Excepted_Finanacial_results="Stock Name : META";
	    if(META_Actual_Finanacial_results.equals(META_Excepted_Finanacial_results))
	    {
	    	Assert.assertTrue(true);
	    }
	  
	}

	@When("User select the Stock GOOG")
	public void user_select_the_stock_goog() throws InterruptedException
	{
		AI_stock=new Pom_AI_Stock(driver);
	    Actions A=new Actions(driver);
	    A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("GOOG").perform();
	    Thread.sleep(2000);
	    AI_stock.GOOG_suggestion_Searech();
	}
	
	@Then("user able to see the GOOG Results of the particular Stock")
	public void user_able_to_see_the_GOOG_Results_of_the_particular_Stock()
	{
		wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Stock Name : GOOG']")));
		WebElement GOOG_Finanacial_results = driver.findElement(By.xpath("//span[text()='Stock Name : GOOG']"));
	    String GOOG_Actual_Finanacial_results = GOOG_Finanacial_results.getText();
	    String GOOG_Excepted_Finanacial_results="Stock Name : GOOG";
	    if(GOOG_Actual_Finanacial_results.equals(GOOG_Excepted_Finanacial_results))
	    {
	    	Assert.assertTrue(true);
	    }
	    
	}

	@When("User select the Stock TSLA")
	public void user_select_the_stock_tsla() throws InterruptedException
	{
		AI_stock=new Pom_AI_Stock(driver);
	    Actions A=new Actions(driver);
	    A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("TSLA").perform();
	    Thread.sleep(2000);
	    AI_stock.TSLA_suggestion_Searech();  
	}
	
	@Then("user able to see the TSLA Results of the particular Stock")
	public void user_able_to_see_the_TSLA_Results_of_the_particular_Stock()
	{
	
		wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Stock Name : TSLA']")));
		WebElement TSLA_Finanacial_results = driver.findElement(By.xpath("//span[text()='Stock Name : TSLA']"));
	    String TSLA_Actual_Finanacial_results = TSLA_Finanacial_results.getText();
	    String TSLA_Excepted_Finanacial_results="Stock Name : TSLA";
	    if(TSLA_Actual_Finanacial_results.equals(TSLA_Excepted_Finanacial_results))
	    {
	    	Assert.assertTrue(true);
	    }
	}
}
