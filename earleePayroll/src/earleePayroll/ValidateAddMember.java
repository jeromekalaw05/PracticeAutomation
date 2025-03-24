package earleePayroll;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ValidateAddMember extends Main {

    WebDriverWait wait;

    @Test
    public void validateAddMember() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String tempEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.TEMP_EMAIL_FIELD)).getAttribute("value");
        try {
            // Validate TEAM button is clickable
//            WebElement teamBtn = wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.TEAM));
//            Assert.assertTrue(teamBtn.isDisplayed(), "TEAM button is not displayed");
//
//            // Validate MEMBER button is clickable
//            WebElement memberBtn = wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.MEMBER));
//            Assert.assertTrue(memberBtn.isDisplayed(), "MEMBER button is not displayed");
//
//            // Validate ADD MEMBER button is clickable
//            WebElement addMemberBtn = wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.ADDMEMBER));
//            Assert.assertTrue(addMemberBtn.isDisplayed(), "Add Member button is not displayed");

            // Validate FIRST NAME input field is visible and enabled
            WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.FIRST_NAME_MEMBER1));
            Assert.assertTrue(firstName.isDisplayed() && firstName.isEnabled(), "First Name input field is not ready");
            Assert.assertEquals(firstName.getAttribute("value"), UniversalLocators.FIRST_NAME_MEMBER, "First Name input validation failed");

            // Validate LAST NAME input field is visible and enabled
            WebElement lastName = wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.LAST_NAME_MEMBER1));
            Assert.assertTrue(lastName.isDisplayed() && lastName.isEnabled(), "Last Name input field is not ready");
            Assert.assertEquals(lastName.getAttribute("value"), UniversalLocators.LAST_NAME_MEMBER, "Last Name input validation failed");

            // Validate GENDER dropdown is clickable
            WebElement genderDropdown = wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.GENDER));
            genderDropdown.click();
            Assert.assertTrue(genderDropdown.isDisplayed(), "Gender dropdown is not displayed");

            // Validate GENDER option is clickable
            WebElement genderOption = wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.GENDER_OPTION));
            Assert.assertTrue(genderOption.isDisplayed(), "Gender option is not displayed");

            // Validate EMAIL input field is visible and enabled
            WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.EMAIL_MEMBER));
            Assert.assertTrue(email.isDisplayed() && email.isEnabled(), "Email input field is not ready");
            Assert.assertEquals(email.getAttribute("value"), tempEmail, "Email input validation failed");

            // Validate SAVE button is clickable
            WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.SAVE_MEMBER_BUTTON));
            Assert.assertTrue(saveBtn.isDisplayed(), "Save button is not displayed");
            saveBtn.click();

        } catch (Exception e) {
            Assert.fail("Test failed due to exception: " + e.getMessage());
        }
    }
}
