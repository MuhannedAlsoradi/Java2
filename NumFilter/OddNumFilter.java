
class OddNumFilter implements NumFilter {

    public boolean predict(Integer n) {

        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
