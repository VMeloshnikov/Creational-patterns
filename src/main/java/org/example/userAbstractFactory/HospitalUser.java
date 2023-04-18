package org.example.userAbstractFactory;

import org.example.userAbstractFactory.impl.userImpIntern.HospitalIntern;
import org.example.userAbstractFactory.impl.userImpManager.HospitalManager;
import org.example.userAbstractFactory.interfaces.user.Intern;
import org.example.userAbstractFactory.interfaces.user.Manager;
import org.example.userAbstractFactory.interfaces.user.creationUser.UserCreation;

public class HospitalUser implements UserCreation {

    @Override
    public Intern createIntern() {
        return new HospitalIntern();
    }

    @Override
    public Manager createManager() {
        return new HospitalManager();
    }
}
