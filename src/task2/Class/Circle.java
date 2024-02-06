package task2.Class;

import task2.Figure;

/**
 * circle class with the "radius" parameter
 */

public class Circle extends Figure {

    public int radius;

    public Circle(int radius){
        this.figure="circle";
        this.radius=radius;
    }


    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    @Override
    public double perimeter() {
        return radius*2*Math.PI;
    }
}
