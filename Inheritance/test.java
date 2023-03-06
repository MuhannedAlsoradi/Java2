

class Test1 {
    public static void main(String[] args) {
Person1 p = new Person1(1, "Ali");
Student1 s = new Student1(2, "Mustafa", 87.9);
Employee1 e = new Employee1(3, "Khalid", 1350);
Manager m = new Manager(4, "Dina", 1250, "CS");
// p.print();
// s.print();
// e.print();
// m.print();
// Person x;
// x = m;
// x.print();
Person1 a[] = new Person1[5];
a[0] = new Person1(1,"ali");
a[1] = new Manager(2, "Othman", 1300, "Mechatronics");
a[2] = new Employee1(3, "Abood", 2000);
a[3] = new Manager(4, "Belal", 700, "CS");
a[4] = new Manager(5, "Hodaiha", 800, "Renewable");
for(int i =0 ; i< a.length;++i){
   a[i].print();
}
    }
}