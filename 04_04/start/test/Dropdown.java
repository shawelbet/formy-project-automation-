import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/smetaferia/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement rb1 = driver.findElement(By.id("dropdownMenuButton") );
        rb1.click();


        WebElement rb3 = ((ChromeDriver) driver).findElementByXPath("/html/body/div/div/div/a[5]");
        rb3.click();

        driver.quit();
    }
}
