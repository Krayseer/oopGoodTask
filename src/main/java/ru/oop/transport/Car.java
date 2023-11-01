package ru.oop.transport;

import ru.oop.Person;
import ru.oop.Position;

/**
 * Класс автомобиля
 */
public class Car implements Transport {

    /**
     * Человек, который передвигается в машине
     */
    private Person person;

    public Car(Person person) {
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
