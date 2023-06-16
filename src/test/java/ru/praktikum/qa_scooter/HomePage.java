package ru.praktikum.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Стрелочка 1
    private By accordion_1 = By.xpath(".//div[@id = 'accordion__heading-0']");

    // Верхняя Кнопка Заказать
    private By orderButtonOrderHomeUp = By.className("Button_Button__ra12g");

    // Нижняя Кнопка Заказать
    private By orderButtonDownHome = By.xpath(".//div[4]/div[2]/div[5]/button");

    //Кнопка куки
    private By buttonCookie = By.xpath(".//div[2]/div/div[2]/button");

    // принятие куки
    public void buttonCookie() {driver.findElement(buttonCookie).click();}

    // Скролл до аккордиона
    public void scrollAccordion() {
        WebElement element = driver.findElement(accordion_1);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
    }

    // Скролл до нижней кнопки заказать
    public void scrollButtonDownHome() {
        WebElement element = driver.findElement(orderButtonDownHome);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
    }

    // Метод кликает вопрос Аккордиона и возвращает ответ
    public String clickAccordion(int accordionIdNumber) {
        driver.findElement(By.id("accordion__heading-" + (accordionIdNumber))).click();
        new WebDriverWait(driver, Duration.ofSeconds(3));
        return driver.findElement(By.id("accordion__panel-" + (accordionIdNumber))).getText();
    }


    // Клик по нижней кнопке заказать
    public ru.praktikum.qa_scooter.OrderPageUserData clikButtonOrderHomeDown () {
         driver.findElement(orderButtonDownHome).click();
         return new ru.praktikum.qa_scooter.OrderPageUserData(driver);
    }

    // Клик по верхнейней кнопке заказать
    public ru.praktikum.qa_scooter.OrderPageUserData orderButtonUp () {
        driver.findElement(orderButtonOrderHomeUp).click();
        return new ru.praktikum.qa_scooter.OrderPageUserData(driver);
    }

}
