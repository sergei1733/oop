package oop9;

import java.awt.*;

public class Circle extends Shape{
    private Integer x,y,r;

    public Circle(Integer x, Integer y, Integer r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw(Color colour) {
        System.out.println("нарисовал круг");
    }

    @Override
    public String toString() {
        return "это круг";
    }
}
