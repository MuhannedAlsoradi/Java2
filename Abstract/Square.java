
public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;

    }

    public double getPerimeter() {
        return 4 * side;
    }
}
