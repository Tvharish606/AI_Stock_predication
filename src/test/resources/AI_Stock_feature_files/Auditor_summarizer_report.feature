Feature: 
  Audit_summarizer_report

  Scenario: 
    when user abel launch the application and click on Audit summarizer report module,Audit summarizer report page should be displayed

    Given when user open the browser and enter the URL
    When user click on Audit summarizer report module
    Then user able to see the audit summarizer report

  Scenario: 
    Check weather user able to click or disable and enable the left hand side image in AI_stock_predication_module page

    Given when user open the browser and enter the URL
    When user click on Audit summarizer report module
    When user click on the X_button
    And button should not display
    When user click on >_button
    Then check wheather user able to see the Complete left hand side sections.

  Scenario: 
    when user able to select the stock and check weather the Exact audit report summarizer is displayed

    Given when user open the browser and enter the URL
    When user click on Audit summarizer report module
    When user select the stock AAPL in Audit summarizer report
    Then check Wheather the AAPL Stock summarizer report is displayed

  Scenario: when user able to select the Stock and check weather the Exact audit report summarizer is displayed
    Given when user open the browser and enter the URL
    When user click on Audit summarizer report module
    When user select the stock AAPL in Audit summarizer report
    Then check Wheather the AAPL Stock summarizer report is displayed

  Scenario: when user able to select the Stock and check weather the Exact audit report summarizer is displayed
    Given when user open the browser and enter the URL
    When user click on Audit summarizer report module
    When user select the stock MSFT in Audit summarizer report
    Then check Wheather the MSFT Stock summarizer report is displayed

  Scenario: when user able to select the Stock and check weather the Exact audit report summarizer is displayed
    Given when user open the browser and enter the URL
    When user click on Audit summarizer report module
    When user select the stock ADBE in Audit summarizer report
    Then check Wheather the ADBE Stock summarizer report is displayed

  Scenario: when user able to select the Stock and check weather the Exact audit report summarizer is displayed
    Given when user open the browser and enter the URL
    When user click on Audit summarizer report module
    When user select the stock COST in Audit summarizer report
    Then check Wheather the COST Stock summarizer report is displayed

  Scenario: when user able to select the Stock and check weather the Exact audit report summarizer is displayed
    Given when user open the browser and enter the URL
    When user click on Audit summarizer report module
    When user select the stock TSLA in Audit summarizer report
    Then check Wheather the TSLA Stock summarizer report is displayed
