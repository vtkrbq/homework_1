package com.rudnev.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_1_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 1;
        double[] array;
        array = new double[10];
        //заполняем массив случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = (a + (int)(Math.random() * 10));
            System.out.print(array[i] + " | ");
        }
        //увеличиваем заданный элемент на 10%
        System.out.println();
        System.out.print("Введите число от 0 до 10, порядковый номер элемента которого, Вы хотите увеличить: ");
        String num = reader.readLine();
        int x = Integer.parseInt(num);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[x]){
                array[i] += (array[i] * 0.10);
                break;
            }
        }
        //выводим результат
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }
}
