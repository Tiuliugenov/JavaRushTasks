package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int middle;
        if (array.length % 2 == 0) {
            middle = array.length / 2;
        } else {
            middle = array.length / 2 + 1;

        }
        result[0] = Arrays.copyOfRange(array, 0, middle);
        result[1] = Arrays.copyOfRange(array, middle, array.length);

        System.out.println(Arrays.deepToString(result));
    }
}
