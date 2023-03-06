class WildCardExample<E extends Number> {
    E data;

    public WildCardExample(E data) {
        this.data = data;
    }

    public double sqrt() {
        return Math.sqrt(data.doubleValue());
    }

    public static void main(String[] args) {
        WildCardExample<Integer> b1 = new WildCardExample<Integer>(20);
        WildCardExample<Integer> b2 = new WildCardExample<Integer>(20);
        WildCardExample<Double> b3 = new WildCardExample<Double>(20.2);
    }
}

class OuterClass<T extends Integer & Comparable<Integer> & Cloneable> {
    private class InnerClass<E extends T> {

    }
}

class Box<T> {
    T data;

    public void copyFrom(Box<T> aBox) {
        this.data = aBox.getData();
    }

    public void copyFrom2(Box<? extends T> aBox) {
        this.data = aBox.getData();
    }

    public T getData() {
        return data;
    }

    public Box(T data) {
        this.data = data;
    }

    public void copyTo(Box<? super T> aBox) {
        aBox.data = this.getData();
    }

    public static void main(String[] args) {
        Box<?> b1 = new Box<Integer>(100);
        Box<?> b2 = new Box<Integer>(100);
        Box<?> b3 = new Box<String>("Ali");
        b1=b2;
        System.out.println(b1.getData());

    }
}