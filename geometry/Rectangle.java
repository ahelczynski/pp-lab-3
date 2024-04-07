package geometry;

public class Rectangle {

    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
    public double getArea() {
        return length * width;
    }
    public boolean contains(Point point) {
        return point.getX() >= 0 && point.getX() <= length &&
                point.getY() >= 0 && point.getY() <= width;
    }
    @Override
    public String toString() {
        return "Prostokąt o długości " + length + " i szerokości " + width;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        System.out.println("Prostokąt: " + rectangle);
        System.out.println("Obwód prostokąta: " + rectangle.getPerimeter());
        System.out.println("Pole powierzchni prostokąta: " + rectangle.getArea());

        Point point = new Point(2.0, 1.5);
        System.out.println("Czy punkt " + point + " znajduje się wewnątrz prostokąta? " + rectangle.contains(point));
    }
}