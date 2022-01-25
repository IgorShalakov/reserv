package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.LogInPageObject;

public class AndroidLogInPageObject extends LogInPageObject {
    static {
        MAIN_MENU = "id:pro.bacca.uralairlines.dev:id/burgerButton";
        LOG_IN_BUTTON = "xpath://*[@text='Войти']";
        LOGIN = "id:pro.bacca.uralairlines.dev:id/loginFieldView";
        PASSWORD = "id:pro.bacca.uralairlines.dev:id/passwordFieldView";
        BIG_BUTTON_LOGIN = "id:pro.bacca.uralairlines.dev:id/logInButton";
        CANCEL_PIN = "id:android:id/button2";
        USER = "id:pro.bacca.uralairlines.dev:id/cardNameView";
    }
    public AndroidLogInPageObject(AppiumDriver driver) {
        super(driver);
    }
}

