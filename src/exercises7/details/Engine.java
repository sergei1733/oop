package exercises7.details;

public class Engine {
    private String company;
    private int power;


    public Engine(String company, int power) {

        this.company = company;
        this.power = power;
    }

    @Override
    public String toString() {
        return  this.company +" "+this.power ;
    }
}
