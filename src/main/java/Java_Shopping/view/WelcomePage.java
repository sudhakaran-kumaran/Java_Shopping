package Java_Shopping.view;

import Java_Shopping.utils.StringUtils;
import Java_Shopping.utils.Utils;

public class WelcomePage {
    public void welcome() {
        try {
            Utils.println(StringUtils.WELCOME_MESSAGE);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void printAuthMenu() {
        Utils.println(StringUtils.AUTH_MENU);
    }
    void check(){
        System.out.println();
    }
}
