import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//Users/smetaferia/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement NM = ((ChromeDriver) driver).findElementById("name");
        NM.click();
        NM.sendKeys("Shawel");
        WebElement button = ((ChromeDriver) driver).findElementById("button");
        button.click();

        //driver.quit();
    }
}
