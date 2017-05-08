package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("man1", 20, "add1");
        Man man2 = new Man("man2", 21, "add2");
        Woman woman1 = new Woman("woman1", 22, "add3");
        Woman woman2 = new Woman("woman2", 23, "add4");
        System.out.println(man1.name +" "+ man1.age +" "+ man1.address);
        System.out.println(man2.name +" "+ man2.age +" "+ man2.address);
        System.out.println(woman1.name +" "+ woman1.age +" "+ woman1.address);
        System.out.println(woman2.name +" "+ woman2.age +" "+ woman2.address);

    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    //напишите тут ваш код
}
