package exercises6;

public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[5];

        Aspirant person1 = new Aspirant("Bob","Иванов","60-p",4.3,true);
    Aspirant person2 = new Aspirant("Иван","петров","60-p",5,true);
    Student person3 = new Student("Евгений","Семенов","60-p",5);

        for (int i = 0; i < student.length; i++) {
            student[i] = new Student("Евгений","Семенов","60-p",5);
        }
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getScholarship(student[i].averageMark));
        }

    }
}
