class GenericExample<T> {
    public static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Integer arrInt[] = { 1, 2, 3, 4, 5 };
        Double arrDouble[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Object arrObject[] = {1,2,"aaa","bbb",12.8};
        String arrString[] = { "a", "b", "c" };
        printArray(arrInt);
        printArray(arrDouble);
        printArray(arrString);
        printArray(arrObject);
    }
}