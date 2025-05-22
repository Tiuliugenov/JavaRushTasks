package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = sc.nextInt();
        if (num <= 0 || num >= 5) {
                System.out.println(line);
            } else {
                int i = 0;
                do {System.out.println(line);
                    i++;
                } while (i < num);
            }
    }
}
