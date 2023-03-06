public class Data {
    public static double average(Measurable objects[]) {

        double sum = 0;
        for (int i = 0; i < objects.length; i++) {

            sum += objects[i].getMeasure();
        }
        return sum / objects.length;

    }

    public static Measurable max(Measurable x, Measurable y) {
        if (x.getMeasure() > y.getMeasure()) {
            return x;
        } else
            return y;
    }
}
