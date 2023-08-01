package Pom_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom_AI_Stock 
{
	public static WebDriver driver1;
	public WebDriverWait wait;
	
	public Pom_AI_Stock(WebDriver driver2)
	{
		driver1 = driver2;
		PageFactory.initElements(driver1, this);
	}
	
	
	@FindBy(xpath = "//section[@data-testid='stSidebar']/div/div/button")
	public WebElement X_button;
	public void X_button_AI()
	{
		wait = new WebDriverWait(driver1, 10);
		wait.until(ExpectedConditions.visibilityOf(X_button));
		X_button.click();
	}
	
	@FindBy(xpath = "//div[@data-testid='stAppViewContainer']/div/button")
	public  WebElement Enabled_section;

	public void Enabled_section_Button()
	{
		Enabled_section.click();
	}
	
	@FindBy(xpath = "//div[@data-baseweb='select']")
	public  WebElement Stock_selection;
	public  WebElement Stock_selection_dropdown()
	{
		return Stock_selection;
	}
	
	@FindBy(xpath = "(//div[text()='AAPL'])[2]")
	public  WebElement AAPL_Suggestion;
	public void AAPL_suggestion_Searech()
	{
		AAPL_Suggestion.click();
	}
	
	@FindBy(xpath = "(//div[text()='AMZN'])[2]")
	private WebElement AMZN_Suggestion;
	public void AMZN_suggestion_Searech()
	{
		AMZN_Suggestion.click();
	}
	
	@FindBy(xpath = "(//div[text()='GOOG'])[2]")
	private WebElement GOOG_Suggestion;
	public void GOOG_suggestion_Searech()
	{
		GOOG_Suggestion.click();
	}
	
	@FindBy(xpath = "(//div[text()='TSLA'])[2]")
	private WebElement TSLA_Suggestion;
	public void TSLA_suggestion_Searech()
	{
		TSLA_Suggestion.click();
	}
	
	@FindBy(xpath = "(//div[text()='META'])[2]")
	private WebElement META_Suggestion;
	public void META_suggestion_Searech()
	{
		META_Suggestion.click();
	}
	
	@FindBy(xpath = "(//div[text()='ADBE'])[2]")
	private WebElement ADBE_Suggestion;
	public void ADBE_suggestion_Searech()
	{
		ADBE_Suggestion.click();
	}
	
	@FindBy(xpath = "(//div[text()='COST'])[2]")
	private WebElement COST_Suggestion;
	public void COST_suggestion_Searech()
	{
		COST_Suggestion.click();
		
	}
	
	@FindBy(xpath = "(//div[text()='MSFT'])[2]")
	private WebElement MSFT_Suggestion;
	public void MSFT_suggestion_Searech()
	{
		MSFT_Suggestion.click();
		
	}
	
	@FindBy(xpath = "//p[text()='Predict']")
	private WebElement Predict;
	public void Predict_button()
	{
		Predict.click();
	}

	@FindBy(xpath = "//div[text()='Auditor Report Summarizer']")
	public WebElement Audit_summarizer_report;
	public void Audit_summarizer()
	{
		Audit_summarizer_report.click();
	}
	
	@FindBy(xpath = "//input[@aria-label='Enter the start page number']")
	public WebElement Start_page;
	public WebElement Start_page_number()
	{
		return Start_page;
	}
	@FindBy(xpath = "//p[text()='Submit']")
	public WebElement Submit;
	public void Submit_button() throws InterruptedException
	{
		Thread.sleep(2000);
		Submit.click();
	}
	
	@FindBy(xpath = "//div[text()='Financial Ratios']")
	public WebElement Finanical_radio;
	
public void Finanical_radio_button()
	{
	Finanical_radio.click();
	}
	
}
