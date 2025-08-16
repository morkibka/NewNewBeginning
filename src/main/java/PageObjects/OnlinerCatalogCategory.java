package PageObjects;

import Tests.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class OnlinerCatalogCategory {
    public Set set = new Set();
    String sortBy = "//select[@class='input-style__real']";
    String priceDesc = "//option[@value=\"price:desc\"]";
    String firstPrice = "//a[@class='catalog-form__link catalog-form__link_nodecor catalog-form__link_primary-additional catalog-form__link_huge-additional catalog-form__link_font-weight_bold']";


    public void SortByClick() {
        set.Driver().findElement(By.xpath(sortBy)).click();
    }

    public Select SortBySelect() {
        return new Select(set.Driver().findElement(By.xpath(sortBy)));
    }

    public void SelectOrderByPrice() {
        SortBySelect().selectByIndex(4);
    }

    public String GetFirstPrice() {
        return set.Driver().findElement(By.xpath(firstPrice)).getAttribute("innerText");
    }

    public void PrintFirstPrice() {
        System.out.println(GetFirstPrice());

    }

        /*   set.wait10s.until(ExpectedConditions.visibilityOf(set.driver.findElement(By.xpath(sortBy))));
        set.wait10s.until(ExpectedConditions.visibilityOf(set.driver.findElement(By.xpath(priceDesc))));
      set.driver.findElement(By.xpath(priceDesc)).click();
        System.out.println(set.driver.findElement(By.xpath(firstPrice)).getAttribute("innerText"));
        */
}
