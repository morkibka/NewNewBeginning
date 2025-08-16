package PageObjects;

import Tests.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OnlinerCatalogMain {
    public Set set = new Set();
    String fans = "//img[@alt='Вентиляторы']";

    public void FanCategoryBtnClick() {
        set.Wait10s().until(ExpectedConditions.visibilityOf(set.Driver().findElement(By.xpath(fans))));
        set.Driver().findElement(By.xpath(fans)).click();
    }

}
