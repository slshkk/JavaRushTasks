package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String > hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++)
            hashMap.put("sname" + i, "name" + i);
        return hashMap;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (HashMap.Entry<String, String> m : map.entrySet()){
            if (m.getValue().equals(name))
                count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (HashMap.Entry<String, String> m : map.entrySet()){
            if (m.getKey().equals(lastName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
