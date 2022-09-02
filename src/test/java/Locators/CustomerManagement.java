package Locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CustomerManagement {

    private SelenideElement customerManagementPageText= $(By.cssSelector(".breadcrumb-title.hide-on-small-only"));

    public SelenideElement getCustomerManagementPageText() {
        return customerManagementPageText;
    }
}
