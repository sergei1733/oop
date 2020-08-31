package oop9;

import java.awt.*;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return x.equals(circle.x) &&
                y.equals(circle.y) &&
                r.equals(circle.r);
    }
}
