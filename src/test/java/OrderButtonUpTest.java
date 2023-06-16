import ru.praktikum.qa_scooter.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.praktikum.qa_scooter.HomePage;
import ru.praktikum.qa_scooter.OrderPageAdditionalInformation;
import ru.praktikum.qa_scooter.OrderPageUserData;
import ru.praktikum.qa_scooter.PopupOrderDecoration;
import ru.praktikum.qa_scooter.PopupWantOrder;

import static ru.praktikum.qa_scooter.Url.URL_SCOOTER;

// ТЕСТ ВТОРОГО СЦЕНАРИЯ ПРИ ИСПОЛЬЗОВАНИИ ВЕРХНИХ КНОПОК ЗАКАЗАТЬ

@RunWith(Parameterized.class)

public class OrderButtonUpTest extends BaseTest{

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
    public static Object[][] getOrderPageData() {
        return new Object[][] {
                {"Иван", "Иванов", "Москва 11", "Римская", "+74951234567", "01.07.2023", "двое суток", "black", "Жду с нетерпением!"},
                {"Вася", "Васильев", "Москва 22", "Черкизовская", "+74957654321", "15.07.2023", "пятеро суток", "grey", "Привозите скорее."},
        };
    }


    @Test
    public void testOrderButtonUpTest() {

        driver.get(URL_SCOOTER);

        HomePage homePage = new HomePage(driver);

        homePage.buttonCookie();
        homePage.orderButtonUp();

        OrderPageUserData orderPageUserData = new OrderPageUserData(driver);

        orderPageUserData.inputFieldName(name);
        orderPageUserData.inputFieldSurname(surname);
        orderPageUserData.inputFieldAddress(address);
        orderPageUserData.inputFieldMetroStation(metroStation);
        orderPageUserData.inputFieldTelephone(telephone);
        orderPageUserData.clikOrderNextButton();

        OrderPageAdditionalInformation orderPageAdditionalInformation = new OrderPageAdditionalInformation(driver);

        orderPageAdditionalInformation.inputFieldDeliveryDate(deliveryDate);
        orderPageAdditionalInformation.inputFieldRentPeriod(rentPeriod);
        orderPageAdditionalInformation.inputFieldColor(color);
        orderPageAdditionalInformation.inputFieldComment(comment);
        orderPageAdditionalInformation.orderButtonOrderPage2Up();

        PopupWantOrder popupWantOrder = new PopupWantOrder(driver);

        popupWantOrder.windowWantOrder();

        PopupOrderDecoration popupOrderDecoration = new PopupOrderDecoration(driver);

        popupOrderDecoration.orderPlaced(); // появилось сообщение Заказ оформлен
        popupOrderDecoration.clikButtonStatus(); // Кнопка Посмотреть статус

        OrderWindow orderWindow = new OrderWindow(driver);

        orderWindow.scooterInStock(); // Заголовок в окне заказа "Самокат на складе"

    }

}
