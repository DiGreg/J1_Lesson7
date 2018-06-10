package ru.geekbrains.java1.homework7;
//КОТ:
public class Cat {
    private String name;
    private int appetite; //аппетит кота
    //Конструктор:
    public Cat(String _name, int _appetite) {
        name = _name;
        appetite = _appetite;
    }

    public void info(){
        System.out.println("Кот " + name + ". Аппетит: " + appetite + " грамм");
    }
    //метод есть из тарелки в соответствии с аппетитом кота:
    public void eat (Plate plateObject) {
       plateObject.decreaseFood(appetite);
    }

}
