package com.rudnev.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_1_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите вещественное число: ");
        String num = reader.readLine();
        double a = Double.parseDouble(num);
        int b = (int)a;
        double c = a - b;
        if (c == 0)
            System.out.println("Число " + a + " целое.");
        else
            System.out.println("Число " + a + " дробное.");
    }
}
