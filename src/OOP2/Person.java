package OOP2;

public class Person {
    private int age;
    private String fullName;

    public void move(String fullName){
        System.out.println(fullName+" говорит");
    }

    public void talk(String fullName){
        System.out.println(fullName+" говорит!!!");
    }
    public Person(){

    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
}
