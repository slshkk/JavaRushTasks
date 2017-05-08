package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++){
            set.add(5 + i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        HashSet<Integer> set1 = new HashSet<>();
        set1.addAll(set);

        for (Integer i : set1){
            if (i > 10)
                set.remove(i);
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
