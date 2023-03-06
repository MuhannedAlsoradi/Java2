import java.util.*;

class CollectionExample {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<String>();
        col = new TreeSet<String>();
        col.add("Rami");
        col.add("Ali");
        col.add("Wesam");
        col.add("Rami"); // can't added
        col.remove("Khalid"); // false
        String s = col.toString();
        boolean b = col.remove("Ali");
        b = col.contains("Wesam");
        System.out.println("--------------------");
        System.out.println(s);
        System.out.println("--------------------");
        System.out.println(col);
        System.out.println("--------------------");
        System.out.println(b);
    }
}