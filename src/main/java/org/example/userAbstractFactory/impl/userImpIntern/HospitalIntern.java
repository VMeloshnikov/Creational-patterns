package org.example.userAbstractFactory.impl.userImpIntern;

import org.example.userAbstractFactory.interfaces.user.Intern;
import org.example.userAbstractFactory.interfaces.user.Manager;
import org.example.userAbstractFactory.interfaces.user.creationUser.UserCreation;

public class HospitalIntern implements Intern {


    @Override
    public void study() {
        System.out.println("Я учу внутренний мир человека");
    }
}
