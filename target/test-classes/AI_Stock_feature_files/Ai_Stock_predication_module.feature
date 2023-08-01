Feature: 
  AI_Stock_predication_module

  Scenario: 
    when user enter the url check wheather user able to see application page

    Given user open the browser and enter the URL
    Then User able to see the AI_Stock_predication module page

  Scenario: 
    Check weather user able to disable and enable the left hand side image in AI_stock_predication_module page

    Given user open the browser and enter the URL
    When user click on the X button
    And button should not disabled
    When user click on > button
    Then check wheather user able to see the Complete left hand side section

  Scenario: when user able to select the Stock and check weather the Exact stock details is displayed
    Given user open the browser and enter the URL
    When user select the stock AAPL
    Then check Wheather the AAPL Stock is displayed

  Scenario: when user able to select the Stock and check weather the Exact stock details is displayed
    Given user open the browser and enter the URL
    When user select the stock AMZN
    Then check the AMZN Stock details is displayed

  Scenario: when user able to select the Stock and check weather the Exact stock details is displayed
    Given user open the browser and enter the URL
    When user select the stock TSLA
    Then check the TSLA Stock details is displayed

  Scenario: when user able to select the Stock and check weather the Exact stock details is displayed
    Given user open the browser and enter the URL
    When user select the stock META
    Then check the META Stock details is displayed

  Scenario: when user able to select the Stock and check weather the Exact stock details is displayed
    Given user open the browser and enter the URL
    When user select the stock ADBE
    Then check the ADBE Stock details is displayed

  Scenario: when user able to select the Stock and check weather the Exact stock details is displayed
    Given user open the browser and enter the URL
    When user select the stock COST
    Then check the COST Stock details is displayed

  Scenario: when user able to select the Stock and check weather the Exact stock details is displayed
    Given user open the browser and enter the URL
    When user select the stock MSFT
    Then check the MSFT Stock details is displayed

  Scenario: when user select the stock and click on predict button,loading image with predicting text should be displayed
    Given user open the browser and enter the URL
    When user select the stock AAPL
    And Click on Predict button
    Then predicting text with loading should be displayed and Predicted  AAPL Details should be displayed

  Scenario: when user select the stock and click on predict button,loading image with predicting text should be displayed
    Given user open the browser and enter the URL
    When user select the stock MSFT
    And Click on Predict button
    Then predicting text with loading should be displayed and Predicted MSFT Details should be displayed
