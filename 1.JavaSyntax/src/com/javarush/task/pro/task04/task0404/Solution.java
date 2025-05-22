package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
      String letter = "Q";
      int height = 5;
      int width = 10;
      int a = 0;
        String b = letter;
while (a<height){
    int j = 0;
          while (j<width){
              System.out.print(letter);
              j++;
          }
    System.out.println();
    a++;
   }
    }
}