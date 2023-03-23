package tests;

import base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTest extends BaseClass {

    protected String myName = "Ways AL";
    protected String myEmail = "logam1818@gmail.com";
    protected String myPass = "admin1234";
    @Test
    public void registerValid() {
        driver.findElement(By.id("com.loginmodule.learning:id/textViewLinkRegister")).click();
        driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys(myName);
        driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys(myEmail);
        driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys(myPass);
        driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys(myPass);
        driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
        teardown();
    }
}
