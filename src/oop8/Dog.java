package oop8;

public class Dog extends Animal {
    private String name;
    public Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
    public void makeNoise() {
        System.out.println(this.name + " шумит !");
    }

}
