package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestOnliner {
    public Set set = new Set();
    String onlinerLogoXpath = "//img[@class='onliner_logo']";
    String onlinerUSDtoBYNXpath = "//span[@class='_u js-currency-amount']";
    String catalogBtn = "//span[@class='b-main-navigation__text'][1]";
    String fans = "//img[@alt='Вентиляторы']";
    String sortBy = "//select[@class='input-style__real']";
    String priceDesc = "//option[@value=\"price:desc\"]";
    String firstPrice = "//a[@class='catalog-form__link catalog-form__link_nodecor catalog-form__link_primary-additional catalog-form__link_huge-additional catalog-form__link_font-weight_bold']";






    @BeforeClass
    public void GetAddress() {
        set.SetUp("https://www.onliner.by/");
        set.wait10s.until(ExpectedConditions.visibilityOf(set.driver.findElement(By.xpath(onlinerLogoXpath))));
    }
    @Test
    public void LoginTest() {
     String currentCurse = set.driver.findElement(By.xpath(onlinerUSDtoBYNXpath)).getText();
     System.out.println("Текущий курс: " + currentCurse);
     Assert.assertNotNull(currentCurse);
    }
    @Test
    public void SecondTest() {
        set.driver.findElement(By.xpath(catalogBtn)).click();
        set.wait10s.until(ExpectedConditions.visibilityOf(set.driver.findElement(By.xpath(fans))));
        set.driver.findElement(By.xpath(fans)).click();
        set.driver.findElement(By.xpath(sortBy)).click();

        Select objSelect = new Select(set.driver.findElement(By.xpath(sortBy)));
        objSelect.selectByIndex(4);
        System.out.println(set.driver.findElement(By.xpath(firstPrice)).getAttribute("innerText"));


        /*   set.wait10s.until(ExpectedConditions.visibilityOf(set.driver.findElement(By.xpath(sortBy))));
        set.wait10s.until(ExpectedConditions.visibilityOf(set.driver.findElement(By.xpath(priceDesc))));
      set.driver.findElement(By.xpath(priceDesc)).click(); // вот туть делает значение активным, но не кликает
        System.out.println(set.driver.findElement(By.xpath(firstPrice)).getAttribute("innerText"));
        */

    }

    @AfterClass
    public void Close() {
        set.CloseDriver();
    }
}
