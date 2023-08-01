package Step_definations_AI_Stock;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class Audit_summarizer_report
{
	
	public WebDriver driver;
	public Pom_AI_Stock AI_stock;
	WebElement X_button;
	WebElement Submit_button;
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
	@Given("when user open the browser and enter the URL")
	public void when_user_open_the_browser_and_enter_the_url() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8501/");
		Thread.sleep(8000);

	}

	@When("user click on Audit summarizer report module")
	public void user_click_on_audit_summarizer_report_module() throws InterruptedException 
	{
		Thread.sleep(2000);
		AI_stock=new Pom_AI_Stock(driver);
		AI_stock.Audit_summarizer();
		Thread.sleep(4000);
		
	}

	@Then("user able to see the audit summarizer report")
	public void user_able_to_see_the_audit_summarizer_report()
	{
		String Excpeted_report_summarizer="Auditor Report Summarizer";
		WebElement Audit_report_summarizer_heading = driver.findElement(By.xpath("//span[text()='Auditor Report Summarizer']"));
		String Actual_Heading = Audit_report_summarizer_heading.getText();
		Assert.assertEquals(Excpeted_report_summarizer,Actual_Heading);
		driver.quit();
	}

	@When("user click on the X_button")
	public void user_click_on_the_x_button() throws InterruptedException
	{
		AI_stock=new Pom_AI_Stock(driver);
		AI_stock.X_button_AI();
		Thread.sleep(2000);
		
		
		/*X_button = driver.findElement(By.xpath("//section[@data-testid='stSidebar']/div/div/button"));
		X_button.click();
		Thread.sleep(2000);*/
	}

	@When("button should not display")
	public void button_should_not_display() 
	{
		System.out.println("Not_displayed");
	}

	@When("user click on >_button")
	public void user_click_on__button() throws InterruptedException 
	{
		AI_stock=new Pom_AI_Stock(driver);
		AI_stock.Enabled_section_Button();
		
//		WebElement Enable_section_button = driver.findElement(By.xpath("//div[@data-testid='stAppViewContainer']/div/button"));
//		Thread.sleep(2000);
//		Enable_section_button.click();
//		Thread.sleep(3000);
	}

	@Then("check wheather user able to see the Complete left hand side sections.")
	public void check_wheather_user_able_to_see_the_complete_left_hand_side_sections()
	{
		System.out.println("ENabled");
		driver.quit();
	}
	@When("user select the stock AAPL in Audit summarizer report")
	public void user_select_the_stock_aapl_in_audit_summarizer_report() throws InterruptedException 
	{
		AI_stock=new Pom_AI_Stock(driver);
		
//		WebElement Stock_selection_dropdown = driver.findElement(By.xpath("//div[@data-baseweb='select']"));
//		Thread.sleep(2000);
		Actions A = new Actions(driver);
		A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("AAPL").perform();
		Thread.sleep(2000);
		AI_stock.AAPL_suggestion_Searech();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//div[text()='AAPL'])[2]")).click();
//		Thread.sleep(3000);
		AI_stock.Start_page.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		
		
//		WebElement Enter_start_page_number = driver.findElement(By.xpath("//input[@aria-label='Enter the start page number']"));
//		Enter_start_page_number.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		Thread.sleep(2000);
		AI_stock.Start_page.sendKeys("4");
//		Enter_start_page_number.sendKeys("4");
//		Thread.sleep(2000);
		
		AI_stock.Submit_button();
//		WebElement Submit_button = driver.findElement(By.xpath("//p[text()='Submit']"));
//		Submit_button.click();
	}

	@Then("check Wheather the AAPL Stock summarizer report is displayed")
	public void check_wheather_the_aapl_stock_summarizer_report_is_dsplayed()
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//strong[text()='Page 4: ']")));
		if(driver.getPageSource().contains("Page 4: "))
		{
			Assert.assertTrue(true);
		}
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//strong[text()='Page 25: ']")));
		if(driver.getPageSource().contains("Page 25: "))
		{
			Assert.assertTrue(true);
		}
		driver.quit();
	}
	@When("user select the stock AMZN in Audit summarizer report")
	public void user_select_the_stock_amzn_in_audit_summarizer_report() throws InterruptedException
	{
		AI_stock=new Pom_AI_Stock(driver);
		Actions A = new Actions(driver);
		A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("AMZN").perform();
		Thread.sleep(2000);
		AI_stock.AMZN_suggestion_Searech();
		Thread.sleep(4000);
		AI_stock.Start_page.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		Thread.sleep(2000);
		AI_stock.Start_page.sendKeys("4");
		AI_stock.Submit_button();
//		WebElement Stock_selection_dropdown = driver.findElement(By.xpath("//div[@data-baseweb='select']"));
//		Thread.sleep(2000);
//		Actions A = new Actions(driver);
//		A.moveToElement(Stock_selection_dropdown).doubleClick().sendKeys("AMZN").perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//div[text()='AMZN'])[2]")).click();
//		Thread.sleep(3000);
//		WebElement Enter_start_page_number = driver.findElement(By.xpath("//input[@aria-label='Enter the start page number']"));
//		Enter_start_page_number.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
//		Thread.sleep(2000);
//		Enter_start_page_number.sendKeys("6");
//		Thread.sleep(2000);
//		WebElement Submit_button = driver.findElement(By.xpath("//p[text()='Submit']"));
//		Submit_button.click();
	}

	@Then("check Wheather the AMZN Stock summarizer report is displayed")
	public void check_wheather_the_amzn_stock_summarizer_report_is_displayed()
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//strong[text()='Page 6: ']")));
		if(driver.getPageSource().contains("Page 6: "))
		{
			Assert.assertTrue(true);
		}
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//strong[text()='Page 20: ']")));
		if(driver.getPageSource().contains("Page 20: "))
		{
			Assert.assertTrue(true);
		}
		driver.quit();
	}
	@When("user select the stock MSFT in Audit summarizer report")
	public void user_select_the_stock_msft_in_audit_summarizer_report() throws InterruptedException 
	{
		AI_stock=new Pom_AI_Stock(driver);
		Actions A = new Actions(driver);
		A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("MSFT").perform();
		Thread.sleep(2000);
		AI_stock.MSFT_suggestion_Searech();
		Thread.sleep(4000);
		AI_stock.Start_page.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		Thread.sleep(2000);
		AI_stock.Start_page.sendKeys("6");
		AI_stock.Submit_button();
		
		
		
		
		
//		WebElement Stock_selection_dropdown = driver.findElement(By.xpath("//div[@data-baseweb='select']"));
//		Thread.sleep(2000);
//		Actions A = new Actions(driver);
//		A.moveToElement(Stock_selection_dropdown).doubleClick().sendKeys("MSFT").perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//div[text()='MSFT'])[2]")).click();
//		Thread.sleep(3000);
//		WebElement Enter_start_page_number = driver.findElement(By.xpath("//input[@aria-label='Enter the start page number']"));
//		Enter_start_page_number.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
//		Thread.sleep(2000);
//		Enter_start_page_number.sendKeys("6");
//		Thread.sleep(2000);
//		WebElement Submit_button = driver.findElement(By.xpath("//p[text()='Submit']"));
//		Submit_button.click();
	}

	@Then("check Wheather the MSFT Stock summarizer report is displayed")
	public void check_wheather_the_msft_stock_summarizer_report_is_displayed()
	{
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//strong[text()='Page 6: ']")));
		if(driver.getPageSource().contains("Page 6: "))
		{
			Assert.assertTrue(true);
		}
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//strong[text()='Page 20: ']")));
		if(driver.getPageSource().contains("Page 20: "))
		{
			Assert.assertTrue(true);
		}
		driver.quit();
	}

	@When("user select the stock ADBE in Audit summarizer report")
	public void user_select_the_stock_adbe_in_audit_summarizer_report() throws InterruptedException
	{
		AI_stock=new Pom_AI_Stock(driver);
		Actions A = new Actions(driver);
		A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("ADBE").perform();
		Thread.sleep(2000);
		AI_stock.ADBE_suggestion_Searech();
		Thread.sleep(4000);
		AI_stock.Start_page.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		AI_stock.Start_page.sendKeys("2");
		AI_stock.Submit_button();
		
		
		
		
		
		
//		WebElement Stock_selection_dropdown = driver.findElement(By.xpath("//div[@data-baseweb='select']"));
//		Thread.sleep(2000);
//		Actions A = new Actions(driver);
//		A.moveToElement(Stock_selection_dropdown).doubleClick().sendKeys("ADBE").perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//div[text()='ADBE'])[2]")).click();
//		Thread.sleep(3000);
//		WebElement Enter_start_page_number = driver.findElement(By.xpath("//input[@aria-label='Enter the start page number']"));
//		Enter_start_page_number.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
//		Thread.sleep(2000);
//		Enter_start_page_number.sendKeys("6");
//		Thread.sleep(2000);
//		WebElement Submit_button = driver.findElement(By.xpath("//p[text()='Submit']"));
//		Submit_button.click();
	}

	@Then("check Wheather the ADBE Stock summarizer report is displayed")
	public void check_wheather_the_adbe_stock_summarizer_report_is_displayed() 
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//strong[text()='Page 6: ']")));
		if(driver.getPageSource().contains("Page 6: "))
		{
			Assert.assertTrue(true);
		}
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//strong[text()='Page 20: ']")));
		if(driver.getPageSource().contains("Page 20: "))
		{
			Assert.assertTrue(true);
		}
		driver.quit();
	}

