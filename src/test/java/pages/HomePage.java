package pages;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

    public void search(String searchTerm) {
        $("//*[@name='search']").sendKeys(searchTerm);
        $("//span[@class='input-group-btn']").click();
    }
}
