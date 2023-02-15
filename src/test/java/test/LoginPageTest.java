package test;

import data.DataForLogin;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PasswordPage;
import pages.LoginPage;

public class LoginPageTest extends ABaseTest {

    public static final String BASE_URL = "https://web.neobank.one/";

    @Test(dataProvider = "getDataForLogin", dataProviderClass = DataForLogin.class)
    public void checkLoginNewUser(String pageTitle, String phoneNumber, String infoText) {
        LoginPage mainPage = new LoginPage(BASE_URL);
        Assert.assertEquals(mainPage.getTitle(), pageTitle, "Title is incorrect");
        mainPage.logIn(phoneNumber);

        PasswordPage passwordPage = new PasswordPage();
        Assert.assertEquals(passwordPage.getTextForOther(), infoText, "Text is incorrect");

    }
}

