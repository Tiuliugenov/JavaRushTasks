package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner sc = new Scanner(System.in);
        Boolean bool = sc.nextBoolean();
        if (bool) {
            glass = Math.ceil(glass);
        } else {
            glass = Math.floor(glass);
        }
        System.out.println((int) (glass));


    }
}