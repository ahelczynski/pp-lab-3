
import geometry.Rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Prostokąt: " + rectangle);
        System.out.println("Długość prostokąta: " + rectangle.getLength());
        System.out.println("Szerokość prostokąta: " + rectangle.getWidth());
        System.out.println("Obwód prostokąta: " + rectangle.getPerimeter());
        System.out.println("Pole powierzchni prostokąta: " + rectangle.getArea());
    }
}