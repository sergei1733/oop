package exercises8;

public class Horse extends Animal {
    private String name;
    public Horse(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }
}
