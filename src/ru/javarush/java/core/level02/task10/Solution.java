package ru.javarush.java.core.level02.task10;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа int для хранения номера рейса
        int numberFlight = 1421;

        // Объявляем переменную типа String для хранения города назначения
        String city = "Moscow";

        // Объединяем номер рейса и город назначения в одну строку с помощью оператора +
        String message = "Рейс " + numberFlight + " до " + city;

        // Выводим итоговую строку на экран
        System.out.println(message);

    }
}