public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return Math.round(height * width);

    }

    public double getPerimeter() {
        return Math.round(2.0 * (height + width));
    }

    public int compareTo(Object o) {

        return (int) (this.height - ((Rectangle) o).height);

    }
}
