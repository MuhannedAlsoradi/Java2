public class BankAccount implements Measurable {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public double getMeasure() {
        return balance;
    }
}
