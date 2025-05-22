package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String chislo = sc.nextLine();
            if (chislo.equals("ENTER")) {
                System.out.println(sum);
                break;
            }
            if (chislo.matches("-?\\d+")) {
                sum += Integer.parseInt(chislo);
            }
            }
        }
    }