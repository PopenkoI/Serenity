package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomePageSteps {
    private HomePage homePage;

    @Step
    public HomePageSteps openHomePage(){
        homePage.open();

        return this;
    }

    @Step
    public void search(String searchTerm){
        homePage.search(searchTerm);
    }
}
