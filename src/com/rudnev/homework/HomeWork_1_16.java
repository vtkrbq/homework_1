package com.rudnev.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_1_16 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите температуру в Цельсиях: ");
        String tempCelsius = reader.readLine();
        double a = Double.parseDouble(tempCelsius);
        System.out.printf("Температура по Фаренгейту будет: %.3f.", ((a * 1.8) + 32));
    }
}
