package steps;

import net.thucydides.core.annotations.Step;
import pages.ProductDetailsPage;

public class ProductDetailsPageSteps {
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Step
    public ProductDetailsPageSteps makeOrder() {
        productDetailsPage.makeOrder();

        return this;
    }

    @Step
    public boolean isDisplayedAlertSuccessAddToCart() {

        return productDetailsPage.isDisplayedAlertSuccessAddToCart();
    }
}
