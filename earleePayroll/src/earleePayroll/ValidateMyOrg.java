package earleePayroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ValidateMyOrg extends Main {

    WebDriverWait wait;

    @Test
    public void validateMyOrganization() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Validate text input fields (Interactability + Value)
        validateFieldWithValue(UniversalLocators.companyName, UniversalLocators.companyName1, "Company Name");
        validateFieldWithValue(UniversalLocators.companyOwner, UniversalLocators.companyOwner1, "Company Owner");
        validateFieldWithValue(UniversalLocators.companyEmail, UniversalLocators.companyEmail1, "Company Email");
        validateDropdownWithValue(UniversalLocators.companyIndustry, UniversalLocators.companyIndustry1, "Company Industry");
        validateDropdownWithValue(UniversalLocators.companyOrgType, UniversalLocators.companyOrgType1, "Company Org Type");
        validateFieldWithValue(UniversalLocators.companyContact, UniversalLocators.companyContact1, "Company Contact");
        validateFieldWithValue(UniversalLocators.companyWebsite, UniversalLocators.companyWebsite1, "Company Website");
        validateFieldWithValue(UniversalLocators.foundingDate, UniversalLocators.foundingDate1, "Founding Date");
        validateFieldWithValue(UniversalLocators.companyAddress, UniversalLocators.companyAddress1, "Company Address");
        validateFieldWithValue(UniversalLocators.companyCity, UniversalLocators.companyCity1, "Company City");
        validateFieldWithValue(UniversalLocators.companyZipCode, UniversalLocators.companyZipCode1, "Company Zip Code");
        validateFieldWithValue(UniversalLocators.companyRegion, UniversalLocators.companyRegion1, "Company Region");
        validateFieldWithValue(UniversalLocators.companyCountry, UniversalLocators.companyCountry1, "Company Country");
        
    }

    // Validate field interactability + value
    public void validateFieldWithValue(By locator, String expectedValue, String fieldName) {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            Assert.assertTrue(element.isDisplayed() && element.isEnabled(), fieldName + " is not interactable");
            String actualValue = element.getAttribute("value").trim();
            Assert.assertEquals(actualValue, expectedValue, fieldName + " value mismatch. Expected: '" + expectedValue + "', Found: '" + actualValue + "'");
//            System.out.println(fieldName + " is interactable and value is correct!");
        } catch (Exception e) {
            Assert.fail(fieldName + " failed validation. Exception: " + e.getMessage());
        }
    }

    // Validate dropdown interactability + selected/visible text
    public void validateDropdownWithValue(By locator, By expectedSelected, String fieldName) {
        try {
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(locator));
            Assert.assertTrue(dropdown.isDisplayed() && dropdown.isEnabled(), fieldName + " dropdown is not clickable");
            
            // Fetch expected selected value text (for dynamic comparison)
            WebElement expectedElement = driver.findElement(expectedSelected);
            String expectedText = expectedElement.getText().trim();

            // Get the actual selected/visible text from the dropdown
            String actualText = dropdown.getText().trim();

            Assert.assertEquals(actualText, expectedText, fieldName + " dropdown value mismatch. Expected: '" + expectedText + "', Found: '" + actualText + "'");
//            System.out.println(fieldName + " dropdown is clickable and value is correct!");
        } catch (Exception e) {
            Assert.fail(fieldName + " dropdown validation failed. Exception: " + e.getMessage());
        }
    }
}
