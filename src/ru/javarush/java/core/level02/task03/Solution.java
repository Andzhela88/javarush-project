package ru.javarush.java.core.level02.task03;

public class Solution {
    public static void main(String[] args) {
        // Объявляем общее количество призов и число команд
        int prizes = 15;
        int teams = 4;

        // Вычисляем, сколько целых призов получит каждая команда (целочисленное деление)
        int number1 = prizes / teams;

        // Вычисляем, сколько призов останется после раздачи (оператор %)
        int number2 = prizes % teams;

        // Выводим количество призов на команду
        System.out.println(number1);

        // Выводим остаток призов
        System.out.println(number2);

    }
}