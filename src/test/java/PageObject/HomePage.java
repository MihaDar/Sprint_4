package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    //сайт самоката https://qa-scooter.praktikum-services.ru/
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Стрелочка 1
    private By accordion_1 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]/div[1]/div");

    //Стрелочка 2
    private By accordion_2 = By.xpath(".//div[2]/div/div[2]/div[1]/div");

    //Стрелочка 3
    private By accordion_3 = By.xpath(".//div[2]/div/div[3]/div[1]/div");

    //Стрелочка 4
    private By accordion_4 = By.xpath(".//div[2]/div/div[4]/div[1]/div");

    //Стрелочка 5
    private By accordion_5 = By.xpath(".//div[2]/div/div[5]/div[1]/div");

    //Стрелочка 6
    private By accordion_6 = By.xpath(".//div[2]/div/div[6]/div[1]/div");

    //Стрелочка 7
    private By accordion_7 = By.xpath(".//div[2]/div/div[7]/div[1]/div");

    //Стрелочка 8
    private By accordion_8 = By.xpath(".//div[2]/div/div[8]/div[1]/div");


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

    public String clickAccordion_1(){
    driver.findElement(accordion_1).click();
    return driver.findElement(accordionAnswerText_1).getText();
}

    public void waitAccordion_1(String openText) {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_1, openText));
    }

    public String clickAccordion_2(){
        driver.findElement(accordion_2).click();
        return driver.findElement(accordionAnswerText_2).getText();
    }

    public void waitAccordion_2(String openText) {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_2, openText));
    }

    public String clickAccordion_3(){
        driver.findElement(accordion_3).click();
        return driver.findElement(accordionAnswerText_3).getText();
    }

    public void waitAccordion_3(String openText) {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_3, openText));
    }

    public String clickAccordion_4(){
        driver.findElement(accordion_4).click();
        return driver.findElement(accordionAnswerText_4).getText();
    }

    public void waitAccordion_4(String openText) {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_4, openText));
    }

    public String clickAccordion_5(){
        driver.findElement(accordion_5).click();
        return driver.findElement(accordionAnswerText_5).getText();
    }

    public void waitAccordion_5(String openText) {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_5, openText));
    }

    public String clickAccordion_6(){
        driver.findElement(accordion_6).click();
        return driver.findElement(accordionAnswerText_6).getText();
    }

    public void waitAccordion_6(String openText) {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_6, openText));
    }


    public String clickAccordion_7(){
        driver.findElement(accordion_7).click();
        return driver.findElement(accordionAnswerText_7).getText();
    }

    public void waitAccordion_7(String openText) {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_7, openText));
    }


    public String clickAccordion_8(){
        driver.findElement(accordion_8).click();
        return driver.findElement(accordionAnswerText_8).getText();
    }

    public void waitAccordion_8(String openText) {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                        .textToBePresentInElementLocated
                                (accordionAnswerText_8, openText));
    }

    public OrderPage_1 clikButtonOrderHomeDown(){
        driver.findElement(orderButtonDownHome).click();
        return new OrderPage_1(driver);
    }

    public OrderPage_1 orderButtonUp(){
        driver.findElement(orderButtonOrderHomeUp).click();
        return new OrderPage_1(driver);
    }


}
