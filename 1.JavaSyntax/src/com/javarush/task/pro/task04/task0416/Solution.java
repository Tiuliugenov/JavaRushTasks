package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int banki = sc.nextInt();
        int people = sc.nextInt();
        double a = (double) ((banki)/(double)(people));
        System.out.println(a);
    }
}