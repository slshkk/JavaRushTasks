package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++){
            list.add(Integer.parseInt(reader.readLine()));

        }
        for (int i : list){
            if (i % 3 == 0 && i % 2 ==0){
                list3.add(i);
                list2.add(i);
            }
            else if (i % 3 == 0){
                list3.add(i);
            }
            else if (i % 2 ==0){
                list2.add(i);
            }
            else {
                list1.add(i);
            }
        }

        printList(list3);
        printList(list2);
        printList(list1);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer x : list)
            System.out.println(x);
    }
}
