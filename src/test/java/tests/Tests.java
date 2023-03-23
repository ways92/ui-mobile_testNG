package tests;

import base.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseClass {


    protected String myName = "Ways AL";
    protected String myEmail = "logam1818@gmail.com";
    protected String myPass = "admin1234";
    protected String idModal = "com.loginmodule.learning:id/snackbar_text";


    @Test (priority = 1)
    public void registerValid() throws InterruptedException {
        driver.findElement(By.id("com.loginmodule.learning:id/textViewLinkRegister")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextName")).sendKeys(myName);
        driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys(myEmail);
        driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys(myPass);
        driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")).sendKeys(myPass);
        driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonRegister")).click();
        Thread.sleep(7000);
        driver.navigate().back();
    }

    @Test ( priority = 2)
    public void loginValid() throws InterruptedException {

        driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys(myEmail);
        driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys(myPass);
        driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonLogin")).click();
        Thread.sleep(5000);
        String actualEmail = driver.findElement(By.id("com.loginmodule.learning:id/textViewEmail")).getText();
        Assert.assertEquals(actualEmail, myEmail);
    }

}
