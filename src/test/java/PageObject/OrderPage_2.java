package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage_2 {

    private WebDriver driver;
    public OrderPage_2(WebDriver driver){
        this.driver = driver;
    }

    // Поле когда привезти самокат
    private By fieldDeliveryDate = By.xpath(".//div[2]/div[1]/div/div/input");

    // Поле страници чтобы снять фокус с календаря
    private By removeFocus = By.xpath("/html/body/div/div/div[2]/div[1]");

    // Поле срок аренды
    private By fieldRentPeriod = By.xpath(".//div[2]/div[2]/div[2]/div[1]/div[1]");

    // Поле цвет самоката
    private By fieldColor = By.xpath(".//div/div[2]/div[2]/div[3]/div");


    // Поле Коммертарий
    private By fieldComment = By.xpath(".//div[2]/div[4]/input");

    // Верхняя Кнопка Заказать
    private By orderButtonOrderPage_2Up = By.className("Button_Button__ra12g");

    // Нижняя Кнопка Заказать
    private By orderButtonDownOrder = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]");

    public void inputFieldDeliveryDate (String deliveryDate){
        driver.findElement(fieldDeliveryDate).sendKeys(deliveryDate);
        driver.findElement(removeFocus).click();
    }

    public void inputFieldRentPeriod (String rentPeriod){
        driver.findElement(fieldRentPeriod).click();
        driver.findElement(By.xpath(/* Выбор из списка */".//div[@class = 'Dropdown-option' and text() = '"+rentPeriod+"']")).click();
    }

    public void inputFieldColor (String color){
        driver.findElement(fieldColor).click();
        driver.findElement(By.xpath(".//input[@id = '"+color+"']")).click();
    }

    public void inputFieldComment (String comment){
        driver.findElement(fieldComment).sendKeys(comment);
    }

    public PopupWantOrder orderButtonDownOrder(){
        driver.findElement(orderButtonDownOrder).click();
    return new PopupWantOrder(driver);
    }

    public PopupWantOrder orderButtonOrderPage_2Up(){
        driver.findElement(orderButtonOrderPage_2Up).click();
        return new PopupWantOrder(driver);
    }

}
