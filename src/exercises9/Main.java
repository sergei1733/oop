package exercises9;
/*
Создайте суперкласс Shape и его наследники Circle, Rectangle.
Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры.
В цикле нарисовать их (вызвать метод draw).
Добавить метод equals() для классов Shape, Circle, Rectangle.
 */

import java.awt.*;
import java.util.Scanner;


public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Shape[] shape = new Shape[4];
        Color colour;
        for (int i = 0; i < shape.length-1; i+=2) {
            Circle p  = new Circle(1,1,1);
            Rectangle d  = new Rectangle(1,1,1,5);
            shape[i] = p;
            shape[i+1] = d;
        }
        colour = Color.blue;
        for (int i = 0; i < shape.length; i++) {
            shape[i].draw(colour);
        }

    }
}
