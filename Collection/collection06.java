import java.util.*;

class collection06 {
    public static void printAll(Collection<?> coll) {
        Iterator<?> iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");
        collection1.add("New York");
        printAll(collection1);
    }
}
