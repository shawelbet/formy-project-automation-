import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/smetaferia/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement box = ((ChromeDriver) driver).findElementById("box");

        WebElement img = ((ChromeDriver) driver).findElementById("image");
        Actions dd = new Actions(driver);
        dd.dragAndDrop(img, box).build().perform();


        driver.quit();
    }
}

