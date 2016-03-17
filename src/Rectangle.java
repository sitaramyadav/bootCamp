/*
Job of Rectangle is to calculate any quantity of Rectangle using length and breadth
    or length or breadth.
 */

public class Rectangle {

    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length *breadth;
    }

    public double calculatePerimeter() {
        return 2*(length + breadth);
    }
}
    