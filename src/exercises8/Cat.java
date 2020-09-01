package exercises8;

public class Cat extends Animal {
    private String name;
    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
