package Locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement kateLogo = $(By.cssSelector(".brand-logo"));

    public SelenideElement getKateLogo() {
        return kateLogo;
    }

    private SelenideElement customerManagementButton = $(By.xpath("//*[@id='slide-out']/li[2]/a"));

    public void clickOnCustomerManagementButton(){
        $(customerManagementButton).click();
    }
}
