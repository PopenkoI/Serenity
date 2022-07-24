package uitests;

import models.AppleCinemaModel;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.apache.commons.lang3.RandomStringUtils;
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
        AppleCinemaModel appleCinemaModel = AppleCinemaModel.getBuilder()
                .radio(5)
                .checkbox(1)
                .text(RandomStringUtils.randomAlphabetic(5))
                .select(1)
                .textarea(RandomStringUtils.randomAlphabetic(4))
                .file("src/test/resources/test.txt")
                .build();

        boolean isDisplayedAlertSuccessAddToCart = productDetailsPageSteps
                .makeOrder(appleCinemaModel)
                .isDisplayedAlertSuccessAddToCart();
        Assert.assertTrue(isDisplayedAlertSuccessAddToCart);
    }
}
