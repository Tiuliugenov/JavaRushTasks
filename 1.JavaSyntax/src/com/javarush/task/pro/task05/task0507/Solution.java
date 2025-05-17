package com.javarush.task.pro.task05.task0507;

import java.util.Arrays;
import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numberN = sc.nextInt();
        array = new int[numberN];
        for (int i = 0; i < numberN; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < numberN; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);
//        Arrays.sort(array);
//        System.out.println(array[array.length-1]);
    }
}
