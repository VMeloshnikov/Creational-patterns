package org.example.userAbstractFactory;

import org.example.userAbstractFactory.impl.userImpIntern.SellIntern;
import org.example.userAbstractFactory.impl.userImpManager.SellManager;
import org.example.userAbstractFactory.interfaces.user.Intern;
import org.example.userAbstractFactory.interfaces.user.Manager;
import org.example.userAbstractFactory.interfaces.user.creationUser.UserCreation;

public class SellCompanyUser implements UserCreation {
    @Override
    public Intern createIntern() {
        return new SellIntern();
    }

    @Override
    public Manager createManager() {
        return new SellManager();
    }
}
