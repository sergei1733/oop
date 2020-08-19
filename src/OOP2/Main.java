package OOP2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Игорь",50);

        p1.move("Vova");
        p2.talk("Inna");
    }
}