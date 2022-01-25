package lib.ui.factories;

        import io.appium.java_client.AppiumDriver;
        import lib.Platform;
        import lib.ui.LogInPageObject;
        import lib.ui.android.AndroidLogInPageObject;
        import lib.ui.ios.iOSLogInPageObject;

public class LogInPageObjectFactory {

    public static LogInPageObject get(AppiumDriver driver) {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidLogInPageObject(driver);
        } else {
            return new iOSLogInPageObject(driver);
        }
    }
}