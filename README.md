# Selenium GUI Automation Assessment

## Stack
- Java 17
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model
- WebDriverManager

## Prerequisites

Before running this project, make sure you have the following installed:

1. **Java JDK 17 or higher**
   - Download: https://adoptium.net/
   - Verify installation:
     ```bash
     java -version
     ```

2. **Apache Maven 3.8+**
   - Download: https://maven.apache.org/download.cgi
   - Make sure `mvn` is added to your system PATH
   - Verify installation:
     ```bash
     mvn -version
     ```

3. **Google Chrome** (latest version recommended)
   - ChromeDriver is downloaded and managed automatically by `WebDriverManager`,
     so there is no need to download or configure it manually.

4. **Internet connection**
   - Required the first time to download Maven dependencies, the ChromeDriver
     binary, and to reach the test site (`https://the-internet.herokuapp.com`).

> If `java` or `mvn` commands are not recognized in your terminal after installing
> them, restart your terminal/IDE, or make sure their installation paths were
> added to your system's `PATH` environment variable.

## Getting Started

```bash
git clone https://github.com/Samehabdeltawab/selenium_gui_assessment.git
cd selenium_gui_assessment
mvn clean test
```

No additional manual setup is required — all file paths in the project are
relative, all configuration values are provided in `config.properties`, and
the required test image (`testimage.jpg`) is already included in the repository.

## Assessment coverage
1. File Upload
   - Open File Upload
   - Upload a small image
   - Submit
   - Verify successful upload

2. Dynamic Loading
   - Open Dynamic Loading
   - Open Example 2
   - Click Start
   - Wait for loading to finish
   - Verify displayed text

> Note: The uploaded assessment PDF contains blank values after "Navigate to:".
> The implementation therefore keeps the base URL configurable in `config.properties`.
> The default below uses the common public demo site matching these scenario names:
> https://the-internet.herokuapp.com/
> Replace it if the assessment provides a different target URL.

## Run
```bash
mvn clean test
```

## Configuration
Edit:
`src/test/resources/config.properties`

## Design
- `BasePage`: reusable Selenium actions and explicit waits
- `BaseTest`: WebDriver lifecycle
- `FileUploadPage`: File Upload page objects
- `DynamicLoadingPage`: Dynamic Loading page objects
- Tests contain only business-level steps and assertions
- Test data is externalized in `config.properties`

## OOP / maintainability
- Encapsulation through Page Objects
- Inheritance through `BasePage` / `BaseTest`
- Reusable synchronization methods
- No duplicated driver setup
- No Thread.sleep()
- Configurable browser and base URL
