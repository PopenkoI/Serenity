package steps;

import models.AppleCinemaModel;
import net.thucydides.core.annotations.Step;
import pages.ProductDetailsPage;

public class ProductDetailsPageSteps {
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Step
    public ProductDetailsPageSteps makeOrder(AppleCinemaModel appleCinemaModel) {
        productDetailsPage.makeOrder(appleCinemaModel);

        return this;
    }

    @Step
    public boolean isDisplayedAlertSuccessAddToCart() {

        return productDetailsPage.isDisplayedAlertSuccessAddToCart();
    }
}
