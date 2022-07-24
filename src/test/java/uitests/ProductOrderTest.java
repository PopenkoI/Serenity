package uitests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.HomePageSteps;
import steps.ProductDetailsPageSteps;
import steps.ResultPageSteps;

@RunWith(SerenityRunner.class)
public class ProductOrderTest extends BaseTest {
    @Steps
    HomePageSteps homePageSteps;

    @Steps
    ResultPageSteps resultPageSteps;

    @Steps
    ProductDetailsPageSteps productDetailsPageSteps;

    @Title("Product Order test")
    @Test
    public void ProductOrderTest() {
        String searchTerm = "Apple Cinema 30\"";
        homePageSteps
                .openHomePage()
                .search(searchTerm);

        resultPageSteps.goToProductDetailsPage(searchTerm);
        boolean isDisplayedAlertSuccessAddToCart = productDetailsPageSteps
                .makeOrder()
                .isDisplayedAlertSuccessAddToCart();
        Assert.assertTrue(isDisplayedAlertSuccessAddToCart);
    }
}
