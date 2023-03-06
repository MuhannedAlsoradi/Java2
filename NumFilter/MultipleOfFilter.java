
class MultipleOfFilter implements NumFilter {

    int multipleOf;

    MultipleOfFilter(int n) {
        multipleOf = n;
    }

    public int getMultipleOf() {
        return multipleOf;
    }

    public boolean predict(Integer n) {

        if (n % multipleOf == 0) {
            return true;
        } else {
            return false;
        }
    }
}