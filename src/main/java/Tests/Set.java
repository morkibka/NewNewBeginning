package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Set{
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait10s = new WebDriverWait(driver, Duration.ofSeconds(10));
    Actions builder = new Actions(driver);

    public void SetUp( String adress) {
        driver.get(adress);
    }
    public void CloseDriver() {
        driver.close();
    }
}
