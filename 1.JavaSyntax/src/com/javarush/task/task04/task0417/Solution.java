package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a == b && b == c){
            System.out.println(a + " " + b + " " + c);
        }
        if ( a == b) {
            System.out.println(a + " " + b);
        }
        if (b == c) {
            System.out.println(b + " " + c);
        }
        if (a == c) {
            System.out.println(a + " " + c);
        }
    }
}