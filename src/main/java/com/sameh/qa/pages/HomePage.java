package com.sameh.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final By fileUploadLink = By.linkText("File Upload");
    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public FileUploadPage openFileUpload() {
        click(fileUploadLink);
        return new FileUploadPage(driver);
    }

    public DynamicLoadingPage openDynamicLoading() {
        click(dynamicLoadingLink);
        return new DynamicLoadingPage(driver);
    }
}
