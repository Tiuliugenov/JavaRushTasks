package com.javarush.task.pro.task02.task0215;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chislo1= scanner.nextInt();
        int chislo2 = scanner.nextInt();
        int chislo3 = scanner.nextInt();
        System.out.println((chislo1+chislo2+chislo3)/3);


    }
}
