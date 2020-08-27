package oop8;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public void treatAnimal(Animal animal){
        System.out.println(animal.getFood()+" "+animal.getLocation());
    }
}
