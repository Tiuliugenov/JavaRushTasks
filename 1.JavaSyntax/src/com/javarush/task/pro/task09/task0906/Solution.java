package com.javarush.task.pro.task09.task0906;

import java.util.Map;
import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
        String binaryNumber = "";
        while (decimalNumber != 0) {
            binaryNumber = decimalNumber % 2 + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return 0;
        }

        int binarynumber = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - i - 1;
            char charAt = binaryNumber.charAt(index);
            binarynumber = binarynumber + Integer.parseInt(String.valueOf(charAt)) * (int) Math.pow(2, i);
        }
        return binarynumber;
    }
}
