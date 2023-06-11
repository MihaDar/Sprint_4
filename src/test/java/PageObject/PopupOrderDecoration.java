package PageObject;

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

      // Кнопка Посмотреть статус
    private By buttonStatus = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[text() = 'Посмотреть статус']" );

    public void windowOrderDecoration(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(buttonStatus));
    }
}
