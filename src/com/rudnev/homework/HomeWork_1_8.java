package com.rudnev.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_1_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите целое число: ");
        String num = reader.readLine();
        int a = Integer.parseInt(num);
        if ((a % 2) == 0)
            System.out.println("Число " + a + " четное.");
        else
            System.out.println("Число " + a + " нечетное.");
        }
    }
