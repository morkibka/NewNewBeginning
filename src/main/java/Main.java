import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public  static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver", "/Users/maksim/Desktop/autoProject/MyProject/My_Res/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");


driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@title='Поиск']"))));


        WebElement input = driver.findElement(By.xpath("//textarea[@title='Поиск']"));
        input.getAttribute("clientHeight");
        input.click();
    }
}
