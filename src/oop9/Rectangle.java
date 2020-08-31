package oop9;
import java.awt.*;
public class Rectangle extends Shape{
    private Integer x,y,a,b;

    public Rectangle(Integer x, Integer y, Integer a, Integer b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw(Color colour) {
        System.out.println("нарисовал прямоугольник");
    }

    @Override
    public String toString() {
        return "это прямоугольник";
    }
}
