import ru.praktikum.qa_scooter.HomePage;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static ru.praktikum.qa_scooter.Url.URLSCOOTER;


// ТЕСТ АККОРДИОНА

public class AccordionTest extends BaseTest{
    @Test
    public void testAccordion(){

        driver.get(URLSCOOTER);

        HomePage homePage = new HomePage(driver);

        WebElement element = homePage.scrollAccordion();
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        homePage.buttonCookie();
        homePage.clickAccordion_1("Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
        homePage.clickAccordion_2("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
        homePage.clickAccordion_3("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
        homePage.clickAccordion_4("Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
        homePage.clickAccordion_5("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
        homePage.clickAccordion_6("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
        homePage.clickAccordion_7("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
        homePage.clickAccordion_8("Да, обязательно. Всем самокатов! И Москве, и Московской области.");
 }
//    @After
//        public void teardown() {
//            driver.quit();
//    }
}

