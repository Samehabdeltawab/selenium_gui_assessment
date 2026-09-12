# Selenium GUI Automation Assessment

## Stack
- Java 17
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model
- WebDriverManager

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
