package PageObjects;

import Tests.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class OnlinerCatalogCategory {
   private Set set = Set.getInstance();
    private String sortBy = "//select[@class='input-style__real']";
    private String priceDesc = "//option[@value=\"price:desc\"]";
    private String firstPrice = "//*[contains(@class, 'catalog-form__link_primary-additional')]";


    public void SortByClick() {
        set.Driver().findElement(By.xpath(sortBy)).click();
    }

    public Select SortBySelect() {
        return new Select(set.Driver().findElement(By.xpath(sortBy)));
    }

    public void SelectOrderByPrice() {
        SortBySelect().selectByIndex(2);
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
