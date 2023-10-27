package Java_Shopping.controller.implementation;

import Java_Shopping.utils.AppException;

public interface IAuthController {

    void authMenu();

    void login() throws AppException;

    void register();

    void logout();

}
