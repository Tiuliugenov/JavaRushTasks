package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double chislo = sc.nextDouble();
        double chislo2 =sc.nextDouble();
        double eps = 0.000001;
        String compare = (chislo-chislo2<=eps) && (chislo2-chislo<=eps) ?"числа равны": "числа не равны";
        System.out.println(compare);

    }
}
