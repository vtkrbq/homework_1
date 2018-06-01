package com.rudnev.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_1_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество суток: ");
        String count = reader.readLine();
        int a = Integer.parseInt(count);
        System.out.println("Количество часов в " + a + " сутках = " + a * 24 + ".");
        System.out.println("Количество минут в " + a + " сутках = " + a * 24 * 60 + ".");
        System.out.println("Количество секунд в " + a + " сутках = " + a * 24 * 60 * 60 + ".");
    }
}
