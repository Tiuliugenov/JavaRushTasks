package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c)
            System.out.println(a + " " + b + " " + c);
      else if (a == b && b!= c)
                System.out.println((a + " " + b));
             else if (a == c && b != c)
                System.out.println(a + " " + c);
             else if (c == b && b != a)
                System.out.println((c + " " + b));

            }
        }

