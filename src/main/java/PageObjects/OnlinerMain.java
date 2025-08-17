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
    private String fastSearchInput = "//div[@class='fast-search__form']//input";
    private String searchModalWindow = "fast-search-modal";
    private String titleOfElement = "//div[@class='product__title']";

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
    public String GetSearchInputText() {
return set.Driver().findElement(By.xpath(fastSearchInput)).getText();
    }
    public void SearchSmth(String TargerSearch) {
        set.Driver().findElement(By.xpath(fastSearchInput)).sendKeys(TargerSearch);
    }
    public void SwitchToSearchModalWindow(){
        set.Driver().switchTo().frame(set.Driver().findElement(By.id(searchModalWindow)));
    }
    public String GetTitleOfElInSearch(int element){
        String serchingEl = titleOfElement + "[" + (element - 1) + "]";
       return set.Driver().findElement(By.xpath(serchingEl)).getText();
    }




}
