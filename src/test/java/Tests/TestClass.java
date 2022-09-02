package Tests;

import Helpers.Helpers;
import Locators.CustomerManagement;
import Locators.LoginPage;
import Locators.MainPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestClass {

    @Test
    @Order(1)
    @DisplayName("Тест")
    public void LoginPositiveScenarioTest(){
        LoginPage l = new LoginPage();
        Helpers h = new Helpers();
        MainPage m = new MainPage();
        open("https://web.kmlab.by/");
        l.login();
        h.waitForVisible(m.getKateLogo());
        m.getKateLogo().shouldBe(Condition.visible);
        closeWebDriver();
    }

    @Test
    @Order(1)
    @DisplayName("Тест")
    public void CustomerManagementPageOpeningTest(){
        LoginPage l = new LoginPage();
        Helpers h = new Helpers();
        MainPage m = new MainPage();
        CustomerManagement c = new CustomerManagement();
        open("https://web.kmlab.by/");
        l.login();
        h.waitForVisible(m.getKateLogo());
        m.clickOnCustomerManagementButton();
        h.shouldBeVisible(c.getCustomerManagementPageText());
        closeWebDriver();
    }

}
