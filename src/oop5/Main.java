package oop5;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
    int a,b;
    a = in.nextInt();
    b = in.nextInt();
        numbers(a, b);
    }
    private static void numbers(int a, int b){
        if (a<=b) {
            System.out.print(a + " ");
            if (a != b)
                numbers(a + 1, b);
            if (a==b) return;
        }

       if (b<a) {
            System.out.print(b + " ");
            if (b != a)
                numbers(a, b + 1);
            if (a==b) return;
        }
    }
}
