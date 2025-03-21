package earleePayroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateEmployeeLeave extends Main {
	
	WebDriverWait wait;

    @Test
    public void validateEmployeeLeave() {
    	
    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	
        try {
            validateElementClickable(UniversalLocators.EMPLOYEELEAVE_TAB, "Employee Tab");
            validateElementClickable(UniversalLocators.ADDING_LEAVE, "Add Leave Button");
            wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.LEAVETYPE));
            validateElementClickable(UniversalLocators.LEAVETYPE, "Leave Type Dropdown");
            validateElementClickable(UniversalLocators.LEAVE_TYPE_OPT, "Leave Option");
            validateInputValue(UniversalLocators.LEAVENUMBER, UniversalLocators.leaveNumber, "Leave Number");
            validateInputValue(UniversalLocators.LEAVEBALANCE, UniversalLocators.leaveBalance, "Leave Balance");
            validateElementClickable(UniversalLocators.SAVE_BUTTON, "Leave Save Button");

        } catch (Exception e) {
            Assert.fail("Validation failed due to error: " + e.getMessage());
        }
    }
    
    // Reusable method to validate and assert input values
    public void validateInputValue(By locator, String expectedValue, String fieldName) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(element.isDisplayed(), "Element is not displayed: " + fieldName);
        Assert.assertTrue(element.isEnabled(), "Element is not enabled: " + fieldName);
        String actualValue = element.getAttribute("value");
        Assert.assertEquals(actualValue, expectedValue, "Value mismatch in field: " + fieldName);
    }

    // Reusable method to validate clickable elements
    public void validateElementClickable(By locator, String fieldName) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        Assert.assertTrue(element.isDisplayed(), "Element is not displayed: " + fieldName);
        Assert.assertTrue(element.isEnabled(), "Element is not enabled/clickable: " + fieldName);
    }

}
