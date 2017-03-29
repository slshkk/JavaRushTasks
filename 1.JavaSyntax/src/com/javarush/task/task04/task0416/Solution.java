package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        if ((t % 5.0D >= 0.0D) && (t % 5.0D < 3.0D)) {
            System.out.println("зелёный");
        }
        if ((t % 5.0D < 4.0D) && (t % 5.0D >= 3.0D)) {
            System.out.println("желтый");
        }
        if ((t % 5.0D < 5.0D) && (t % 5.0D >= 4.0D)) {
            System.out.println("красный");
        }
    }
}