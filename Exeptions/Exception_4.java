class Exception_4 {
    double radius;

    Exception_4(double radius) {
        this.radius = radius;
    }

    public void setRaduis(double newRaduis) throws IllegalArgumentException {
        if (newRaduis >= 0) {
            radius = newRaduis;
        } else
            throw new IllegalArgumentException("Radius can\'t be negative");

    }

    public static void methodD() {
        System.out.println("methodD() invoked");
        try {
            Exception_4 ex = new Exception_4(-1);
            ex.setRaduis(-1);

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("methodD() existed");
    }

    public static void main(String[] args) {
        System.out.println("main() invoked");
        methodD();
        System.out.println("main() existed");

    }
}
