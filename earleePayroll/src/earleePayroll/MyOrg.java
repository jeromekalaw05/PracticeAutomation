package earleePayroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyOrg extends Main{

	public WebDriverWait wait;

    @Test
    public void AddMyOrganization() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Click "My Organization" and "Edit My Organization"
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.MY_ORG_BUTTON)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.EDIT_MY_ORG_BUTTON)).click();

        // Fill organization details
        enterInput(UniversalLocators.companyName, UniversalLocators.companyName1);
        enterInput(UniversalLocators.companyOwner, UniversalLocators.companyOwner1);
        enterInput(UniversalLocators.companyEmail, UniversalLocators.companyEmail1);
        enterInput(UniversalLocators.companyContact, UniversalLocators.companyContact1);
        enterInput(UniversalLocators.companyWebsite, UniversalLocators.companyWebsite1);
        enterDate(UniversalLocators.foundingDate, UniversalLocators.foundingDate1);
        enterInput(UniversalLocators.companyAddress, UniversalLocators.companyAddress1);
        enterInput(UniversalLocators.companyCity, UniversalLocators.companyCity1);
        enterInput(UniversalLocators.companyZipCode, UniversalLocators.companyZipCode1);
        enterInput(UniversalLocators.companyRegion, UniversalLocators.companyRegion1);
        enterInput(UniversalLocators.companyCountry, UniversalLocators.companyCountry1);

        // Select dropdown options
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.companyIndustry)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.companyIndustry1)).click();

        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.companyOrgType)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.companyOrgType1)).click();

        // Scroll to and click Submit button
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.SUBMIT));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", submitButton);
        submitButton.click();
        
    }

    private void enterInput(By locator, String value) {
    	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        
        element.clear();
        element.sendKeys(value);
    }
    
    private void enterDate(By locator, String value) {
        WebElement dateField = wait.until(ExpectedConditions.elementToBeClickable(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", dateField, value);
        dateField.sendKeys(Keys.TAB); // Ensure the value is registered
    }
}
