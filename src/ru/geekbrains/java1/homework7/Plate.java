package ru.geekbrains.java1.homework7;
//ТАРЕЛКА:
public class Plate {
    private int foodInPlate;

    public Plate(int _foodInPlate){
        foodInPlate = _foodInPlate;
    }
    //метод уменьшения еды в тарелке:
    public void decreaseFood(int appetite){
        foodInPlate -= appetite;
    }
    //метод добавления еды в тарелку:
    public void addFood (int additiveFood) {
        foodInPlate += additiveFood;
    }

    public void info(){
        System.out.println("Количество еды в тарелке: " + foodInPlate);
    }
}
