import java.util.InputMismatchException;
import java.util.Scanner;

class Exception {
    public static void main(String[] args) {
        int x, y;
        Scanner s = new Scanner(System.in);


        try {
        x = s.nextInt();
        y = s.nextInt();
        System.out.println(x/y);
        } catch (ArithmeticException e) {
        System.out.println("ArthemticException occurred");
        } catch(InputMismatchException w){
            System.out.println("InputMismatchException Exception occurred");
        }

    }
}
