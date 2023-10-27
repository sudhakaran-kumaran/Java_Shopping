package Java_Shopping.controller;

import Java_Shopping.controller.implementation.IHomeController;
import Java_Shopping.utils.AppException;
import Java_Shopping.utils.AppInput;
import Java_Shopping.utils.StringUtils;
import Java_Shopping.utils.Utils;

import static Java_Shopping.utils.Utils.println;

public class HomeController implements IHomeController {
    private ProductController productController;
    public HomeController(){
        productController = new ProductController();
    }

    @Override
    public void printMenu() throws AppException {
        println(StringUtils.WELCOME_MESSAGE);
        System.out.println("Logged in Successfully!!!");
        println(StringUtils.MENU_OPTION);

        productController.select(AppInput.enterInt(StringUtils.ENTER_CHOICE));
    }
    

}
