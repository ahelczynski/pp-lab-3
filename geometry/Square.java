package geometry;

public class Square extends Rectangle {

    public Square(double sideLength) {
        super(sideLength, sideLength);
    }
    public static void main(String[] args) {
        Square square = new Square(5.0);

        System.out.println("Kwadrat: " + square);
        System.out.println("Długość boku kwadratu: " + square.getLength());
        System.out.println("Obwód kwadratu: " + square.getPerimeter());
        System.out.println("Pole powierzchni kwadratu: " + square.getArea());
    }
}