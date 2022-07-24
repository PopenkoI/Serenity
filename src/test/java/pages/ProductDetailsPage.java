package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import utils.DriverUtils;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

public class ProductDetailsPage extends PageObject {

    public void makeOrder() {
        new DriverUtils().clickOnElementJS($(String.format("//label//input[@type = 'radio' and @value = '%s']", 5)));
        $(String.format("(//input[@type='checkbox'])[%s]", 1)).click();
        $("//input[@id='input-option208']").sendKeys("some text");
        $(String.format("(//div[@class='radio'])[%s]", 1)).click();
        $("//select[@id='input-option217']").click();
        $(String.format("//option[@value='%s']", 4)).click();
        $("//textarea[@id='input-option209']").sendKeys("some text in textarea");
        File file = new File("src/test/resources/test.txt");
        StringSelection absolutePath = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(absolutePath, null);
        $(By.id("button-upload222")).click();
        try {
            Robot robot = new Robot();
            robot.delay(3000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        $("//*[@id='button-cart']").click();
    }

    public boolean isDisplayedAlertSuccessAddToCart() {
        String alertXpath = "//*[@class='alert alert-success']";
        waitFor(alertXpath, Duration.ofSeconds(10));

        return $(alertXpath).isDisplayed();
    }
}
