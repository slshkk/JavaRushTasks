package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < 5; i++){
            arrayList.add(reader.readLine());
            if (arrayList.get(i).length() > max)
                max = arrayList.get(i).length();
        }

        for (String x : arrayList){
            if (x.length() == max)
                System.out.println(x);
        }
    }
}
