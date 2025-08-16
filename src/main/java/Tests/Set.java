package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Set {

    private static Set instance;
    private final WebDriver driver = new ChromeDriver();
    private final WebDriverWait wait10s = new WebDriverWait(driver, Duration.ofSeconds(10));
    private final Actions builder = new Actions(driver);

    private Set() {
    }

    public static Set getInstance() {
        if (instance == null) {
            instance = new Set();
        }
        return instance;
    }


    public WebDriver Driver() {
        return driver;
    }

    public WebDriverWait Wait10s() {
        return wait10s;
    }

    public Actions Builder() {
        return builder;
    }

    public void SetUp(String adress) {
        driver.get(adress);
    }

    public void CloseDriver() {
        driver.close();
    }
}
