package Java_Shopping.utils;

import static Java_Shopping.utils.AppScanner.getScanner;

public class AppInput {

    public static String enterString(String msg) {
        Utils.print(msg);
        return getScanner().nextLine();
    }

    public static int enterInt(String msg) throws AppException {
        Utils.print(msg);
        int input;
        try {
            input = Integer.parseInt(getScanner().nextLine());
        } catch (Exception ex) {
            throw new AppException(StringUtils.INVALID_CHOICE);
        }
        return input;
    }
}
