package Helpers;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Helpers {

    public void waitForVisible(SelenideElement input){
        $(input).shouldBe(visible, Duration.ofSeconds(10));
    }

    public SelenideElement shouldBeVisible(SelenideElement element){
        return element.shouldBe(visible);
    }
}
