package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList();
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("r");
        list.add("t");
        System.out.println(list.size());
        for (String l : list)
            System.out.println(l);
    }
}
