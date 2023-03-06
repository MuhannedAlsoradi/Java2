import java.util.ArrayList;
import java.util.ListIterator;

class ListIteratorTest2 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Omar");
        myList.add("Ahmed ali");
        ListIterator<String> iterator = myList.listIterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.length() < 4) {
                iterator.remove();
            }
        }
        System.out.println(myList);
    }
}
