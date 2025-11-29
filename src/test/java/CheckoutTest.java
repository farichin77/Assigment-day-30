import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest {

    @Test
    public void testCheckoutProcess() {

        System.setProperty("webdriver.gecko.driver",
                System.getProperty("user.dir") + "/driver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Add to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        // Go to cart
        driver.findElement(By.className("shopping_cart_link")).click();

        // Checkout
        driver.findElement(By.id("checkout")).click();

        // Fill form
        driver.findElement(By.id("first-name")).sendKeys("Ahmad");
        driver.findElement(By.id("last-name")).sendKeys("Farichin");
        driver.findElement(By.id("postal-code")).sendKeys("17121");
        driver.findElement(By.id("continue")).click();

        // Finish order
        driver.findElement(By.id("finish")).click();

        // Assert success text
        String successText = driver.findElement(By.className("complete-header")).getText();
        Assert.assertEquals(successText, "Thank you for your order!");

        // Close browser
        driver.quit();
    }
}

