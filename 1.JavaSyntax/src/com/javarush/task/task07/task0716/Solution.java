package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list.add("жопа"); //3
        list.add("лара"); //4
        list.add("лажа"); //5
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> fixList = new ArrayList<>();

        for (String s : list) {
            if (s.contains("л") && s.contains("р")) {
                fixList.add(s);
                continue;
            }
            if (s.contains("л")) {
                fixList.add(s);
                fixList.add(s);
                continue;
            }
            if (s.contains("р"))
                continue;
            fixList.add(s);
        }

        return fixList;
    }
}