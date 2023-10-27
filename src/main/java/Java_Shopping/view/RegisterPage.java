package Java_Shopping.view;

import Java_Shopping.utils.StringUtils;
import Java_Shopping.utils.Utils;

public class RegisterPage {

    public void printRegistrationSuccessful() {
        try {
            Utils.println("#---------------------#");
            Utils.println(StringUtils.REGISTRATION_SUCCESSFUL);
            Utils.println("#---------------------#");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void passwordMisMatch() {
        try {
            Utils.println("#---------------------#");
            Utils.println(StringUtils.PASSWORD_MISMATCH);
            Utils.println("#---------------------#");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