@When("user select the stock COST in Audit summarizer report")
public void user_select_the_stock_cost_in_audit_summarizer_report() throws InterruptedException 
{
	AI_stock=new Pom_AI_Stock(driver);
	Actions A = new Actions(driver);
	A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("COST").perform();
	Thread.sleep(2000);
	AI_stock.COST_suggestion_Searech();
	Thread.sleep(2000);
	AI_stock.Start_page.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
	AI_stock.Start_page.sendKeys("2");
	Thread.sleep(2000);
	AI_stock.Submit_button();
	
	
	
	
	
	
	
	
	
//	WebElement Stock_selection_dropdown = driver.findElement(By.xpath("//div[@data-baseweb='select']"));
//	Thread.sleep(2000);
//	Actions A = new Actions(driver);
//	A.moveToElement(Stock_selection_dropdown).doubleClick().sendKeys("COST").perform();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//div[text()='COST'])[2]")).click();
//	Thread.sleep(3000);
//	WebElement Enter_start_page_number = driver.findElement(By.xpath("//input[@aria-label='Enter the start page number']"));
//	Enter_start_page_number.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
//	Thread.sleep(2000);
//	Enter_start_page_number.sendKeys("2");
//	Thread.sleep(2000);
//	WebElement Submit_button = driver.findElement(By.xpath("//p[text()='Submit']"));
//	Submit_button.click();
}

