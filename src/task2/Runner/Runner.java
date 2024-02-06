package task2.Runner;

import task2.Class.Circle;
import task2.Class.Rectangle;
import task2.Class.Triangle;
import task2.Figure;


import java.util.Random;

public class Runner {

    public static void main(String[] args) {
        Random random = new Random();
        Circle circle = new Circle(random.nextInt(1, 20));
        Rectangle rectangle = new Rectangle(random.nextInt(1, 20), random.nextInt(1, 20));
        Triangle triangle = new Triangle(random.nextInt(1, 20), random.nextInt(1, 20));
        Circle circle1 = new Circle(random.nextInt(1, 20));
        Rectangle rectangle1 = new Rectangle(random.nextInt(1, 20), random.nextInt(1, 20));

        Figure[] figures = new Figure[5];
        figures[0] = circle;
        figures[1] = rectangle;
        figures[2] = triangle;
        figures[3] = circle1;
        figures[4] = rectangle1;

        for (Figure figure : figures) {
            System.out.println(figure.figure + "\narea: " + figure.area() + "\nperimeter" + figure.perimeter());
            System.out.println();
        }

        double perimeter=0;
        for (Figure figure : figures) {
            perimeter += figure.perimeter();
        }
        System.out.println("All perimeter="+perimeter);
    }
}


