package glue.pom;

import infrastructure.DriverController;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

public class PomClass
{
    private WebDriver driver;

    private static String mainTable = ".//div[@id='c112']";
    private static String totalPageCount = "//div[3]";
    private static String pageInputField = "//div[2]/input";
    private static String mainTableItems = "//div[@class='row top-space object-list-item']";
    private static String itemID = "//span[@class='label label-default']";
    private static String itemPrice = "//h4[2]";
    private static String pageSelector = "//form[@class='form-inline']";
    private static String addFavouritesButton = "//button[contains(text(), 'add to favorites')]";
    private static String removeFavouritesButton = "//button[contains(text(), 'remove from favorites')]";
    private static String goToFavouritesButton = "//a[(text()='Favorites')]";

    private static String leftColumn = ".//div[@class='col-md-4 no-print']";
    private static String realEstateTypeSection = "//ul[.//li[@class='active']/a[text()='%s']]//a[text()='%s']";

    private static String sortByPath = ".//div[@class='btn-group pull-right']//a[contains(text(), '%s')]";


    /**
     * Constructor for main PomClass
     * @param controller - grants access to webdriver
     */
    public PomClass(DriverController controller)
    {
        this.driver = controller.getDriver();
    }

    /** Opens main page **/
    public void openMainPage()
    {
        driver.get("https://www.cityreal.lv/en/");
    }

    /**
     * Navigates to a specific section
     * @param actionType - what is intended to be done with property (sold/rented etc)
     * @param section - what kind of property (house, land etc)
     */
    public void goToSection(String actionType, String section)
    {
        WebElement buttonToClick = driver.findElement(By.xpath(leftColumn+String.format(realEstateTypeSection, actionType, section)));
        buttonToClick.click();
    }

    /**
     * Checks if IDs are unique
     * @return boolean with information about IDs uniqueness
     */
    public boolean checkIDsAreUnique()
    {
        List<WebElement> item = driver.findElements(By.xpath(mainTable+mainTableItems+itemID));
        List<String> listOfIDs = new ArrayList<String>();
        for (WebElement eachItem : item)
        {
            String currentID = eachItem.getText();
            if (listOfIDs.contains(currentID))
            {
                return false;
            }
            listOfIDs.add(currentID);
        }
        return true;
    }

    /**
     * Navigates to the last page
     */
    public void goToLastPage()
    {
        WebElement pageSelection = driver.findElement(By.xpath(mainTable+pageSelector));
        String totalPCount =  pageSelection.findElement(By.xpath(totalPageCount)).getText().replaceAll("[^\\d.]", "");

        WebElement pageSelectionField = pageSelection.findElement(By.xpath(pageInputField));
        pageSelectionField.clear();
        pageSelectionField.sendKeys(totalPCount);
        pageSelectionField.submit();
    }

    /**
     * Sorts by a specific field
     * @param sortBy - by what field should sorting occur
     */
    public void sortByType(String sortBy)
    {
        WebElement sortByElement = driver.findElement(By.xpath(String.format(sortByPath, sortBy)));
        sortByElement.click();
    }

    /**
     * Checks if prices are ascending
     * @return boolean with information about prices being in Ascending order
     */
    public boolean ArePriceAscending()
    {
        List<WebElement> itemPriceList = driver.findElements(By.xpath(mainTable+mainTableItems+itemPrice));
        float previousItemValue = -1;
        for(WebElement currentItemPrice : itemPriceList)
        {
            float currentItemValue = Float.parseFloat(currentItemPrice.getText().split(" ")[0]);
            if (previousItemValue <= currentItemValue)
            {
                previousItemValue = currentItemValue;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if prices are descending
     * @return boolean with information about prices being in Descending order
     */
    public boolean arePriceDescending()
    {
        List<WebElement> itemPriceList = driver.findElements(By.xpath(mainTable+mainTableItems+itemPrice));
        float previousItemValue = -1;
        for(WebElement currentItemPrice : itemPriceList)
        {
            float currentItemValue = Float.parseFloat(currentItemPrice.getText().split(" ")[0]);
            if (previousItemValue >= currentItemValue || previousItemValue == -1)
            {
                previousItemValue = currentItemValue;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * Adds the first possible item to favourites
     */
    public void addAnItemToFavourites()
    {
        WebElement favButton = driver.findElement(By.xpath(mainTable+addFavouritesButton));
        favButton.click();
    }

    /**
     * Goes to favourites section trough the favourites button
     */
    public void goToFavourites()
    {
        WebElement goToFavButton = driver.findElement(By.xpath(mainTable+goToFavouritesButton));
        goToFavButton.click();
    }

    /**
     * Checks if count of items matches expected
     * @param itemCount expected count of items
     * @return boolean with status of matching
     */
    public boolean itemCountMatches(int itemCount)
    {
        List<WebElement> allItems = driver.findElements(By.xpath(mainTableItems));
        if (allItems.size() == itemCount)
        {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Removes item from favourites
     */
    public void removeFavourite()
    {
        WebElement itemToRemove = driver.findElement(By.xpath(removeFavouritesButton));
        itemToRemove.click();
        driver.navigate().refresh();
    }
}
