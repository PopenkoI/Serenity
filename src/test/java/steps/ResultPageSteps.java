package steps;

import models.Product;
import net.thucydides.core.annotations.Step;
import pages.ResultPage;

import java.util.List;

public class ResultPageSteps {
    ResultPage resultPage;

    @Step
    public Product getProduct(int index) {
        return resultPage.getProduct(index);
    }

    @Step
    public List<Product> getProducts() {
        return resultPage.getProducts();
    }

    @Step
    public void goToProductDetailsPage(String productName) {
        resultPage.goToProductDetailsPage(productName);
    }
}
