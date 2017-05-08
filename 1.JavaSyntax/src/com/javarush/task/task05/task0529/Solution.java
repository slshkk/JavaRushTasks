package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (;true;){
            String string = bufferedReader.readLine();
            if (string.equals("сумма")) break;
            sum+=Integer.parseInt(string);
        }
        System.out.println(sum);
    }
}
