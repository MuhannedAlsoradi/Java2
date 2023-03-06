
public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
        this("Black");
    }

    public String getColor() {
        return this.color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
