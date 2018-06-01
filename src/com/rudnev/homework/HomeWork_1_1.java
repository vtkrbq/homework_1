package com.rudnev.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //вводим числа с клавиатуры
        System.out.print("Введите 1-е число: ");
        String b1 = reader.readLine();
        System.out.print("Введите 2-е число: ");
        String b2 = reader.readLine();
        int q = Integer.parseInt(b1);
        int w = Integer.parseInt(b2);
        //Вычисляем результат деления двух чисел и выводим на экран
        int c = q / w;
        System.out.println("Первое число можно поделить на второе " + Math.abs(c) + " раз(а).");
        //Выводим на экран остаток от деления
        System.out.println("Остаток будет равен " + q % w + ".");
    }
}
