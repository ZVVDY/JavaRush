package com.java.javarush.level3.level3_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        int numberScan = Integer.parseInt(reader.readLine());
        int numberScan1 = Integer.parseInt(reader.readLine());
        int numberScan2 = Integer.parseInt(reader.readLine());
        if (numberScan > 0) {
            number++;
        }
        if (numberScan <= 0) {
            number = number + 0;
        }

        if (numberScan1 > 0) {
            number++;
        }
        if (numberScan1 <= 0) {
            number = number + 0;
        }

        if (numberScan2 > 0) {
            number++;
        }
        if (numberScan2 <= 0) {
            number = number + 0;
        }

        System.out.println(number);
        //напишите тут ваш код
    }
}
