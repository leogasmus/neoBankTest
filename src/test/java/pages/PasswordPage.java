package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PasswordPage {
    SelenideElement textForOther = $x("//*[@id='formAuthQr']/div[1]");
    public String getTextForOther () {
        return textForOther.getText();
    }
}
