package com.java.javarush.level3.level3_0;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summ=0;
        int scanInt;
        while (true){
            scanInt=Integer.parseInt(reader.readLine());
            if (scanInt!=-1){
                summ=summ+scanInt;
            }
            if (scanInt==-1){
                summ=summ+scanInt;
                System.out.println(summ);
                break;
            }
        }
        //напишите тут ваш код

    }
}