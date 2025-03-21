package earleePayroll;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EmployeeLeave extends Main {
	public WebDriverWait wait;
	
	@Test
	public void AddingLeave() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
		// Add Employee Leave
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.EMPLOYEELEAVE_TAB)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.ADDING_LEAVE)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.LEAVETYPE)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.LEAVE_TYPE_OPT)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.LEAVENUMBER)).sendKeys(UniversalLocators.leaveNumber);
        wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.LEAVEBALANCE)).sendKeys(UniversalLocators.leaveBalance);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.SAVE_BUTTON)).click();
		
		} catch (Exception e) {
			System.out.println("Error encountered: " + e.getMessage());
		}
        
	}

}
