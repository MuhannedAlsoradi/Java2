class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }

    public int compareTo(Student obj) {
        if (age > obj.age) {
            return 1;
        } else if (age == obj.age) {
            return 0;
        } else
            return -1;
    }
}

class GenericMaxMethodTest {
    public static <T extends Comparable<T>> T max(T x, T y, T z) {
        T largest = x;
        if (y.compareTo(largest) > 0) {
            largest = y;
        }
        if (z.compareTo(largest) > 0) {
            largest = z;
        }
        return largest;
    }

    public static <T extends Comparable<T>> T min(T[] arr) {
        T smallest = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i].compareTo(smallest) < 0) {
                smallest = arr[i];
            }
        }
        return smallest;

    }

    public static void main(String[] args) {
        System.out.println(max(12, 33, 20));
        System.out.println(max("AA", "B", "C"));
        System.out.println(max(1.2, 2.3, 3.4));
        Student s1 = new Student(10, "Ali", 19);
        Student s2 = new Student(10, "Ali", 20);
        Student s3 = new Student(10, "Ali", 19);
        System.out.println(max(s1, s2, s3));
        Integer intArray[] = {6,2,3,4,5};
        System.out.println(min(intArray));

    }
}
