package ru.praktikum.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Стрелочка 1
    private By accordion_1 = By.xpath(".//div[@id = 'accordion__heading-0']");

    //Стрелочка 2
    private By accordion_2 = By.xpath(".//div[@id = 'accordion__heading-1']");

    //Стрелочка 3
    private By accordion_3 = By.xpath(".//div[@id = 'accordion__heading-2']");

    //Стрелочка 4
    private By accordion_4 = By.xpath(".//div[@id = 'accordion__heading-3']");

    //Стрелочка 5
    private By accordion_5 = By.xpath(".//div[@id = 'accordion__heading-4']");

    //Стрелочка 6
    private By accordion_6 = By.xpath(".//div[@id = 'accordion__heading-5']");

    //Стрелочка 7
    private By accordion_7 = By.xpath(".//div[@id = 'accordion__heading-6']");

    //Стрелочка 8
    private By accordion_8 = By.xpath(".//div[@id = 'accordion__heading-7']");


    // Выпадающий текст 1
    private By accordionAnswerText_1 = By.xpath(".//div[1]/div[2]/p");

    //Выпадающий текст 2
    private By accordionAnswerText_2 = By.xpath(".//div[2]/div[2]/p");

    //Выпадающий текст 3
    private By accordionAnswerText_3 = By.xpath(".//div[3]/div[2]/p");

    //Выпадающий текст 4
    private By accordionAnswerText_4 = By.xpath(".//div[4]/div[2]/p");

    //Выпадающий текст 5
    private By accordionAnswerText_5 = By.xpath(".//div[5]/div[2]/p");

    //Выпадающий текст 6
    private By accordionAnswerText_6 = By.xpath(".//div[6]/div[2]/p");

    //Выпадающий текст 7
    private By accordionAnswerText_7 = By.xpath(".//div[7]/div[2]/p");

    //Выпадающий текст 8
    private By accordionAnswerText_8 = By.xpath(".//div[8]/div[2]/p");

    // Верхняя Кнопка Заказать
    private By orderButtonOrderHomeUp = By.className("Button_Button__ra12g");

    // Нижняя Кнопка Заказать
    private By orderButtonDownHome = By.xpath(".//div[4]/div[2]/div[5]/button");

    //Кнопка куки
    private By buttonCookie = By.xpath(".//div[2]/div/div[2]/button");



    public void buttonCookie() {driver.findElement(buttonCookie).click();}

    public WebElement scrollAccordion() {
        driver.findElement(accordion_1);
        return driver.findElement(accordion_1);
    }

    public WebElement scrollButtonDownHome() {driver.findElement(orderButtonDownHome);
        return driver.findElement(orderButtonDownHome);
    }

    public void clickAccordion_1(String textAnswer) {
        driver.findElement(accordion_1).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_1, textAnswer));

    }

    public void clickAccordion_2(String textAnswer) {
        driver.findElement(accordion_2).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_2, textAnswer));

    }

    public void clickAccordion_3(String textAnswer) {
        driver.findElement(accordion_3).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_3, textAnswer));

    }

    public void clickAccordion_4(String textAnswer) {
        driver.findElement(accordion_4).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_4, textAnswer));

    }

    public void clickAccordion_5(String textAnswer) {
        driver.findElement(accordion_5).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_5, textAnswer));

    }

    public void clickAccordion_6(String textAnswer) {
        driver.findElement(accordion_6).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_6, textAnswer));

    }

    public void clickAccordion_7(String textAnswer) {
        driver.findElement(accordion_7).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_7, textAnswer));

    }

    public void clickAccordion_8(String textAnswer) {
        driver.findElement(accordion_8).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_8, textAnswer));
    }

    public ru.praktikum.qa_scooter.OrderPageUserData clikButtonOrderHomeDown () {
         driver.findElement(orderButtonDownHome).click();
         return new ru.praktikum.qa_scooter.OrderPageUserData(driver);
    }

    public ru.praktikum.qa_scooter.OrderPageUserData orderButtonUp () {
        driver.findElement(orderButtonOrderHomeUp).click();
        return new ru.praktikum.qa_scooter.OrderPageUserData(driver);
    }

}
