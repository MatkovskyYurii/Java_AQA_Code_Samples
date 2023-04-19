package myapp.navigationTests;

import myapp.setup.Setup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class ProductPageTests extends Setup {

    private static String Link = ("https://www.ray-ban.com/usa/sunglasses/view-all?orderBy=8&pageNumber=");

    @Test
    public void testPriceSorting() {
        int totalPages = 5;
        List<String> assertionErrors = new ArrayList<>();

        for (int i = 1; i <= totalPages; i++) {
            // Navigate to the current page
            driver.get(Link + i);

            // Wait for the page to fully load
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class," +
                    " 'rb-plp-product-tile__group-price')]/descendant::span[contains(@class, " +
                    "'rb-plp-product-tile__price') or contains(@class, 'rb-plp-product-tile__price--discounted')]")));

            // Extract prices from the current page
            List<String> prices = extractPrices();

            // Convert the price value to a numeric value
            List<Double> numericPrices = new ArrayList<>();
            for (String price : prices) {
                double numericPrice = Double.parseDouble(price.replaceAll("[^\\d.]", ""));
                numericPrices.add(numericPrice);
            }

            // Sort the numeric price values in ascending order
            List<Double> sortedPrices = new ArrayList<>(numericPrices);
            Collections.sort(sortedPrices);

            // Compare the sorted values to the original values to ensure they match
            try {
                Assertions.assertEquals(numericPrices, sortedPrices);
            } catch (AssertionError e) {
                assertionErrors.add(String.format("Assertion error on page %d: %s", i, e.getMessage()));
            }
        }

        // Fail the test if there were any assertion errors
        if (!assertionErrors.isEmpty()) {
            String errorMessage = String.join("\n", assertionErrors);
            fail(errorMessage);
        }
    }

    private List<String> extractPrices() {
        // Find all the product prices on the current page
        List<WebElement> priceElements = driver.findElements(By.xpath("//div[contains(@class, " +
                "'rb-plp-product-tile__group-price')]/descendant::span[contains(@class, 'rb-plp-product-tile__price')" +
                " or contains(@class, 'rb-plp-product-tile__price--discounted')]"));

        // Extract the price value from each element
        List<String> prices = new ArrayList<>();
        for (WebElement priceElement : priceElements) {
            prices.add(priceElement.getAttribute("innerText").trim());
        }
        return prices;
    }
}
