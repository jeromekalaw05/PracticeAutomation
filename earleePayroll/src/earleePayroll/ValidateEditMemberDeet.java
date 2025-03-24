package earleePayroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ValidateEditMemberDeet extends Main {

    WebDriverWait wait;

    @Test
    public void validateEditMemberDetails() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Validate Search and Navigation
//            validateElementClickable(UniversalLocators.SEARCH, "Search Bar");
//            validateElementClickable(UniversalLocators.SEARCH_NAME, "Search Result");
//            validateElementClickable(UniversalLocators.COMPLETE_BASIC_INFO, "Complete Info Button");
            validateElementClickable(UniversalLocators.EMPLOYEE_DETAILS_TAB, "Employee Details Tab");
            validateElementClickable(UniversalLocators.EMPLOYEE_DETAILS_EDIT, "Employee Details Edit Button");

            // Validate Personal Information Inputs with data assertions
            validateAndAssertInputValue(UniversalLocators.HIRE_DATE, UniversalLocators.HIRE_DAY, "Hire Day");
            validateAndAssertInputValue(UniversalLocators.MOBILE_NUMBER, UniversalLocators.MOBILE_NUMBER_VAL, "Mobile Number");
            validateAndAssertInputValue(UniversalLocators.BIRTHDATE, UniversalLocators.BIRTHDAY, "Birthdate");
            validateAndAssertInputValue(UniversalLocators.ADDRESS, UniversalLocators.ADDRESS_VAL, "Home Address");
            validateAndAssertInputValue(UniversalLocators.HEIGHT, UniversalLocators.HEIGHT_VAL, "Height");
            validateElementClickable(UniversalLocators.CIVIL_STATUS, "Civil Status Dropdown");
            validateElementClickable(UniversalLocators.CS_OPTION, "Civil Status Option");
            validateAndAssertInputValue(UniversalLocators.WEIGHT, UniversalLocators.WEIGHT_VAL, "Weight");
            validateAndAssertInputValue(UniversalLocators.ZIP_CODE, UniversalLocators.ZIP_CODE_VAL, "Zip Code");
            validateAndAssertInputValue(UniversalLocators.AGE, UniversalLocators.AGE_VAL, "Age");
            validateElementClickable(UniversalLocators.NEXT_BUTTON, "Personal Info Next Button");

            // Employment Details
            validateAndAssertInputValue(UniversalLocators.POSITION, UniversalLocators.position, "Position");
            validateAndAssertInputValue(UniversalLocators.DEPARTMENT, UniversalLocators.department, "Department");
            validateAndAssertInputValue(UniversalLocators.REPORTS_TO, UniversalLocators.reportsTo, "Reports TO");
            validateAndAssertInputValue(UniversalLocators.SALARY, UniversalLocators.salary, "Salary");
            validateElementClickable(UniversalLocators.PAYPERIOD, "Pay Period Dropdown");
            validateElementClickable(UniversalLocators.PAYPERIOD_opt, "Pay Period Option");
            validateAndAssertInputValue(UniversalLocators.EMPLOYMENT_FROM, UniversalLocators.employmentFrom, "Employment From");
            validateAndAssertInputValue(UniversalLocators.EMPLOYMENT_TO, UniversalLocators.employmentTo, "Employment To");
            validateElementClickable(UniversalLocators.REGION, "Region Dropdown");
            validateElementClickable(UniversalLocators.REGION_opt, "Region Option");
            validateElementClickable(UniversalLocators.STATUS, "Marital Status Dropdown");
            validateElementClickable(UniversalLocators.STATUS_opt, "Marital Status Option");
            validateElementClickable(UniversalLocators.NEXT_BUTTON, "Employment Next Button");

            // Government Details
            validateAndAssertInputValue(UniversalLocators.SSS_NUMBER, UniversalLocators.sssNumber, "SSS Number");
            validateAndAssertInputValue(UniversalLocators.BIR_NUMBER, UniversalLocators.birNumber, "BIR");
            validateAndAssertInputValue(UniversalLocators.TAX_NUMBER, UniversalLocators.taxNumber, "Tax");
            validateAndAssertInputValue(UniversalLocators.PHILHEALTH_NUMBER, UniversalLocators.philHealthNumber, "Philhealt");
            validateAndAssertInputValue(UniversalLocators.HFDM_NUMBER, UniversalLocators.hfdmNumber, "HFDM");
            validateAndAssertInputValue(UniversalLocators.PRCLICENSE_NUMBER, UniversalLocators.prcLicenseNumber, "PRC");
            validateAndAssertInputValue(UniversalLocators.VOTER_ID_NUMBER, UniversalLocators.voterIdNumber, "Voter ID");
            validateAndAssertInputValue(UniversalLocators.PASSPORT_NUMBER, UniversalLocators.passportNumber, "Passport");
            validateElementClickable(UniversalLocators.NEXT_BUTTON, "Government Next Button");
            validateElementClickable(UniversalLocators.NEXT_BUTTON, "Work History Button");

            // Bank Details
            validateAndAssertInputValue(UniversalLocators.BANK_NAME, UniversalLocators.bankName, "Bank Name");
            validateAndAssertInputValue(UniversalLocators.ACC_NAME, UniversalLocators.accountName, "Account Name");
            validateAndAssertInputValue(UniversalLocators.ACC_NUMBER, UniversalLocators.accountNumber, "Account NUmber");
            validateElementClickable(UniversalLocators.NEXT_BUTTON, "Bank Deets Next Button");

            // Emergency Contact Details
            validateAndAssertInputValue(UniversalLocators.FULLNAME, UniversalLocators.fullName, "Emergency Name");
            validateAndAssertInputValue(UniversalLocators.RELATIONSHIP, UniversalLocators.relationship, "Emergency Relationship");
            validateAndAssertInputValue(UniversalLocators.MOBILENUMBER, UniversalLocators.mobileNumber, "Emergency Mobile Num");
            validateAndAssertInputValue(UniversalLocators.ADDRESS1, UniversalLocators.address, "Emergency Address");
            validateElementClickable(UniversalLocators.SAVE_BUTTON, "Emergency Save Button");

//            System.out.println("✅ All input fields, buttons are visible, clickable, and input values are validated successfully.");

        } catch (Exception e) {
//            System.out.println("❌ Validation Failed: " + e.getMessage());
            Assert.fail("Validation failed due to exception: " + e.getMessage());
        }
    }

    // Reusable method to validate and assert input values
    public void validateAndAssertInputValue(By locator, String expectedValue, String fieldName) {
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
