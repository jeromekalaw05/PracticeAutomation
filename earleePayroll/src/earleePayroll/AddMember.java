package earleePayroll;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddMember extends Main {
	
	public WebDriverWait wait;
	
	@Test
	public void addMember() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
		wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.TEAM)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.MEMBER)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.ADDMEMBER)).click();
     // Open a new tab for temp mail
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        // Switch to the temp mail tab
        driver.switchTo().window(tabs.get(1));
        driver.get(UniversalLocators.TEMP_MAIL_URL);

        // Wait for the temp email to be generated
        Thread.sleep(5000);
		String tempEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(UniversalLocators.TEMP_EMAIL_FIELD)).getAttribute("value");

        // Switch back to the member tab
        driver.switchTo().window(tabs.get(0));

        // Fill in the member details
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.FIRST_NAME_MEMBER1)).sendKeys(UniversalLocators.FIRST_NAME_MEMBER);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.LAST_NAME_MEMBER1)).sendKeys(UniversalLocators.LAST_NAME_MEMBER);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.GENDER)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.GENDER_OPTION)).click();
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.EMAIL_MEMBER)).sendKeys(tempEmail);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.SAVE_MEMBER_BUTTON)).click();
        		
        
		} catch (Exception e) {
            System.out.println("Error encountered: " + e.getMessage());
        }
	}

}
