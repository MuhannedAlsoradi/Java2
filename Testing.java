import java.util.Comparator;

class SalaryComp implements Comparator {
    public int compare(T x1, T x2) {
        if (x1.salary == x2.salary)
            return 0;
        else if (x1.salary > x2.salary) {
            return 1;
        } else
            return -1;
    }
}