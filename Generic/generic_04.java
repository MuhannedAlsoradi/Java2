interface NumFilter {
    boolean predicate(Integer n);
}

class OddNumFilter implements NumFilter {
    @Override
    public boolean predicate(Integer n) {

        return (n % 2 == 1);
    }
}
class MultipleOfFilter implements NumFilter{
    @Override
    public boolean predicate(Integer n) {
        // TODO Auto-generated method stub
        return false;
    }
}