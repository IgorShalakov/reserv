package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.LogInPageObject;

public class iOSLogInPageObject extends LogInPageObject {
    static {
        MAIN_MENU = "id://pro.bacca.uralairlines.dev:id/burgerButton";
    }
    public iOSLogInPageObject(AppiumDriver driver) {
        super(driver);
    }
}
