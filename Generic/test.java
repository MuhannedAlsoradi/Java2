import java.util.ArrayList;

interface Filter<T> {
    boolean predicate(T n);
}

class MyFilter implements Filter<String> {
    public boolean predicate(String data) {
        return !data.startsWith("H");
    }

}

class Test4 {

    public static <T> void process(ArrayList<T> list, Filter<T> filter) {

        for (T element : list)

            if (filter.predicate(element))

                System.out.println(element);

    }

    public static void main(String[] args) {

        ArrayList<String> mylist = new ArrayList<String>();

        mylist.add("Welcome");
        mylist.add("Hi");
        mylist.add("Hello");
        mylist.add("Bye");

        process(mylist, new MyFilter());
    }
}