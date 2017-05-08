package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] sarray = new String[10];
        int[] iarray = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < sarray.length; i++) {
            sarray[i] = reader.readLine();
            iarray[i] = sarray[i].length();

        }
        for (int num : iarray)
            System.out.println(num);
    }
}
