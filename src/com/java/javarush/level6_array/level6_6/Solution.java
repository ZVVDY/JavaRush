package com.java.javarush.level6_array.level6_6;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
Один большой массив и два маленьких

 *Создать массив на 20 чисел.
 * Ввести в него значения с клавиатуры.
 * Создать два массива на 10 чисел каждый.
 * Скопировать большой массив в два маленьких: половину чисел в первый маленький,
 * вторую половину во второй маленький.
 * Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numberMain = new int[20];
        int [] numberOne = new int[10];
        int [] numberTwo = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numberMain.length; i++) {
            numberMain[i] = Integer.parseInt(reader.readLine());
        }
        numberOne=Arrays.copyOfRange(numberMain,0,10);
        numberTwo=Arrays.copyOfRange(numberMain,10,20);
        for (int i = 0; i <numberTwo.length; i++) {
            System.out.println(numberTwo[i]);
        }
    }
}







