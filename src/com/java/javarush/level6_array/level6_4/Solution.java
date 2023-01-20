package com.java.javarush.level6_array.level6_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Массив из строк в обратном порядке
 * Создать массив на 10 строк.
 * Ввести с клавиатуры 8 строк и сохранить их в массив.
 * Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент — с новой строки.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < strings.length; i++) {

            strings[i] = reader.readLine();

            if (i == 7) {
                break;
            }

        }
        for (int i = 9; i <= 9; i--) {
            System.out.println(strings[i]);
            if (i == 0) {
                break;
            }
        }

    }
}









