package org.example.userAbstractFactory.impl.userImpManager;

import org.example.userAbstractFactory.interfaces.user.Manager;

public class SellManager implements Manager {
    @Override
    public void treat() {
        System.out.println("Продам гараж");
    }
}
