import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Exeption_3 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner in = new Scanner(new File("test.in"));
        } catch (FileNotFoundException e) {
            e.getMessage();
        } finally {
            System.out.println("----");
        }

    }
}
