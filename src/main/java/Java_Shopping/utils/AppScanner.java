package Java_Shopping.utils;

import java.io.File;
import java.util.Scanner;

public class AppScanner {
    private static Scanner scanner;

    public static Scanner getScanner() {
        if (scanner == null)
            scanner = new Scanner(System.in);
        return scanner;
    }
    public static Scanner getScannerF(File file){
        if(scanner == null)
            scanner = new Scanner(System.in);
        return scanner;
    }
}
