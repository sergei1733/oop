package OOP3;

public class Main {
    public static void main(String[] args) {
        Matrix p1 = new Matrix(3,3);
        p1.zapolnenieMass();
        p1.printRealNumbers();

        p1.multiplicationByNumber(2);
        p1.printRealNumbers();

        Matrix p2 = new Matrix(3,3);
        p2.zapolnenieMass();

        p1.matrixAddition(p2);
    }
}
