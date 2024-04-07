import geometry.Circle;
import geometry.Point;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(1.0, 2.0);
        ColoredCircle circle = new ColoredCircle(center, 5.0, "Czerwony");
        System.out.println("Koło: " + circle);
        System.out.println("Kolor koła: " + circle.getColor());
        System.out.println("Środek koła: " + circle.getCenter());
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.getCircumference());
        System.out.println("Pole powierzchni koła: " + circle.getArea());
    }
}