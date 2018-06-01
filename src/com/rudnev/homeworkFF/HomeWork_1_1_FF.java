package com.rudnev.homeworkFF;

import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HomeWork_1_1_FF {
    private static int calculateNumberOfCombinations (int sum, int... members){
        if(members.length == 0) {
            if(sum == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        int currentMember = members[0];
        int count = 0;
        int i=0;
        while (i * currentMember <= sum) {
            int[] innerMembers = Arrays.copyOfRange(members, 1, members.length);
            count += calculateNumberOfCombinations(sum - currentMember * i, innerMembers);
            i++;
        }
        return count;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите 1-е число: ");
        String a = reader.readLine();
        System.out.print("Введите 2-е число: ");
        String b = reader.readLine();
        System.out.print("Введите 3-е число: ");
        String c = reader.readLine();
        System.out.print("Введите 4-е число: ");
        String d = reader.readLine();

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);
        int W = Integer.parseInt(d);
        System.out.println(calculateNumberOfCombinations(W, x, y, z));
    }
}
