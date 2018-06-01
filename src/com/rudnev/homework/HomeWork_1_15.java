package com.rudnev.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HomeWork_1_15 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите катеты прямоугольного треугольника: ");
        System.out.print("1й: ");
        String a = reader.readLine();
        System.out.print("2й: ");
        String b = reader.readLine();
        double z = Double.parseDouble(a);
        double x = Double.parseDouble(b);
        int coub = 2;
        //Вычисляем гипотенузу
        double y = Math.sqrt(Math.pow(z, coub) + Math.pow(x, coub));
        //Вычисляем площадь
        double S = (z * x) / 2;
        System.out.printf("Площадь треугольника = %.2f.\n", S);
        System.out.printf("Периметр треугольника = %.2f.\n", (z + x + y));
        System.out.printf("Гипотенуза треугольника = %.2f.\n", y);
    }
}
