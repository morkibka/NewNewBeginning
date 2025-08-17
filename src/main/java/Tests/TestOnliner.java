package Tests;

import PageObjects.OnlinerCatalogCategory;
import PageObjects.OnlinerCatalogMain;
import PageObjects.OnlinerMain;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOnliner {

    private Set set = Set.getInstance();
    private OnlinerMain onlinerMain = new OnlinerMain();
    private OnlinerCatalogMain onlinerCatalogMain = new OnlinerCatalogMain();
    private OnlinerCatalogCategory onlinerCatalogCategory = new OnlinerCatalogCategory();

    @BeforeClass
    private void GetAddress() {
        set.SetUp("https://www.onliner.by/");
    }

    @Test
    private void CheckCurseUSD() {
        onlinerMain.Wait10sForOnlinerLogo();
        onlinerMain.GetCurseUSD();
        onlinerMain.PrintCurseUSD();
        onlinerMain.IsCurseUSDNotNull();
    }

    @Test
    private void PrintHighPriceFan() {
        onlinerMain.CatalogBtnClick();
        onlinerCatalogMain.FanCategoryBtnClick();
        onlinerCatalogCategory.SortByClick();
        onlinerCatalogCategory.SelectOrderByPrice();
        onlinerCatalogCategory.PrintFirstPrice();
    }

    //не работает(
    //не ждет и не переключается на модальное окно, модальное окно похоже не показывается
    @Test
    private void SearchSmth(){
        onlinerMain.GetSearchInputText();
        onlinerMain.SearchSmth("iPhone 16e");
        set.Wait10s();
onlinerMain.SwitchToSearchModalWindow();
System.out.println(onlinerMain.GetTitleOfElInSearch(1));
    }

    @AfterClass
    private void Close() {
        set.CloseDriver();
    }
}
