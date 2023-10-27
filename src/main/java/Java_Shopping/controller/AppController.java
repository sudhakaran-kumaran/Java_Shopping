package Java_Shopping.controller;

import Java_Shopping.controller.implementation.IAppController;
import Java_Shopping.view.WelcomePage;

public class AppController implements IAppController {

    private final WelcomePage welcomePage;
    private final AuthController authController;

    public AppController() {
        welcomePage = new WelcomePage();
        authController = new AuthController(this);
    }

    @Override
    public void init() {
        welcomePage.welcome();
        authController.authMenu();
    }

    public void printAuthMenu() {
        welcomePage.printAuthMenu();
    }
}
