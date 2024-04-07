package geometry;

public class ColoredCircle extends Circle {
    private String color;
    public ColoredCircle(Point center, double radius, String color) {
        super(center, radius);
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Koło o kolorze " + color + " " + super.toString();
    }
    public static void main(String[] args) {
        Point center = new Point(1.0, 2.0);
        ColoredCircle circle = new ColoredCircle(center, 5.0, "Czerwony");
        System.out.println("Koło: " + circle);
        System.out.println("Kolor koła: " + circle.getColor());
    }
}