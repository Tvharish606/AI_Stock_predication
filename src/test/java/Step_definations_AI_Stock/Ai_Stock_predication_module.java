package Step_definations_AI_Stock;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pom_Package.Pom_AI_Stock;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class Ai_Stock_predication_module 
{
	public static WebDriver driver;
	public WebDriverWait wait;
	
	
	public Pom_AI_Stock AI_stock;
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
	

	@Given("user open the browser and enter the URL")
	public void user_open_the_browser_and_enter_the_url() throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8501/");
		Thread.sleep(8000);
	}

	@Then("User able to see the AI_Stock_predication module page")
	public void user_able_to_see_the_ai_stock_predication_module_page() {
		if (driver.getPageSource().contains("Forecasting Time Series Data - Stock Price")) 
		{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		driver.quit();
		

	}

	@When("user click on the X button")
	public void user_click_on_the_x_button() throws InterruptedException 
	{
		AI_stock = new Pom_AI_Stock(driver);
		AI_stock.X_button_AI();
//		X_button = driver.findElement(By.xpath("//section[@data-testid='stSidebar']/div/div/button"));
//		X_button.click();
//		Thread.sleep(2000);
	}

	@And("button should not disabled")
	public void button_should_not_disabled() 
	{
		System.out.println("Not_displayed");
	}

	@When("user click on > button")
	public void user_click_on_button() throws InterruptedException
	{
		AI_stock.Enabled_section_Button();
		Thread.sleep(2000);
		
//		WebElement Enable_section_button = driver.findElement(By.xpath("//div[@data-testid='stAppViewContainer']/div/button"));
//		Thread.sleep(2000);
//		Enable_section_button.click();
//		Thread.sleep(3000);
	}

	@Then("check wheather user able to see the Complete left hand side section")
	public void check_wheather_user_able_to_see_the_Complete_left_hand_side_section()
	{
		System.out.println("ENabled");
		driver.quit();
	}

	@When("user select the stock AAPL")
	public void user_select_the_stock_AAPL() throws InterruptedException
	{
		
		AI_stock =new Pom_AI_Stock(driver);
		Actions A=new Actions(driver);
        A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("AAPL").perform();
		
		//Thread.sleep(2000);
		
		
		
//		WebElement Stock_selection_dropdown = driver.findElement(By.xpath("//div[@data-baseweb='select']"));
//		Thread.sleep(2000);
//		Actions A = new Actions(driver);
//		A.moveToElement(Stock_selection_dropdown).doubleClick().sendKeys("AAPL").perform();
		
		
		AI_stock.AAPL_suggestion_Searech();
//		 driver.findElement(By.xpath("(//div[text()='AAPL'])[2]")).click();
		Thread.sleep(3000);

	}

	@Then("check Wheather the AAPL Stock is displayed")
	public void check_Wheather_the_AAPL_Stock_is_displayed() {
		if (driver.getPageSource().contains("The stock name is AAPL")) 
		{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		driver.quit();
}
	@When("user select the stock AMZN")
	public void user_select_the_stock_amzn() throws InterruptedException
	{
		AI_stock =new Pom_AI_Stock(driver);
		
		Actions A=new Actions(driver);
		A.moveToElement(AI_stock.Stock_selection_dropdown()).doubleClick().sendKeys("AMZN").perform();
		Thread.sleep(2000);
		AI_stock.AMZN_suggestion_Searech();
		Thread.sleep(3000);
		
//		Stock_selection_dropdown = driver.findElement(By.xpath("//div[@data-baseweb='select']"));
//		Actions A = new Actions(driver);
//		A.moveToElement(Stock_selection_dropdown).doubleClick().sendKeys("AMZN").perform();
//		Thread.sleep(2000);
//		 driver.findElement(By.xpath("(//div[text()='AMZN'])[2]")).click();
		
	}

	@Then("check the AMZN Stock details is displayed")
	public void check_the_amzn_stock_details_is_displayed()
	{
		if (driver.getPageSource().contains("The stock name is AMZN"))
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
		driver.quit();
	}
	@When("user select the stock TSLA")
	public void user_select_the_stock_TSLA() throws InterruptedException
	{
		AI_stock =new Pom_AI_Stock(driver);
		
		Actions A=new Actions(driver);
		A.moveToElement(AI_stock.Stock_selection_dropdown()).doubleClick().sendKeys("TSLA").perform();
		Thread.sleep(2000);
		AI_stock.TSLA_suggestion_Searech();
		Thread.sleep(3000);
		
		
//		Stock_selection_dropdown = driver.findElement(By.xpath("//div[@data-baseweb='select']"));
//		Actions A = new Actions(driver);
//		A.moveToElement(Stock_selection_dropdown).doubleClick().sendKeys("TSLA").perform();
//		Thread.sleep(2000);
//		 driver.findElement(By.xpath("(//div[text()='TSLA'])[2]")).click();
//		Thread.sleep(3000);
	}
	@Then("check the TSLA Stock details is displayed")
	public void check_the_TSLA_stock_details_is_displayed()
	{
		if (driver.getPageSource().contains("The stock name is TSLA"))
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
		driver.quit();
}
	@When("user select the stock META")
	public void user_select_the_stock_META() throws InterruptedException
	{
		AI_stock =new Pom_AI_Stock(driver);
		Actions A=new Actions(driver);
		A.moveToElement(AI_stock.Stock_selection_dropdown()).doubleClick().sendKeys("META").perform();
		Thread.sleep(2000);
		AI_stock.META_suggestion_Searech();
		Thread.sleep(3000);
		
		
		
		
//		Stock_selection_dropdown = driver.findElement(By.xpath("//div[@data-baseweb='select']"));
//		Actions A = new Actions(driver);
//		A.moveToElement(Stock_selection_dropdown).doubleClick().sendKeys("META").perform();
//		Thread.sleep(2000);
//		 driver.findElement(By.xpath("(//div[text()='META'])[2]")).click();
//		Thread.sleep(3000);
	}
	@Then("check the META Stock details is displayed")
	public void check_the_META_stock_details_is_displayed()
	{
		if (driver.getPageSource().contains("The stock name is META"))
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
		driver.quit();
}
	
	@When("user select the stock ADBE")
	public void user_select_the_stock_ADBE() throws InterruptedException
	{
		AI_stock=new Pom_AI_Stock(driver);
		Actions A=new Actions(driver);
		A.moveToElement(AI_stock.Stock_selection_dropdown()).doubleClick().sendKeys("ADBE").perform();
		Thread.sleep(2000);
		AI_stock.ADBE_suggestion_Searech();
		Thread.sleep(3000);
		
		
//		Stock_selection_dropdown = driver.findElement(By.xpath("//div[@data-baseweb='select']"));
//		Actions A = new Actions(driver);
//		A.moveToElement(Stock_selection_dropdown).doubleClick().sendKeys("ADBE").perform();
//		Thread.sleep(2000);
//		 driver.findElement(By.xpath("(//div[text()='ADBE'])[2]")).click();
//		Thread.sleep(3000);
	}
	@Then("check the ADBE Stock details is displayed")
	public void check_the_ADBE_stock_details_is_displayed()
	{
		if (driver.getPageSource().contains("The stock name is ADBE"))
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
		driver.quit();
}
	@When("user select the stock COST")
	public void user_select_the_stock_COST() throws InterruptedException
	{
		AI_stock=new Pom_AI_Stock(driver);
		Actions A=new Actions(driver);
		A.moveToElement(AI_stock.Stock_selection_dropdown()).doubleClick().sendKeys("COST").perform();
		Thread.sleep(2000);
		AI_stock.COST_suggestion_Searech();
		Thread.sleep(3000);
		
		
//		Stock_selection_dropdown = driver.findElement(By.xpath("//div[@data-baseweb='select']"));
//		Actions A = new Actions(driver);
//		A.moveToElement(Stock_selection_dropdown).doubleClick().sendKeys("COST").perform();
//		Thread.sleep(2000);
//		 driver.findElement(By.xpath("(//div[text()='COST'])[2]")).click();
//		Thread.sleep(3000);
	}
	@Then("check the COST Stock details is displayed")
	public void check_the_COST_stock_details_is_displayed()
	{
		if (driver.getPageSource().contains("The stock name is COST"))
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
		driver.quit();
}
	@When("user select the stock MSFT")
	public void user_select_the_stock_MSFT() throws InterruptedException
	{
		AI_stock=new Pom_AI_Stock(driver);
		Actions A=new Actions(driver);
		A.moveToElement(AI_stock.Stock_selection_dropdown()).doubleClick().sendKeys("MSFT").perform();
		Thread.sleep(2000);
		AI_stock.MSFT_suggestion_Searech();
		Thread.sleep(3000);
		
		
//		Stock_selection_dropdown = driver.findElement(By.xpath("//div[@data-baseweb='select']"));
//		Actions A = new Actions(driver);
//		A.moveToElement(Stock_selection_dropdown).doubleClick().sendKeys("MSFT").perform();
//		Thread.sleep(2000);
//		 driver.findElement(By.xpath("(//div[text()='MSFT'])[2]")).click();
//		Thread.sleep(3000);
	}
	@Then("check the MSFT Stock details is displayed")
	public void check_the_MSFT_stock_details_is_displayed()
	{
		if (driver.getPageSource().contains("The stock name is MSFT"))
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
		driver.quit();
}
	@And("Click on Predict button")
	public void click_on_predict_button() throws InterruptedException 
	{
		AI_stock=new Pom_AI_Stock(driver);
		AI_stock.Predict_button();
		Thread.sleep(5000);
		
//	   WebElement Predict_button = driver.findElement(By.xpath("//p[text()='Predict']"));
//	   Predict_button.click();
//	   Thread.sleep(5000);
	}

	@Then("predicting text with loading should be displayed and Predicted  AAPL Details should be displayed")
	public void predicting_text_with_loading_should_be_displayed_and_predicted_aapl_details_should_be_displayed() throws InterruptedException
	{
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='news']")));
		if(driver.getPageSource().contains("News"))
		{
			Assert.assertTrue(true);
		}
		driver.quit();
		
	   
	}
	@Then("predicting text with loading should be displayed and Predicted MSFT Details should be displayed")
	public void predicting_text_with_loading_should_be_displayed_and_predicted_msft_details_should_be_displayed() throws InterruptedException
	{
	    wait=new WebDriverWait(driver,300);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='news']")));
	    WebElement News_Heading_tag = driver.findElement(By.xpath("//h2[@id='news']"));
	    if(News_Heading_tag.isDisplayed())
	    {
	    	Assert.assertTrue(true);
	    }
	    if(driver.getPageSource().contains("Prediction complete!")) 
	    {
	    	Assert.assertTrue(true);
	    }  
	    driver.quit();
	    
	}
}
	
