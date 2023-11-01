package ru.oop.transport;

import ru.oop.Positioned;

/**
 * Интерфейс, описывающий свойства транспорта
 */
public interface Transport extends Positioned {

    /**
     * Проехать на транспорте
     */
    void ride();

}
