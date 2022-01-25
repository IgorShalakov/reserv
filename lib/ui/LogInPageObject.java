package lib.ui;

import io.appium.java_client.AppiumDriver;

import static junit.framework.TestCase.assertEquals;

abstract public class LogInPageObject extends MainPageObject {
    protected static String
            MAIN_MENU,
            LOG_IN_BUTTON,
            LOGIN,
            PASSWORD,
            BIG_BUTTON_LOGIN,
            CANCEL_PIN,
            USER;

    public LogInPageObject(AppiumDriver driver) {
        super(driver);
    }

    public void logIn() {

        String expected_user = "Igor Shalakov";

        this.waitForElementAndClick(MAIN_MENU,
                "Не найдена кнопка Меню",
                15
        );
        this.waitForElementAndClick(LOG_IN_BUTTON,
                "Не найдена кнопка Войти",
                15
        );

        this.waitForElementAndSendKeys(LOGIN, "89133997023", "Не найдено поле Логин", 15);

        this.waitForElementAndSendKeys(PASSWORD, "2546Fight!", "Не найдено поле Пароль", 15);

        this.waitForElementAndClick(BIG_BUTTON_LOGIN,
                "Не найдена кнопка Войти после ввода полей",
                15
        );

        this.waitForElementAndClick(CANCEL_PIN,
                "Не найдена кнопка отмены использования пин-кода",
                15
        );

        String actual_Log_in = waitForElementAndGetAttribute(USER, "text", "Не удалось получить имя держателя карты лояльности", 5);


        assertEquals(
                "Имя авторизовавшегося пользователя не совпадает с ожидаемым!",
                expected_user,
                actual_Log_in);
    }

}
