package com.java.javarush.level4.level4_1;


/*
Таблица умножения на 10
*/

public class Solution {
    public static void main(String[] args) {
        int number=1;
        int number2;
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <= 10; j++) {
                number2=number*j;
                System.out.print(number2);
                System.out.print(" ");
            }
            System.out.println();
           number++;
        }
        //напишите тут ваш код
    }
}
