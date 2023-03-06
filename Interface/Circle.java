public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    public double getPerimeter() {
        return Math.round(Math.PI * 2 * radius);
    }

    public int compareTo(Object o) {

        return (int) (this.radius - ((Circle) o).radius);

    }
}
