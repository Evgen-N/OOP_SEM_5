package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    /**
     * Отображение списка столиков в приложении
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    /**
     * Отобразить результат бронирования столика
     * @param reservationId номер брони
     */
    void showReservationTableResult(int reservationId);

    /**
     * Отобразить результат отмены бронирования столика
     * @param oldReservation номер брони
     */
    void showDeleteReservation(int oldReservation);

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    void reservationTable(Date orderDate, int tableNo, String name);

        /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param oldReservation старый номер брони
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

    /**
     * Установить наблюдателя для представления
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

}
