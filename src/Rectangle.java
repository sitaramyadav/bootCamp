public class Rectangle {

    private final Numbers length;
    private final Numbers breadth;

    public Rectangle(Numbers length, Numbers breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length.multiplyWith(breadth);
    }

    public int getPerimeter() {
        return 2*(length.add(breadth));
    }
}
    