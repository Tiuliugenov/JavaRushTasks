package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
       int max = Integer.MAX_VALUE;
        int secondMin =Integer.MAX_VALUE;
       Scanner sc = new Scanner(System.in);
       int count=0;
       while (sc.hasNextInt()){
           int m = sc.nextInt();
           if (m<max){
               secondMin=max;
               max=m;
           }
           if (m<secondMin && m!=max){
           secondMin=m;}
           count++;
       }
       if (count>=2)
        System.out.println(secondMin);
    }
}