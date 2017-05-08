package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        double sum = 0;

        for (;true;){
            int num = Integer.parseInt(bufferedReader.readLine());
            if (num == -1) break;
            sum+=num;
            count++;
        }
        System.out.println(sum/count);
    }
}

