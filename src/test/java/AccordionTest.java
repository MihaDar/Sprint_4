import PageObject.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

// ТЕСТ АККОРДИОНА

public class AccordionTest {
    private WebDriver driver;

    @Before
    public void setUp() {
//       WebDriverManager.firefoxdriver().setup();
//       driver = new FirefoxDriver();
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    }

    @Test
    public void testAccordion(){


        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePage objHomePage = new HomePage(driver);

        // скрол до аккордиона
        WebElement element = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]/div[1]/div"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        objHomePage.buttonCookie();
        objHomePage.clickAccordion_1();
        objHomePage.waitAccordion_1("Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
        objHomePage.clickAccordion_2();
        objHomePage.waitAccordion_2("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
        objHomePage.clickAccordion_3();
        objHomePage.waitAccordion_3("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
        objHomePage.clickAccordion_4();
        objHomePage.waitAccordion_4("Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
        objHomePage.clickAccordion_5();
        objHomePage.waitAccordion_5("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
        objHomePage.clickAccordion_6();
        objHomePage.waitAccordion_6("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
        objHomePage.clickAccordion_7();
        objHomePage.waitAccordion_7("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
        objHomePage.clickAccordion_8();
        objHomePage.waitAccordion_8("Да, обязательно. Всем самокатов! И Москве, и Московской области.");

    }
 @After
 public void teardown() {
  driver.quit();
 }
}

