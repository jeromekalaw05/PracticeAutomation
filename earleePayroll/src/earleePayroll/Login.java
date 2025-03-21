package earleePayroll;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class Login extends Main {

    @Test
    public void login() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(UniversalLocators.URL);

        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.EMAIL))
            .sendKeys(UniversalLocators.emailAddress_creds);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.PASSWORD))
            .sendKeys(UniversalLocators.password_creds);
        wait.until(ExpectedConditions.elementToBeClickable(UniversalLocators.LOGIN)).click();

    }
}
