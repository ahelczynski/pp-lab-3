package geometry;

public class Point {
    private double x;
    private double y;
      public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
       public static void main(String[] args) {
        Point p1 = new Point(2.0, 1.0);
        Point p2 = new Point(3.0, 6.0);
        System.out.println("Punkt p1: " + p1);
        System.out.println("Punkt p2: " + p2);
    }
}