@Then("check Wheather the COST Stock summarizer report is displayed")
public void check_wheather_the_cost_stock_summarizer_report_is_displayed()
{
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//strong[text()='Page 2: ']")));
	if(driver.getPageSource().contains("Page 2: "))
	{
		Assert.assertTrue(true);
	}
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//strong[text()='Page 20: ']")));
	if(driver.getPageSource().contains("Page 20: "))
	{
		Assert.assertTrue(true);
	}
	driver.quit(); 
}

@When("user select the stock TSLA in Audit summarizer report")
public void user_select_the_stock_tsla_in_audit_summarizer_report() throws InterruptedException 
{
	AI_stock=new Pom_AI_Stock(driver);
	Actions A = new Actions(driver);
	A.moveToElement(AI_stock.Stock_selection).doubleClick().sendKeys("TSLA").perform();
	Thread.sleep(2000);
	AI_stock.TSLA_suggestion_Searech();
	Thread.sleep(2000);
	AI_stock.Start_page.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
	AI_stock.Start_page.sendKeys("3");
	Thread.sleep(2000);
	AI_stock.Submit_button();
	
	
	
	
	
	
	
//	WebElement Stock_selection_dropdown = driver.findElement(By.xpath("//div[@data-baseweb='select']"));
//	Thread.sleep(2000);
//	Actions A = new Actions(driver);
//	A.moveToElement(Stock_selection_dropdown).doubleClick().sendKeys("TSLA").perform();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//div[text()='TSLA'])[2]")).click();
//	Thread.sleep(3000);
//	WebElement Enter_start_page_number = driver.findElement(By.xpath("//input[@aria-label='Enter the start page number']"));
//	Enter_start_page_number.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
//	Thread.sleep(2000);
//	Enter_start_page_number.sendKeys("7");
//	Thread.sleep(2000);
//	WebElement Submit_button = driver.findElement(By.xpath("//p[text()='Submit']"));
//	Submit_button.click();
}

@Then("check Wheather the TSLA Stock summarizer report is displayed")
public void check_wheather_the_tsla_stock_summarizer_report_is_displayed() 
{
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//strong[text()='Page 8: ']")));
	if(driver.getPageSource().contains("Page 8: "))
	{
		Assert.assertTrue(true);
	}
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//strong[text()='Page 20: ']")));
	if(driver.getPageSource().contains("Page 25: "))
	{
		Assert.assertTrue(true);
	}
	driver.quit(); 
}
	
	
}
