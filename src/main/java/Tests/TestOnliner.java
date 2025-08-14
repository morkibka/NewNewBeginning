package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestOnliner {
    public Set set = new Set();
    String OnlinerLogoXpath = "//img[@class='onliner_logo']";
    String OnlinerUSDtoBYNXpath = "//span[@class='_u js-currency-amount']";
//
    @BeforeClass
    public void GetAddress() {
        set.SetUp("https://www.onliner.by/");
        set.wait10s.until(ExpectedConditions.visibilityOf(set.driver.findElement(By.xpath(OnlinerLogoXpath))));
    }
    @Test
    public void LoginTest() {
     String currentCurse = set.driver.findElement(By.xpath(OnlinerUSDtoBYNXpath)).getText();
     System.out.println("Текущий курс: " + currentCurse);
     Assert.assertNotNull(currentCurse);
    }

    @AfterClass
    public void Close() {
        set.CloseDriver();
    }
}
