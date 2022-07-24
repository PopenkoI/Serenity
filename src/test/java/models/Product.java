package models;

import net.serenitybdd.core.pages.PageObject;

public class Product extends PageObject {
    private String root;

    public Product(String root) {
        this.root = root;
    }

    public String getName(){
        withAction().moveToElement(element(root + "//h4"));

        return element(root + "//h4")
                .getText();
    }
}
