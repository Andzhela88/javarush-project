package com.javarush.task.pro.task06.task0616;

/* 
Учет работников
*/

public class Solution {
    public static final String name = "Amigo";
    public static String position = "Java developer";
    public static int salary = 10_000;

    public void setPosition(String position) {

        position = Solution.position;
    }

    public void setSalary(int salary) {

        salary = Solution.salary;
    }
}
