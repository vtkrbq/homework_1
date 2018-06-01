package com.rudnev.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_1_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите ваш вес (кг): ");
        String weight = reader.readLine();
        double w = Double.parseDouble(weight);
        System.out.println("Ваш вес на Луне будет - " + w * 0.17 + "кг.");
    }
}
