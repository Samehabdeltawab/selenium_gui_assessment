package com.sameh.qa.tests;

import com.sameh.qa.base.BaseTest;
import com.sameh.qa.pages.DynamicLoadingPage;
import com.sameh.qa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingTest extends BaseTest {

    @Test(description = "Wait for dynamic content and verify displayed text")
    public void shouldLoadDynamicContentSuccessfully() {
        DynamicLoadingPage dynamicLoadingPage = new HomePage(driver)
                .openDynamicLoading()
                .openExample2()
                .start();

        Assert.assertEquals(
                dynamicLoadingPage.getDisplayedText(),
                "Hello World!",
                "Dynamic loading result should match the expected text"
        );
    }
}
