public class Rectangle {

    private final Double length;
    private final Double breadth;

    public Rectangle(Double length, Double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Double getArea() {
        return length *breadth;
    }

    public Double getPerimeter() {
        return 2*(length + breadth);
    }
}
    