package com.sameh.qa.tests;

import com.sameh.qa.base.BaseTest;
import com.sameh.qa.config.ConfigReader;
import com.sameh.qa.pages.FileUploadPage;
import com.sameh.qa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Path;

public class FileUploadTest extends BaseTest {

    @Test(description = "Upload a small image and verify successful upload")
    public void shouldUploadImageSuccessfully() {
        String filePath = Path.of(ConfigReader.get("upload.file"))
                .toAbsolutePath()
                .toString();

        FileUploadPage uploadPage = new HomePage(driver)
                .openFileUpload();

        uploadPage
                .uploadFile(filePath)
                .submit();

        Assert.assertEquals(
                uploadPage.getSuccessMessage(),
                "File Uploaded!",
                "Success message should confirm the file was uploaded"
        );

        Assert.assertTrue(
                uploadPage.getUploadedFileName().contains("testimage.jpg"),
                "Uploaded file name should be displayed"
        );
    }
}
