package com.java.javarush.level6_array.level6_3;


import java.util.Arrays;

/**
Сортировка массива
 Реализуй метод main(String[]), который сортирует массив array по возрастанию.
 Для сортировки массива используй метод Arrays.sort(int[]).
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        //напишите тут ваш код
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}







