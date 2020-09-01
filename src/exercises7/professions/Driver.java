package exercises7.professions;

public class Driver extends Person {

    public int experiece;

    public Driver(String fio, int experiece) {
        this.fio = fio;
        this.experiece = experiece;
    }

    @Override
    public String toString() {
        return this.fio;
    }
}
