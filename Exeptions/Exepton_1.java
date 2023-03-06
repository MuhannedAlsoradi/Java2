class Exeption_1 {
    public static void main(String[] args) {
        try {
            int x = 5, m, y = 1;
            m = x / y;
            int arr[] = { 1, 2, 3, 4 };
            arr[8] = 9;
            System.out.println(m);
        } catch (ArithmeticException e) {
            System.out.println("--------------");
            e.getMessage();
            System.out.println(e.toString());
        } catch (RuntimeException e2) {
            e2.getMessage();
            System.out.println(e2);
        } finally {
            System.out.println("Hello finally");
        }

    }
}