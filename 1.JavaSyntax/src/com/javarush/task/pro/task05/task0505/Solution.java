package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            if (n % 2 == 0) {
            for (int i = n-1; i >=0; i--) {
                    System.out.println(arr[i]);
                }
            }
            else {
                // нечётное — выводим в прямом порядке
            for (int i = 0; i <n; i++) {
                System.out.println(arr[i]);
                }
            }
        }
    }
}

