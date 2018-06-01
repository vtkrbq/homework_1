package com.rudnev.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_1_14 {
    public static double ExchangeForDollar (double a, double b) {
        return a / b;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество гривен: ");
        String count = reader.readLine();
        System.out.print("Введите курс гривны к доллару: ");
        String exchange = reader.readLine();
        double a = Double.parseDouble(count);
        double b = Double.parseDouble(exchange);
        System.out.println("Полученные доллары: " + ExchangeForDollar(a, b) + ".");
    }
}
