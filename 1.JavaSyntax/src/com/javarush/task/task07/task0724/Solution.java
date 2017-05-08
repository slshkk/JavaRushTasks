package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human Olya = new Human("Оля", true, 20);
        Human Tanya = new Human("Оля", false, 19);
        Human Yana = new Human("Оля", true, 18);
        Human Dasha = new Human("Оля", false, 17);
        Human Katya = new Human("Katya", true, 16, Dasha, Olya);
        Human Lida = new Human("Lida", false, 16, Tanya, Yana);
        Human Anya = new Human("Anya", true, 16, Dasha, Olya);
        Human Sveta = new Human("Sveta", false, 16, Tanya, Yana);
        Human Masha = new Human("Masha", true, 16, Dasha, Olya);

        System.out.println(Olya.toString());
        System.out.println(Tanya.toString());
        System.out.println(Yana.toString());
        System.out.println(Dasha.toString());
        System.out.println(Katya.toString());
        System.out.println(Lida.toString());
        System.out.println(Anya.toString());
        System.out.println(Sveta.toString());
        System.out.println(Masha.toString());
    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















