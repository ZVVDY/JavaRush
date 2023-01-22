package com.java.javarush.level6_array.level6_8;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Два массива
 * Создать массив на 10 строк.
 * Создать массив на 10 чисел.
 * Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 * В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
 * которой совпадает с текущим индексом из массива чисел.
 * Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        int[] number = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
            number[i] = strings[i].length();
        }
        for (int a = 0; a < number.length; a++) {
            System.out.println(number[a]);
        }
    }
}










