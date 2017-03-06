package head.fiest.java;

/**
 * Created by Александр on 06.03.2017.
 */
public class Dog {

    // Определяем переменные
    int size;
    String name;
    String breed;
    String color;

    // Метод описание собаки
    public void describeDog(){
        System.out.println("Имя: " + name);
        System.out.println("Порода: " + breed);
        System.out.println("Выстота в холке: " + size + " см.");
        System.out.println("Цвет: " + color);
        System.out.println("Гав - гав!");

    }


}
