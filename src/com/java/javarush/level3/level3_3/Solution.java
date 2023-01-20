package com.java.javarush.level3.level3_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительные и отрицательные числа
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        int numberMin = 0;
        int numberScan = Integer.parseInt(reader.readLine());
        int numberScan1 = Integer.parseInt(reader.readLine());
        int numberScan2 = Integer.parseInt(reader.readLine());
        if (numberScan > 0) {
            number++;
        }
        if (numberScan < 0) {
            numberMin++;
        }

        if (numberScan1 > 0) {
            number++;
        }
        if (numberScan1 < 0) {
            numberMin++;
        }

        if (numberScan2 > 0) {
            number++;
        }
        if (numberScan2 < 0) {
            numberMin++;
        }
        System.out.println("количество отрицательных чисел:");
        System.out.println(numberMin);
        System.out.println("количество положительных чисел:");
        System.out.println(number);
        //напишите тут ваш код
    }
}