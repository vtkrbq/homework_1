package com.rudnev.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_1_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean t = true;

        while (t) {
            //вводим число с клавиатуры
            System.out.print("Введите вещественное число с не нулевой дробной частью: ");
            String a1 = reader.readLine();
            double n = Double.parseDouble(a1);
            //разбивает на целую и дробную части
            int a = (int)n; //целая часть
            double b = n - a; //дробная часть
            //проверяем на правильность ввода
            if (b == 0)
                System.out.println("Вы ввели неверное число, пожалуйста повторите ввод.");
            //определяем в какую сторону округлять и выводим на экран результат
            else if (b < 0.5) {
                System.out.println(b);
                System.out.println("Число " + n + " округлится до " + Math.floor(n));
                break;
            }
                else {
                    System.out.println("Число " + n + " округлится до " + Math.ceil(n));
                    break;
                }
            }
        }
    }
