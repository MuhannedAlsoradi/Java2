import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Collection02 {
    public static void main(String[] args) {
        String[] arr = { "Rami", "Ali", "Wesam", "Tamer" };
        List<String> list = Arrays.asList(arr);
        Collections.sort(list);
        System.out.println("sorted: " + list);
        int where = Collections.binarySearch(list, "Tamer");
        System.out.println("Tamer is at: " + where);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("--------------------------");
        List<Integer> intList = new ArrayList<>();
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);
        intList.add(2, 60);
        Integer sum = 0;
        for (int i = 0; i < intList.size(); i++) {
            sum += intList.get(i);
        }
        System.out.println(sum);
    }
}
