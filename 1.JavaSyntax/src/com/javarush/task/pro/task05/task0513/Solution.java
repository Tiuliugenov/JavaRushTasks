package com.javarush.task.pro.task05.task0513;

import java.util.Arrays;

/* 
Выводим массивы
*/

public class Solution {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
       String strings2 = Arrays.toString(strings);
       String ints2 = Arrays.toString(ints);
        System.out.println(strings2);
        System.out.println(ints2);
    }
}
