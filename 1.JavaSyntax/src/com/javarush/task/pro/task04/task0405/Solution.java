package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int width = 20;
        int height = 10;
        int i = 0;
        while (i<height){
            if (i==0 || i==height-1){
                int j = 0;
                while (j<width){
                    System.out.print("Б");
                    j++;
                }
            }
            else {
                System.out.print("Б");
                int j=0;
                while (j<width-2){
                    System.out.print(" ");
                    j++;
                }
                System.out.print("Б");
            }
            System.out.println();
            i++;
        }
    }
}