package ru.praktikum.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PopupOrderDecoration {
    private WebDriver driver;
    public PopupOrderDecoration(WebDriver driver){
        this.driver = driver;
    }

    //Заголовок всплывающего окна Заказ оформлен
    private By orderPlaced = By.xpath(".//div[@class = 'Order_ModalHeader__3FDaJ']");

    // Кнопка Посмотреть статус
    private By buttonStatus = By.xpath(".//button[text() = 'Посмотреть статус']" );

    // Ожидание заголовка Заказ оформлен
    public void orderPlaced() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(orderPlaced));
    }

    // Клик по кнопке посмотреть статус
    public ru.praktikum.qa_scooter.OrderWindow clikButtonStatus () {
        driver.findElement(buttonStatus).click();
        return new ru.praktikum.qa_scooter.OrderWindow(driver);
    }
}
