package task2.Class;

import task2.Figure;

public class Rectangle extends Figure {

    /**
     * rectangle class with the "side_a", "side_b" parameters
     */

    int side_a;
    int side_b;

    public Rectangle(int side_a, int side_b){
        this.figure="Rectangle";
        this.side_a=side_a;
        this.side_b=side_b;
    }
    @Override
    public double area() {
        return side_a*side_b;
    }

    @Override
    public double perimeter() {
        return 2*side_a+2*side_b;
    }
}
