package utils;

import net.serenitybdd.core.Serenity;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DriverUtils {
    public void clickOnElementJS(WebElement webElement) {
        getJSExecutor().executeScript("arguments[0].click();", webElement);
    }

    private JavascriptExecutor getJSExecutor() {
        return (JavascriptExecutor) Serenity.getDriver();
    }
}