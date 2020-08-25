package oop6;

public class Aspirant extends Student{
    private boolean scientificWork;
    public Aspirant(String firstName, String lastName, String group, double averageMark, boolean scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }
    public int getScholarship(double averageMark){
        if (averageMark == 5) return 200;
        else
            return 180;
    }
}
