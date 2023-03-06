class Exeption_2 {
    public static void main(String[] args) {
        System.out.println("main() invoked");
        methodA();
        System.out.println("---");
    }

    public static void methodA() {
        System.out.println("methodA() invoked");
        methodB();
        System.out.println("---");
    }

    public static void methodB() {
        System.out.println("methodB() invoked");
        methodC();
        System.out.println("---");
    }

    public static void methodC() {
        System.out.println("methodC() invoked");
        int m = 1 / 0;
        System.out.println(m);
    }
}
