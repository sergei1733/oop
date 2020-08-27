package oop8;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("мясо","лес","Гера");
        Cat cat1 = new Cat("мыши", "дом", "Моника");
        Veterinarian veterinarian = new Veterinarian("Михаил");
        dog1.makeNoise();
        dog1.eat(dog1);
        dog1.sleep(dog1);
        veterinarian.treatAnimal(dog1);
        cat1.makeNoise(cat1);
    }
}
