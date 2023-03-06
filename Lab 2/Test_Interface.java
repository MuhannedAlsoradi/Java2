public class Test_Interface {
    public static void main(String[] args) {
        Circle c = new Circle("Red");
        System.out.println("\n=================================================================\n");
        System.out.println(c.color);
        c.getArea();
        c.getPerimeter();
        c.getSides();
        System.out.println("\n=================================================================\n");
    }
}
