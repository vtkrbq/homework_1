package com.rudnev.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_1_4 {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            boolean t = true;

            while (t) {
                //вводим число с клавиатуры
                System.out.print("Введите трехзначное число: ");
                String a1 = reader.readLine();
                int n = Integer.parseInt(a1);
                int sum = 0;
                //проверяем на правильность ввода
                if (n < 100 || n > 999)
                    System.out.println("Вы ввели неверное число, пожалуйста, повторите ввод.");
                else {
                    while(n != 0){
                        //Суммирование цифр числа
                        sum += (n % 10);
                        n/=10;
                    }
                    System.out.println("Сумма цифр данного числа = " + sum + ".");
                    break;
                }
            }
        }
    }
