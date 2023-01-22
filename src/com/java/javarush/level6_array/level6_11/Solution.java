package com.java.javarush.level6_array.level6_11;


/**
 * Вырезаем середину
 * <p>
 * Дан двумерный массив chars. Тебе нужно в методе main заменить все внутренние элементы на дефис (минус).
 * <p>
 * Для вывода содержимого массива на экран используй приватный метод printArray().
 * <p>
 * Пример массива:
 * a b c d e f
 * g h i j k l
 * m n o p q r
 * s t u v w x
 * <p>
 * После отработки программы массив должен содержать:
 * a b c d e f
 * g - - - - l
 * m - - - - r
 * s t u v w x
 */

public class Solution {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

    public static void main(String[] args) {
        printArray();
        int f = 1;
        int w = 1;
        for (int i = 1; i < chars.length; i++) {
            for (int a = 1; a < chars[i].length; a++) {
                if (i == 1) {
                    if (i < chars[i].length)
                        if (f < 5) {
                            chars[i][a] = '-';
                            f++;
                        }
                }
                if (i == 2) {
                    if (i < chars[i].length)
                        if (w < 5) {
                            chars[i][a] = '-';
                            w++;
                        }
                }
            }
        }
        printArray();
    }

    private static void printArray() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}






























