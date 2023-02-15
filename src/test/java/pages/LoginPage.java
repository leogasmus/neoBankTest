package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    SelenideElement loginInput = $x("//input[@id='login']");
    SelenideElement nextButton = $x("//button[@id='btnNext']");

    public LoginPage (String url) {
        Selenide.open(url);
    }

    public void logIn (String phoneNumber) {
        loginInput.sendKeys(phoneNumber);
        nextButton.click();
    }

    public String getTitle() {
        return Selenide.title();
    }


}
