package org.example.userAbstractFactory.impl.userImpManager;

import org.example.userAbstractFactory.interfaces.user.Manager;

public class HospitalManager implements Manager {
    @Override
    public void treat() {
        System.out.println("Встал и пошел!");
    }
}
