package io.loop.test.day6;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_alerts {

    @Test
    public void promptAlert(){
        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickJSPrompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        clickJSPrompt.click();

        String text = "Loopcamp";

//        driver.switchTo().alert().sendKeys(text);
//        driver.switchTo().alert().accept();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();

        WebElement successMessagePromptAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = successMessagePromptAlert.getText();
        String expected = "You entered: " + text;
        assertEquals(actual, expected, "Actual does not match the expected");

        clickJSPrompt.click();
        alert.sendKeys(text);
        alert.dismiss();
        actual = successMessagePromptAlert.getText();
        expected = "You entered: " + null;
        Assert.assertEquals(actual, expected, "Does not match");
    }