public class weekEmployee extends Employee {
    String weekWage;

    public weekEmployee(String weekWage, String name) {
        super(name);
        this.weekWage = weekWage;
    }

    void print() {
        super.print();
        System.out.println(weekWage);
    }
}
