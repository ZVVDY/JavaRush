package com.java.javarush.level4.level4_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Math.max;
import static java.lang.Math.min;

/*
Среднее такое среднее
Введи с клавиатуры три числа, выведи на экран среднее из них. Т.е. не самое большое и не самое маленькое.
Если все числа равны, выведи любое из них.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberScan = Integer.parseInt(reader.readLine());
        int numberScan1 = Integer.parseInt(reader.readLine());
        int numberScan2 = Integer.parseInt(reader.readLine());
        if (numberScan != numberScan1) {
            if (numberScan1 != numberScan2) {
                if (numberScan != numberScan2) {
                    int a = (numberScan + numberScan1 + numberScan2) - Math.max(numberScan, max(numberScan1, numberScan2)) - Math.min(numberScan, min(numberScan1, numberScan2));
                    System.out.println(a);
                }
            }
        }

        if (numberScan == numberScan1 && numberScan1 == numberScan2) {

            System.out.println(numberScan);
        }
        if (numberScan == numberScan1) {
            if (numberScan1 != numberScan2)
                System.out.println(numberScan);
        }
        if (numberScan == numberScan2) {
            if (numberScan != numberScan1) {
                System.out.println(numberScan);
            }
        }
        if (numberScan != numberScan2) {
            if (numberScan1 == numberScan2) {
                System.out.println(numberScan1);
            }
        }

    }

}






























