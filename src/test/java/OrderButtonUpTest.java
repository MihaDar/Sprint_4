import PageObject.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// ТЕСТ ВТОРОГО СЦЕНАРИЯ ПРИ ИСПОЛЬЗОВАНИИ ВЕРХНИХ КНОПОК ЗАКАЗАТЬ

@RunWith(Parameterized.class)

public class OrderButtonUpTest {
    private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final String metroStation;
    private final String telephone;
    private final String deliveryDate;
    private final String rentPeriod;
    private final String color;
    private final String comment;

    public OrderButtonUpTest(String name, String surname, String address, String metroStation, String telephone, String deliveryDate, String rentPeriod, String color, String comment){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroStation = metroStation;
        this.telephone = telephone;
        this.deliveryDate = deliveryDate;
        this.rentPeriod = rentPeriod;
        this.color = color;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getOrderPage_1() {
        return new Object[][] {
                {"Иван", "Иванов", "Москва 11", "Римская", "+74951234567", "01.07.2023", "двое суток", "black", "Жду с нетерпением!"},
                {"Вася", "Васильев", "Москва 22", "Черкизовская", "+74957654321", "15.07.2023", "пятеро суток", "grey", "Привозите скорее."},
        };
    }

    @Before
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
    }

    @Test
    public void testOrderButtonDown() {

        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePage objHomePage = new HomePage(driver);

        objHomePage.buttonCookie();
        objHomePage.orderButtonUp();

        OrderPage_1 objOrderPage_1 = new OrderPage_1(driver);

        objOrderPage_1.inputFieldName(name);
        objOrderPage_1.inputFieldSurname(surname);
        objOrderPage_1.inputFieldAddress(address);
        objOrderPage_1.inputFieldMetroStation(metroStation);
        objOrderPage_1.inputFieldTelephone(telephone);
        objOrderPage_1.clikOrderNextButton();

        OrderPage_2 objOrderPage_2 = new OrderPage_2(driver);

        objOrderPage_2.inputFieldDeliveryDate(deliveryDate);
        objOrderPage_2.inputFieldRentPeriod(rentPeriod);
        objOrderPage_2.inputFieldColor(color);
        objOrderPage_2.inputFieldComment(comment);
        objOrderPage_2.orderButtonOrderPage_2Up();

        PopupWantOrder objPopupWantOrder = new PopupWantOrder(driver);

        objPopupWantOrder.windowWantOrder();

        PopupOrderDecoration objPopupOrderDecoration = new PopupOrderDecoration(driver);

        objPopupOrderDecoration.windowOrderDecoration();


    }

    @After
    public void teardown() {
        driver.quit();
    }
}
