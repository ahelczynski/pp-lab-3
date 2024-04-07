

import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(1.0, 2.0);
        Circle circle = new Circle(center, 5.0);
        System.out.println("Środek koła: " + circle.getCenter());
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.getCircumference());
        System.out.println("Pole powierzchni koła: " + circle.getArea());
    }
}