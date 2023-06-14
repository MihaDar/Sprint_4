package ru.praktikum.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageUserData {
    private WebDriver driver;
    public OrderPageUserData(WebDriver driver){
        this.driver = driver;
    }
    // Поле Имя
    private By fieldName = By.xpath(".//input[@placeholder = '* Имя']");

    // Поле Фамилия
    private By fieldSurname = By.xpath(".//input[@placeholder = '* Фамилия']");

    // Поле Адрес
    private By fieldAddress = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");

    // Поле Станция метро
    private By fieldMetroStation = By.xpath(".//input[@placeholder = '* Станция метро']");

    // Телефон
    private By fieldTelephone = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");

    // Кнопка Далее
    private By orderNextButton = By.xpath("//button[text() = 'Далее']");


    public void inputFieldName (String name){
        driver.findElement(fieldName).sendKeys(name);
    }

    public void inputFieldSurname (String surname){
        driver.findElement(fieldSurname).sendKeys(surname);
    }

    public void inputFieldAddress (String address){
        driver.findElement(fieldAddress).sendKeys(address);
    }
    public void inputFieldMetroStation (String metroStation){
        driver.findElement(fieldMetroStation).sendKeys(metroStation);
        driver.findElement(By.xpath( /* Выбор станции меторо */ ".//button/div[text() = '"+metroStation+"']")).click();
    }

    public void inputFieldTelephone (String telephone){
        driver.findElement(fieldTelephone).sendKeys(telephone);
    }

    public ru.praktikum.qa_scooter.OrderPageAdditionalInformation clikOrderNextButton(){
        driver.findElement(orderNextButton).click();
        return new ru.praktikum.qa_scooter.OrderPageAdditionalInformation(driver);
    }
}
