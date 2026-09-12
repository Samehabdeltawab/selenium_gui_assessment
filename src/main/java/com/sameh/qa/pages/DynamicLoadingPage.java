package com.sameh.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/** 
 * Page Object representing the "Dynamic Loading" page on the-internet.herokuapp.com.
 * This page contains an "Example 2" scenario where clicking a "Start" button
 * triggers content that is rendered dynamically via JavaScript after a short delay.
 * This class encapsulates the locators and actions needed to interact with that flow,
 * so tests don't need to know the underlying HTML/CSS details.
 */
public class DynamicLoadingPage extends BasePage {
    // Link on the "Dynamic Loading" landing page that opens the Example 2 scenario
    private final By example2 = By.partialLinkText("Example 2");
    // Button that triggers the dynamic (JavaScript-based) content loading
    private final By startButton = By.cssSelector("#start button");
    // Element that displays the text once the dynamic content finishes loading
    private final By result = By.cssSelector("#finish h4");

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Clicks the "Example 2" link to navigate into that scenario.
     * @return this page instance, for method chaining
     */
    public DynamicLoadingPage openExample2() {
        click(example2);
        return this;
    }

    /**
     * Clicks the "Start" button to trigger the dynamic content loading.
     * @return this page instance, for method chaining
     */
    public DynamicLoadingPage start() {
        click(startButton);
        return this;
    }

    /**
     * Reads the text that appears once the dynamically loaded content is displayed.
     * @return the displayed result text (expected: "Hello World!")
     */
    public String getDisplayedText() {
        return visible(result).getText();
    }
}
