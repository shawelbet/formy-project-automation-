import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/smetaferia/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = ((ChromeDriver) driver).findElementById("modal-button");
        modalButton.click();

        WebElement closeButton = ((ChromeDriver) driver).findElementById("close-button");


        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments [0].click();", closeButton);

        driver.quit();
    }
}
