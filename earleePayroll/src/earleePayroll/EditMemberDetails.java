package earleePayroll;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EditMemberDetails extends Main{
	
	 public WebDriverWait wait;
	
	@Test
	public void editMemberDetails() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    try {
        // Edit Employee Details
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.SEARCH)).sendKeys(UniversalLocators.FIRST_NAME_MEMBER);
//        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.SEARCH_NAME)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.COMPLETE_BASIC_INFO)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.EMPLOYEE_DETAILS_TAB)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.EMPLOYEE_DETAILS_EDIT)).click();
        
//        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.HIRE_DATE))
        .sendKeys(UniversalLocators.HIRE_DAY, Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.MOBILE_NUMBER)).sendKeys(UniversalLocators.MOBILE_NUMBER_VAL);
       
//        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.BIRTHDATE))
        .sendKeys(UniversalLocators.BIRTHDAY, Keys.RETURN);

        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.ADDRESS)).sendKeys(UniversalLocators.ADDRESS_VAL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.HEIGHT)).sendKeys(UniversalLocators.HEIGHT_VAL);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.CIVIL_STATUS)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.CS_OPTION)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.WEIGHT)).sendKeys(UniversalLocators.WEIGHT_VAL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.ZIP_CODE)).sendKeys(UniversalLocators.ZIP_CODE_VAL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.AGE)).sendKeys(UniversalLocators.AGE_VAL);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.NEXT_BUTTON)).click();

   
     // Fill in employee details
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.POSITION)).sendKeys(UniversalLocators.position);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.DEPARTMENT)).sendKeys(UniversalLocators.department);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.REPORTS_TO)).sendKeys(UniversalLocators.reportsTo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.SALARY)).sendKeys(UniversalLocators.salary);

        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.PAYPERIOD)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.PAYPERIOD_opt)).click();
        
//        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.EMPLOYMENT_FROM))
        .sendKeys(UniversalLocators.employmentFrom, Keys.RETURN);
        
        
        
//        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.EMPLOYMENT_TO))
        .sendKeys(UniversalLocators.employmentTo, Keys.RETURN);
        
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.REGION)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.REGION_opt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.STATUS)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.STATUS_opt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.NEXT_BUTTON)).click();

        // Fill in government details
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.SSS_NUMBER)).sendKeys(UniversalLocators.sssNumber);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.BIR_NUMBER)).sendKeys(UniversalLocators.birNumber);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.TAX_NUMBER)).sendKeys(UniversalLocators.taxNumber);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.PHILHEALTH_NUMBER)).sendKeys(UniversalLocators.philHealthNumber);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.HFDM_NUMBER)).sendKeys(UniversalLocators.hfdmNumber);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.PRCLICENSE_NUMBER)).sendKeys(UniversalLocators.prcLicenseNumber);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.VOTER_ID_NUMBER)).sendKeys(UniversalLocators.voterIdNumber);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.PASSPORT_NUMBER)).sendKeys(UniversalLocators.passportNumber);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.NEXT_BUTTON)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.NEXT_BUTTON)).click();
        
        // Fill in bank details
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.BANK_NAME)).sendKeys(UniversalLocators.bankName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.ACC_NAME)).sendKeys(UniversalLocators.accountName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.ACC_NUMBER)).sendKeys(UniversalLocators.accountNumber);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.NEXT_BUTTON)).click();

        // Fill in emergency contact details
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.FULLNAME)).sendKeys(UniversalLocators.fullName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.RELATIONSHIP)).sendKeys(UniversalLocators.relationship);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.MOBILENUMBER)).sendKeys(UniversalLocators.mobileNumber);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.ADDRESS1)).sendKeys(UniversalLocators.address);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.SAVE_BUTTON)).click();

        // Verify successful completion
//        Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(UniversalLocators.SAVE_BUTTON)).isDisplayed(), "Details not saved correctly");
//        System.out.println("Employee details saved successfully");
	    } catch (Exception e) {
            System.out.println("Error encountered: " + e.getMessage());
        }
	    
	 
	}
}
