package ru.clevertec.utils;

import java.util.Scanner;

public class StringUtils {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, please: ");
        System.out.println("isPositiveNumber: " + isPositiveNumber(scanner.nextLine()));
    }

    public static boolean isPositiveNumber(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str) && Integer.parseInt(str) > 0;
    }

}
