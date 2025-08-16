package PageObjects;

import Tests.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class OnlinerMain {
    private Set set = Set.getInstance();
    private String onlinerLogoXpath = "//img[@class='onliner_logo']";
    private String onlinerUSDtoBYNXpath = "//span[@class='_u js-currency-amount']";
    private String catalogBtn = "//li[@class='b-main-navigation__item']//a[@href = 'https://catalog.onliner.by']";

    public void Wait10sForOnlinerLogo() {
        set.Wait10s().until(ExpectedConditions.visibilityOf(set.Driver().findElement(By.xpath(onlinerLogoXpath))));
    }

    public String GetCurseUSD() {
        return set.Driver().findElement(By.xpath(onlinerUSDtoBYNXpath)).getText();
    }

    public void PrintCurseUSD() {
        System.out.println("Текущий курс: " + GetCurseUSD());

    }

    public void IsCurseUSDNotNull() {
        Assert.assertNotNull(GetCurseUSD());
    }

    public void CatalogBtnClick() {
        set.Driver().findElement(By.xpath(catalogBtn)).click();
    }


}
