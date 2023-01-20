package com.java.javarush.level6_array.level6_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Массив из чисел в обратном порядке
 * Создать массив на 10 чисел.
 * Ввести с клавиатуры 10 чисел и записать их в массив.
 * Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 9; i <= 9; i--) {
            System.out.println(numbers[i]);
            if (i == 0) {
                break;
            }
        }

    }
}









