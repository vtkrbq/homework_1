package com.rudnev.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_1_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите расстояние до места назначения (км): ");
        String distance = reader.readLine();
        System.out.print("Введите время, за которое Вам нужно туда добраться (ч): ");
        String time = reader.readLine();
        double n = Double.parseDouble(distance);
        double t = Double.parseDouble(time);
        double V = n / t;
        System.out.println("Скорость, с которой Вам нужно ехать: " + V + "км/час.");
    }
}
