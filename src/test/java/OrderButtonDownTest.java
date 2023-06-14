import ru.praktikum.qa_scooter.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import ru.praktikum.qa_scooter.HomePage;
import ru.praktikum.qa_scooter.OrderPageAdditionalInformation;
import ru.praktikum.qa_scooter.OrderPageUserData;
import ru.praktikum.qa_scooter.PopupOrderDecoration;
import ru.praktikum.qa_scooter.PopupWantOrder;

// ТЕСТ ВТОРОГО СЦЕНАРИЯ ПРИ ИСПОЛЬЗОВАНИИ НИЖНИХ КНОПОК ЗАКАЗАТЬ

@RunWith(Parameterized.class)

public class OrderButtonDownTest extends BaseTest {

    //private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final String metroStation;
    private final String telephone;
    private final String deliveryDate;
    private final String rentPeriod;
    private final String color;
    private final String comment;



    public OrderButtonDownTest(String name, String surname, String address, String metroStation, String telephone, String deliveryDate, String rentPeriod, String color, String comment){
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


    @Test
    public void testOrderButtonDown() {

        final String urlScooter = "https://qa-scooter.praktikum-services.ru/"; // исправление 1
        driver.get(urlScooter);

        HomePage homePage = new HomePage(driver);

        WebElement element = homePage.scrollButtonDownHome();
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        homePage.buttonCookie();
        homePage.clikButtonOrderHomeDown();

        OrderPageUserData orderPage_UserData = new OrderPageUserData(driver);

        orderPage_UserData.inputFieldName(name);
        orderPage_UserData.inputFieldSurname(surname);
        orderPage_UserData.inputFieldAddress(address);
        orderPage_UserData.inputFieldMetroStation(metroStation);
        orderPage_UserData.inputFieldTelephone(telephone);
        orderPage_UserData.clikOrderNextButton();

        OrderPageAdditionalInformation orderPage_AdditionalInformation = new OrderPageAdditionalInformation(driver);

        orderPage_AdditionalInformation.inputFieldDeliveryDate(deliveryDate);
        orderPage_AdditionalInformation.inputFieldRentPeriod(rentPeriod);
        orderPage_AdditionalInformation.inputFieldColor(color);
        orderPage_AdditionalInformation.inputFieldComment(comment);
        orderPage_AdditionalInformation.orderButtonDownOrder();

        PopupWantOrder popupWantOrder = new PopupWantOrder(driver);

        popupWantOrder.windowWantOrder();

        PopupOrderDecoration popupOrderDecoration = new PopupOrderDecoration(driver);

        popupOrderDecoration.orderPlaced(); // появилось сообщение Заказ оформлен
        popupOrderDecoration.clikButtonStatus(); // Кнопка Посмотреть статус

        OrderWindow orderWindow = new OrderWindow(driver);

        orderWindow.scooterInStock(); // Заголовок в окне заказа "Самокат на складе"

    }
}
