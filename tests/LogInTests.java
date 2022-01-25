package tests;

import lib.CoreTestCase;
import lib.ui.LogInPageObject;
import lib.ui.factories.LogInPageObjectFactory;
import org.junit.Test;

public class LogInTests extends CoreTestCase {
    @Test
    public void testLogInNoPin() {
        LogInPageObject LogInPageObject = LogInPageObjectFactory.get(driver);
        LogInPageObject.logIn();
    }
}
