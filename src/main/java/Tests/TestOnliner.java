package Tests;

import PageObjects.OnlinerCatalogCategory;
import PageObjects.OnlinerCatalogMain;
import PageObjects.OnlinerMain;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOnliner {
    Set set = new Set();
    OnlinerMain onlinerMain = new OnlinerMain();
    OnlinerCatalogMain onlinerCatalogMain = new OnlinerCatalogMain();
    OnlinerCatalogCategory onlinerCatalogCategory = new OnlinerCatalogCategory();

    @BeforeClass
    public void GetAddress() {
        set.SetUp("https://www.onliner.by/");
    }

    @Test
    public void CheckCurseUSD() {
        onlinerMain.Wait10sForOnlinerLogo();
        onlinerMain.GetCurseUSD();
        onlinerMain.PrintCurseUSD();
        onlinerMain.IsCurseUSDNotNull();
    }

    @Test
    public void PrintHighPriceFan() {
        onlinerMain.CatalogBtnClick();
        onlinerCatalogMain.FanCategoryBtnClick();
        onlinerCatalogCategory.SortByClick();
        onlinerCatalogCategory.SelectOrderByPrice();
        onlinerCatalogCategory.PrintFirstPrice();

    }

    @AfterClass
    public void Close() {
        set.CloseDriver();
    }
}
