import java.util.*;

class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Ali");
        list.addLast("Rami");
        list.addFirst("Tamer");
        System.out.println("--------------");
        System.out.println(list);
        String name1 = list.getFirst();
        String name2 = list.getLast();
        System.out.println("--------------");
        System.out.println(name1 + " " + name2);
        name1 = list.removeFirst();
        name2 = list.removeLast();
        System.out.println("--------------");
        System.out.println(list);
    }
}
