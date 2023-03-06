import java.util.*;

class CollectionBulkOperation {
    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();
        firstList.add("Ali");
        secondList.add("Ahmed");
        secondList.add("Ali");
        System.out.println(secondList.addAll(firstList));
        System.out.println(firstList);
        System.out.println(secondList);
        System.out.println(secondList.retainAll(firstList));
        System.out.println(secondList);
        System.out.println(firstList.removeAll(secondList));
    }

}
