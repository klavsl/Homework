package glue.steps;

import glue.pom.PomClass;
import infrastructure.DriverController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MainPageSteps
{

    DriverController controller;
    PomClass pomClass;

    public MainPageSteps(DriverController controller)
    {
        this.controller = controller;
        pomClass = new PomClass(this.controller);
     }

    @Given("^the site is open$")
    @When("^I return to the main page$")
    public void openMainPage()
    {
        pomClass.openMainPage();
    }

    @When("^I click on sort by \"([^\"]*)\"$")
    public void SortBy(String sortBy)
    {
        pomClass.sortByType(sortBy);
    }

    @When("^I under deal type \"([^\"]*)\" go to real estate type \"([^\"]*)\"$")
    public void goToSection(String actionType, String section)
    {
        pomClass.goToSection(actionType, section);
    }

    @When("^I add an item to favourites$")
    public void addItemToFavourites()
    {
        pomClass.addAnItemToFavourites();
    }

    @When("^I go to the favourites section")
    public void goToFavourites()
    {
        pomClass.goToFavourites();
    }

    @When("^I remove an item from the favourites section$")
    public void removeFavouriteItem()
    {
        pomClass.removeFavourite();
    }

    @Then("^I navigate to the last page$")
    public void goToLastPage()
    {
        pomClass.goToLastPage();
    }

    @Then("^I see all IDs on the first page are unique$")
    public void checkIDUniqueness()
    {
        Assert.assertTrue("The IDs were not unique", pomClass.checkIDsAreUnique());
    }

    @Then("^price is ascending$")
    public void priceIsAscending()
    {
        Assert.assertTrue("The prices were not ascending", pomClass.ArePriceAscending());
    }

    @Then("^price is descending$")
    public void priceIsDescending()
    {
        Assert.assertTrue("The prices were not Descending", pomClass.arePriceDescending());
    }

    @Then("^I can see \"([^\"]*)\" items$")
    public void seeNumberOfItems(int itemCount)
    {
        Assert.assertTrue("The item count was not correct", pomClass.itemCountMatches(itemCount));
    }

}
