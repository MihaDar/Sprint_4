package ru.praktikum.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageAdditionalInformation {

    private WebDriver driver;
    public OrderPageAdditionalInformation(WebDriver driver){
        this.driver = driver;
    }

    // Поле когда привезти самокат placeholder
    private By fieldDeliveryDate = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");

    // Поле страници чтобы снять фокус с календаря
    private By removeFocus = By.xpath(".//div[text() = 'Про аренду']");

    // Поле срок аренды
    private By fieldRentPeriod = By.xpath(".//div[text() = '* Срок аренды']");

    // Поле цвет самоката
    private By fieldColor = By.xpath(".//div[text() = 'Цвет самоката']");

    // Поле Коммертарий
    private By fieldComment = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");

    // Верхняя Кнопка Заказать
    private By orderButtonOrderPage2Up = By.className("Button_Button__ra12g");

    // Нижняя Кнопка Заказать
    private By orderButtonDownOrder = By.xpath(".//div/div[2]/div[3]/button[2]");

    // Выбор даты доставки
    public void inputFieldDeliveryDate (String deliveryDate){
        driver.findElement(fieldDeliveryDate).sendKeys(deliveryDate);
        driver.findElement(removeFocus).click();
    }

    // Выбор срока аренды
    public void inputFieldRentPeriod (String rentPeriod){
        driver.findElement(fieldRentPeriod).click();
        driver.findElement(By.xpath(/* Выбор из списка срок аренды */".//div[@class = 'Dropdown-option' and text() = '"+rentPeriod+"']")).click();
    }

    // Выбор цвета самоката
    public void inputFieldColor (String color){
        driver.findElement(fieldColor).click();
        driver.findElement(By.xpath(".//input[@id = '"+color+"']")).click();
    }

    // Ввод коментария
    public void inputFieldComment (String comment){
        driver.findElement(fieldComment).sendKeys(comment);
    }

    // Клик по нижней кнопке Заказать
    public PopupWantOrder orderButtonDownOrder(){
        driver.findElement(orderButtonDownOrder).click();
    return new PopupWantOrder(driver);
    }

    // Клик по верхней кнопке Заказать
    public PopupWantOrder orderButtonOrderPage2Up(){
        driver.findElement(orderButtonOrderPage2Up).click();
        return new PopupWantOrder(driver);
    }
}
