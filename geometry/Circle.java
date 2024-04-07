package geometry;
public class Circle {
    private Point center;
    private double radius;
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public Point getCenter() {
        return center;
    }
    public double getRadius() {
        return radius;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Koło o środku " + center + " i promieniu " + radius;
    }
    public static void main(String[] args) {
        Point center = new Point(1.0, 2.0);
        Circle circle = new Circle(center, 5.0);
        System.out.println("Koło: " + circle);
        System.out.println("Obwód: " + circle.getCircumference());
        System.out.println("Pole powierzchni: " + circle.getArea());
    }
}