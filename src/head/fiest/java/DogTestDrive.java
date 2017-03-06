package head.fiest.java;

public class DogTestDrive {

    public static void main(String[] args) {
	// Создаем объект собака
        Dog d = new Dog();
        d.breed = "Немецкий Дог";
        d.name = "Лада";
        d.size = 90;
        d.color = "Черный";
        d.describeDog();
    }
}
