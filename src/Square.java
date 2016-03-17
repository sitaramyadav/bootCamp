/*
Job of Square is to calculate any quantity of Square using length and breadth
    or length or breadth.
 */
public class Square {
    private double side;

    private Square(double side) {
        this.side = side;
    }

    public static Square createSquare(double side) {
        if(side <= 0)
            throw new IllegalArgumentException("Non positive input is provided side: "+side+" while creating square");
        return new Square(side);
    }

    public double calculateArea() {
        return this.side*this.side;
    }

    public double calculatePerimeter() {
        return 4*this.side;
    }
}
