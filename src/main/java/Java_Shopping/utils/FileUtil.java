package Java_Shopping.utils;

import java.io.File;

public class FileUtil {

    private static File credentailsFile;
    private static File productsFile;

    public static File getCredentialsFile() {
        if (credentailsFile == null)
            credentailsFile = new File("src/main/Java/Java_Shopping/assests/credentials.csv");
        return credentailsFile;
    }
    public static File getProducts() {
        if(productsFile == null)
            productsFile = new File("src/main/Java/Java_Shopping/assets/products.csv");
        return productsFile;
    }
}
