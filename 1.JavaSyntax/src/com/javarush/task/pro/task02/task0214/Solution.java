package com.javarush.task.pro.task02.task0214;

import java.sql.SQLOutput;
import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
       Scanner scaner = new Scanner(System.in);
       String str1 = scaner.nextLine().toLowerCase();
       String str2 = scaner.nextLine().toUpperCase();
       String str3 = scaner.nextLine();

        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);

    }
}
