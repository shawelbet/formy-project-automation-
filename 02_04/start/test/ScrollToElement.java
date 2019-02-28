import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/smetaferia/Downloads/chromedriver");

        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        //Thread.sleep(1000);

        WebElement name = ((ChromeDriver) driver).findElement(By.id("name"));
        Actions actions = new Actions (driver);
        actions.moveToElement(name);
        name.sendKeys("haifa") ;
        WebElement date = ((ChromeDriver) driver).findElementById("date");
        date.sendKeys("2/20/2019");

        //driver.quit();
    }
}
