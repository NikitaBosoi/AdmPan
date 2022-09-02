package Locators;

import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private String loginPageLink = "https://web.kmlab.by";

    @FindBy(how = How.CSS,using = ".card-title.center")
    private SelenideElement loginPage;



    private SelenideElement emailField = $(By.cssSelector("#Email"));


    public SelenideElement getEmailField() {
        return emailField;
    }

    private SelenideElement passwordField = $(By.cssSelector("#Password"));

    private SelenideElement loginButton = $(By.cssSelector(".btn.primary.col.s12.m6.offset-m1"));

    @Test
    public void setEmailInEmailField(String email){
        $(emailField).setValue(email);
    }

    public void setPasswordField(String password){
        $(passwordField).setValue(password);
    }

    public void clickLoginButton(){
        $(loginButton).click();
    }

    public void login(){
        setEmailInEmailField("nikita.bosoi@katemedia.eu");
        setPasswordField("123456");
        clickLoginButton();
    }
}
