class Circle extends Shape {
    Circle(String color) {
        super(color);
    }

    @Override
    void getPerimeter() {
        System.out.println("getPerimeter() invoked");

    }

    @Override
    public void getArea() {
        System.out.println("getArea() invoked");
    }

    @Override
    public void getSides() {
        System.out.println("getSides() invoked");

    }
}
