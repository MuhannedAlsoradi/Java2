public class Test_Interface {
    public static void main(String[] args) {
        Person p = new Person();
        Country countries[] = new Country[3];
        countries[0] = new Country("Palestine", 27027);
        countries[1] = new Country("Jordan", 89000);
        countries[2] = new Country("Eygept", 101000);
        p.care();
        p.getCach();
        p.study();
        Shape s;
        s = new Circle(12);
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
        s = new Rectangle(10, 10);
        Shape s2;
        s2 = new Rectangle(20, 10);
        System.out.println(s2.compareTo(s));
        Shape arr[] = { s, s2 };

        java.util.Arrays.sort(arr);
        for (Shape p1 : arr) {
            System.out.println(((Rectangle) p1));
        }
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
        double avg = Data.average(countries);
        System.out.println(avg);
        Measurable max = Data.max(countries[0], countries[1]);
        System.out.println(((Country) max).name);
    }

}
