package com.rudnev.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_1_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        String num1 = reader.readLine();
        System.out.print("Введите второе число: ");
        String num2 = reader.readLine();
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        if (a > b && a != b)
            System.out.println(a + " > " + b + ".");
        else if (b > a && b != a)
            System.out.println(a + " < " + b + ".");
        else
            System.out.println(a + " = " + b + ".");
    }
}
