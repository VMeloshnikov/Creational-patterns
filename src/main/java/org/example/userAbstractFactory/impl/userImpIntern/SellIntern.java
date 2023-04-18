package org.example.userAbstractFactory.impl.userImpIntern;

import org.example.userAbstractFactory.interfaces.user.Intern;

public class SellIntern implements Intern {
    @Override
    public void study() {
        System.out.println("Я изучаю технологию продаж");
    }
}
