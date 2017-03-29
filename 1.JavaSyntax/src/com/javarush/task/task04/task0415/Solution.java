package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input numbers:");
        String a1 = br.readLine();
        int a = Integer.parseInt(a1);
        String b1 = br.readLine();
        int b = Integer.parseInt(b1);
        String c1 = br.readLine();
        int c = Integer.parseInt(c1);

        if (a < b+c && b < c+a && c < a+b){
            System.out.println("Треугольник существует.");
        }else {
            System.out.println("Треугольник не существует.");
        }
        //напишите тут ваш код
    }
}