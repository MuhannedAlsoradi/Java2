class GenericMethodTest<T> {
    public static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer intArr[] = { 1, 2, 3 };
        Double doubleArr[] = { 1.1, 2.2, 3.3 };
        String strArr[] = { "aa", "bb", "cc" };
        printArray(intArr);
        printArray(doubleArr);
        printArray(strArr);
        String s = Algorithms.<String>getMiddle(strArr);
        System.out.println(s);
    }
}
class Algorithms {
    public static <T> T getMiddle(T[] a){
        return a[a.length/2];
    }
}