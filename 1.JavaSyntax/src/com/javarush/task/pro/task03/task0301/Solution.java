package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        int t = scanner.nextInt();
        if (t<0){
            System.out.println(cold);
        }else {
            System.out.println(warm);
        }
    }
}
