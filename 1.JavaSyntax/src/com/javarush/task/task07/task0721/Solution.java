package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        //напишите тут ваш код
        int[] num = new int[20];


        for (int i = 0; i < num.length; i++)
            num[i] = Integer.parseInt(reader.readLine());

        int maximum = num[0];
        int minimum = num[0];

        for (int i = 0; i < num.length; i++){

            if (num[i] > maximum)
                maximum = num[i];
            if (num[i] < minimum)
                minimum = num[i];
        }

//        System.out.println(maximum + " " + minimum);

        System.out.print(maximum);
        System.out.print(" " + minimum);
    }
}
