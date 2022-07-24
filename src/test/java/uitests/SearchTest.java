package uitests;

import models.Product;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.HomePageSteps;
import steps.ResultPageSteps;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertTrue;

@RunWith(SerenityRunner.class)
public class SearchTest extends BaseTest {
    @Steps
    HomePageSteps homePageSteps;

    @Steps
    ResultPageSteps resultPageSteps;

    @Title("Search test")
    @Test
    public void SearchTest() {
        String searchTerm = "iP";
        homePageSteps
                .openHomePage()
                .search(searchTerm);

        List<Product> products = resultPageSteps.getProducts();

        for (Product product : products) {
            assertTrue(product
                    .getName()
                    .toLowerCase(Locale.ROOT)
                    .contains(searchTerm.toLowerCase(Locale.ROOT)));
        }
    }
}
