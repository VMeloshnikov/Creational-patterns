package org.example;

import org.example.transportFactory.SelectTransport;
import org.example.transportFactory.Transport;
import org.example.transportFactory.TransportType;
import org.example.userAbstractFactory.HospitalUser;
import org.example.userAbstractFactory.SellCompanyUser;
import org.example.userAbstractFactory.interfaces.user.Intern;
import org.example.userAbstractFactory.interfaces.user.Manager;
import org.example.userAbstractFactory.interfaces.user.creationUser.UserCreation;

/**
 * В реализации transportFactory реализованы два паттерна: синглтон, для создания единичного экземпляра класса
 * и фабричный паттерн, для расширения возможностей программы
 */

public class Main {
    public static void main(String[] args) {
        //===================Factory=======================================//
        Transport tu140 = SelectTransport.getInstance().getTransport(TransportType.SKY);
        tu140.startLogistic();

        Transport nsk154B190MM = SelectTransport.getInstance().getTransport(TransportType.ROAD);
        nsk154B190MM.stopLogistic();
        //====================AbstractFactory===============================//
        /** Далее реализация AbstractFactory. Используется при создании семейства разных объектов*/
        UserCreation hospitalUser = new HospitalUser();

        Intern lobanov = hospitalUser.createIntern();
        Manager bykov = hospitalUser.createManager();
        lobanov.study();
        bykov.treat();

        UserCreation sellManager = new SellCompanyUser();
        Intern petrov = sellManager.createIntern();
        Manager ivanov = sellManager.createManager();
        petrov.study();
        ivanov.treat();

    }
}