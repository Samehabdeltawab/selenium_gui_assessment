package com.sameh.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {
    private final By fileInput = By.id("file-upload");
    private final By uploadButton = By.id("file-submit");
    private final By uploadedFileName = By.id("uploaded-files");
    private final By uploadSuccessHeading = By.cssSelector("#content h3");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public FileUploadPage uploadFile(String absoluteFilePath) {
        visible(fileInput).sendKeys(absoluteFilePath);
        return this;
    }

    public FileUploadPage submit() {
        click(uploadButton);
        return this;
    }

    public String getUploadedFileName() {
        return visible(uploadedFileName).getText();
    }

    public String getSuccessMessage() {
        return visible(uploadSuccessHeading).getText();
    }

    public boolean isUploadSuccessful() {
        return isDisplayed(uploadedFileName);
    }
}
