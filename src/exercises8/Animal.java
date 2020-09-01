package exercises8;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(Animal animal) {
        System.out.println(animal + " шумит");
    }
    public  void eat(Animal animal){
        System.out.println(animal+ " ест "+this.food);
    }
    public void sleep(Animal animal){
        System.out.println(animal + " спит в "+this.location);
    }

    @Override
    public String toString() {
        return  food + " " + location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
