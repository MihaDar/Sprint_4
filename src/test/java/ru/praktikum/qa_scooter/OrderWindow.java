package ru.praktikum.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderWindow {

    private WebDriver driver;
    public OrderWindow(WebDriver driver){
        this.driver = driver;
    }

    // Заголовок в окне заказа "Самокат на складе"
    private By scooterInStock = By.xpath(".//div[text() = 'Самокат на складе']");

    public void scooterInStock(){
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(scooterInStock));

    }


}
