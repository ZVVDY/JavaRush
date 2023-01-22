package com.java.javarush.level6_array.level6_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Улица и дома
 * Создать массив на 15 целых чисел.
 * Ввести в него значения с клавиатуры.
 * Пускай индекс элемента массива является номером дома, а значение — числом жителей, проживающих в доме.
 * Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой.
 * Выяснить, на какой стороне улицы проживает больше жителей.
 * Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с
 * четными номерами проживает больше жителей."
 * Примечание: дом с порядковым номером 0 считать четным.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] numberHome = new int[15];
        int evenNumbered = 0;//четный номер дома
        int oddNumber = 0;//нечетный номер дома
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numberHome.length; i++) {
            numberHome[i] = Integer.parseInt(reader.readLine());
        }

        for (int a = 0; a < numberHome.length; a++) {
            if (a % 2 == 0 || a == 0) {
                evenNumbered = evenNumbered + numberHome[a];
            } else {
                oddNumber = oddNumber + numberHome[a];
            }
        }
        if (evenNumbered > oddNumber) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        if (evenNumbered < oddNumber) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        if (evenNumbered == oddNumber) {
            System.out.println();
        }
    }
}