package pages;

import models.Product;
import net.serenitybdd.core.pages.PageObject;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;
import static java.util.stream.IntStream.rangeClosed;

public class ResultPage extends PageObject {

    public Product getProduct(int index) {
        waitFor("//h1");

        return new Product(String.format("(//div[@class='product-thumb'])[%s]", index));
    }

    public List<Product> getProducts() {
        waitFor("//h1");
        String productsPath = "//div[@class='product-thumb']";
        int amountOfProducts = findAll(productsPath).size();

        return rangeClosed(1, amountOfProducts)
                .mapToObj(i -> new Product(format("(%s)[%s]", productsPath, i)))
                .collect(Collectors.toList());
    }

    public void goToProductDetailsPage(String productName) {
        $(String.format("//a[text()='%s']", productName)).click();
    }
}
