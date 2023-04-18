package org.example.userAbstractFactory.interfaces.user.creationUser;

import org.example.userAbstractFactory.interfaces.user.Intern;
import org.example.userAbstractFactory.interfaces.user.Manager;

public interface UserCreation {


    Intern createIntern();
    Manager createManager();
}
