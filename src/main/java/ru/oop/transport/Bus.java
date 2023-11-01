package ru.oop.transport;

import ru.oop.Person;
import ru.oop.Position;

/**
 * Класс автобуса
 */
public class Bus implements Transport {

    /**
     * Человек, который передвигается в автобусе
     */
    private Person person;

    /**
     * Номер автобуса
     */
    private String number;

    public Bus(String number, Person person) {
        this.number = number;
        this.person = person;
    }

    @Override
    public Position getPosition() {
        return null;
    }

    @Override
    public void ride() {
    }

}
