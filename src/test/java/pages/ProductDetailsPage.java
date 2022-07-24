package pages;

import models.AppleCinemaModel;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import utils.DriverUtils;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

public class ProductDetailsPage extends PageObject {

    public void makeOrder(AppleCinemaModel appleCinemaModel) {
        new DriverUtils().clickOnElementJS($(String.format("//label//input[@type = 'radio' and @value = '%s']", appleCinemaModel.getRadio())));
        $(String.format("(//input[@type='checkbox'])[%s]", appleCinemaModel.getCheckbox())).click();
        $("//input[@id='input-option208']").sendKeys(appleCinemaModel.getText());
        $("//select[@id='input-option217']").click();
        $(String.format("//option[@value='%s']",appleCinemaModel.getSelect())).click();
        $("//textarea[@id='input-option209']").sendKeys(appleCinemaModel.getTextarea());

        File file = new File(appleCinemaModel.getFile());
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
