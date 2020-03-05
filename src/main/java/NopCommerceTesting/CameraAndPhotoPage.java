package NopCommerceTesting;

import org.openqa.selenium.By;

//camera and photo page
public class CameraAndPhotoPage extends Utils {
    //Locator for add to compare list - product 1
    private By _compareButton1=By.xpath("//input[2][@class=\"button-2 add-to-compare-list-button\"]");
    //To close green link
    private By _closeComparison=By.xpath("//span[@class=\"close\"]");
    //Locator for add to compare list - product 2
    private By _compareButton2=By.xpath("//div[@data-productid=\"16\"]/div[2]/div[3]/div[2]/input[2]");
    //To click product comparison
    private By _productComparison=By.linkText("product comparison");
    //To select product
    private By _selectProduct=By.xpath("//h2/a[text()=\"Nikon D5500 DSLR\"]");

    //To check we are on camera-photo url
    public void verifyUserIsOnCameraAndPhotoPage()
    {

        assertURL("camera-photo");
    }
    //To click compare button for product 1
    public void clickOnCompareButtonForProduct1()
    {
        //waitForClickable(_compareButton1,30);
        scrollAndClick(_compareButton1);
        //waitForClickable(_closeComparison,30);
        scrollAndClick(_closeComparison);

    }

    //To click compare button for product 2
    public void clickOnCompareButtonForProduct2()
    {
        //waitForClickable(_compareButton2,50);
        scrollAndClick(_compareButton2);
        timeDelay(3);

    }
    //To click on product comparison
    public  void productComparision()
    {
        //waitForClickable(_productComparison,30);
        scrollAndClick(_productComparison);
        timeDelay(3);

    }
    //To select product
    public void selectProduct() {
        scrollAndClick(_selectProduct);

    }




}
