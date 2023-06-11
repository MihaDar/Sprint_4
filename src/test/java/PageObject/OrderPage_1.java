package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage_1 {
    private WebDriver driver;
    public OrderPage_1(WebDriver driver){
        this.driver = driver;
    }
    // Поле Имя
    private By fieldName = By.xpath(".//div[2]/div[1]/input");

    // Поле Фамилия
    private By fieldSurname = By.xpath(".//div[2]/div[2]/input");

    // Поле Адрес
    private By fieldAddress = By.xpath(".//div[2]/div[3]/input");

    // Поле Станция метро
    private By fieldMetroStation = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input");

    // Телефон
    private By fieldTelephone = By.xpath(".//div[2]/div[5]/input");

    // Кнопка Далее
    private By orderNextButton = By.xpath("/html/body/div/div/div[2]/div[3]/button");


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
        driver.findElement(By.xpath(".//button/div[text() = '"+metroStation+"']")).click();
    }

    public void inputFieldTelephone (String telephone){
        driver.findElement(fieldTelephone).sendKeys(telephone);
    }

    public OrderPage_2 clikOrderNextButton(){
        driver.findElement(orderNextButton).click();
        return new OrderPage_2(driver);
    }


}
