import geometry.Circle;
import geometry.Point;
import geometry.ColoredCircle;

public class Main {

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(1.0, 2.0), 5.0);
        circles[1] = new ColoredCircle(new Point(3.0, 4.0), 6.0, "Czerwony");
        circles[2] = new Circle(new Point(5.0, 6.0), 7.0);
        for (Circle circle : circles) {
            System.out.println("Pole powierzchni koła: " + circle.getArea());
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor koła: " + coloredCircle.getColor());
            }
        }
    }
}