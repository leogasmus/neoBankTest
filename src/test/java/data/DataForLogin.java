package data;

import org.testng.annotations.DataProvider;

public class DataForLogin {
@DataProvider
    public Object[][] getDataForLogin() {
        return new Object[][] {
                {"NEOBANK для бізнесу", "501234567", "Відкриття бізнес-рахунку можливе тільки через додаток NEOBANK для бізнесу"},
                {"NEOBANK для бізнесу", "636901699", "Відкриття бізнес-рахунку можливе тільки через NEOBANK для бізнесу"}
        };
    }
}
