import java.util.*;

class ListIteratorTest1{
    public static void main(String args[]) {
        List<String> myList = new ArrayList<String>();
        myList.add("Rami");
        myList.add("Ali");
        myList.add("Wesam");
        myList.add("Tammer");
        System.out.println(myList);
        ListIterator<String> listIter = myList.listIterator();
        if (listIter.hasNext()) {
            String name = listIter.next();
            System.out.println(name);
            listIter.add("Hala");
            System.out.println(listIter.previous());
            listIter.remove();
            System.out.println(myList);
        }
        System.out.println(myList);
    }
}
