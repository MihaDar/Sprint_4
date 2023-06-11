package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PopupWantOrder {
    private WebDriver driver;
    public PopupWantOrder(WebDriver driver){
        this.driver = driver;
    }

    //Кнопка "Да" в окне Хотите оформить заказ
    private By orderButtonOrderYes = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");

    public PopupOrderDecoration windowWantOrder(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(orderButtonOrderYes));
        driver.findElement(orderButtonOrderYes).click();
    return new PopupOrderDecoration(driver);
    }

}
