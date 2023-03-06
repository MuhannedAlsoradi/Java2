
public class NumFilterTest {

    public static void filterData(Integer a[], NumFilter filter) {

        if (filter instanceof OddNumFilter) {
            for (int c = 0; c < a.length; c++)

            {
                if (filter.predict(a[c])) {
                    System.out.print("\n Number " + a[c] + " is odd.");
                }
            }
        }

        if (filter instanceof MultipleOfFilter) {

            MultipleOfFilter m = (MultipleOfFilter) filter;

            for (int c = 0; c < a.length; c++)

            {
                if (m.predict(a[c])) {
                    System.out.print("\n Number " + a[c] + " is multiple of "
                            + m.getMultipleOf());
                }
            }
        }
    }

    public static void main(String[] s) {

        Integer arr[] = { 12, 5, 7, 8, 11, 45, 36, 17, 19, 22, 24, 30, 78, 15, 80,
                81, 2, 65, 60, 40 };

        NumFilter onf = new OddNumFilter();

        NumFilter mof3 = new MultipleOfFilter(3);

        NumFilter mof5 = new MultipleOfFilter(5);

        System.out.print("\n *********** Multiple of 3 Filter *********** ");
        filterData(arr, mof3);
        System.out.print("\n\n *********** Multiple of 5 Filter *********** ");
        filterData(arr, mof5);
        System.out.print("\n\n *********** ODD Filter *********** ");
        filterData(arr, onf);
    }
}
