package com.mikhaylovich.nabtest.service;

import com.mikhaylovich.nabtest.model.Person;

/**
 * @author mhty
 * @date 17.04.16.
 */
public class Service1 implements InterfaceService1 {
    public Person getPerson() {
        return new Person("Police", "02");
    }
}
