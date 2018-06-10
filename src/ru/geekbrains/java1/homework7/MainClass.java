package ru.geekbrains.java1.homework7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", 20);
        Plate plate1 = new Plate(200);

        cat1.info();
        plate1.info();
        cat1.eat(plate1);
        System.out.print("Кот поел. ");
        plate1.info();
        plate1.addFood(70);
        plate1.info();
    }
}