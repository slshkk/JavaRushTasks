package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name)
    {
        this.name = name;
        this.weight = 2;
        this.age = 1;
        this.color = "grey";
    }

    public void initialize(String name,int weight, int age)
    {
        this.name = name;
        this.weight = weight == 0 ? 2 : weight;
        this.age = age == 0 ? 1 : age;
        this.color = "grey";
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age == 0 ? 1 : age;
        this.weight = 2;
        this.color = "grey";
    }

    public void initialize(int weight, String color)
    {
        this.weight = weight == 0 ? 2 : weight;
        this.color = color == null ? "grey" : color;
        this.age = 1;
    }

    public void initialize(int weight, String color, String address)
    {
        this.age = 1;
        this.weight = weight == 0 ? 2 : weight;
        this.color = color == null ? "grey" : color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
