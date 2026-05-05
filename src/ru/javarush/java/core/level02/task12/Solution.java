package ru.javarush.java.core.level02.task12;

public class Solution {
    public static void main(String[] args) {
        // Очки приходят как текстовые строки с отрицательными числами
        String string1 = "-10";
        String string2 = "-25";

        // Преобразуем строки в числа типа int
        int number1 = Integer.parseInt(string1);
        int number2 = Integer.parseInt(string2);

        // Складываем результаты двух раундов
        int summ = number1 + number2;

        // Выводим общий счёт на экран
        System.out.println(summ);

    }
}