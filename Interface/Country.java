class Country implements Measurable {
    String name;
    double area;

    Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public double getMeasure() {
        return area;
    }
}
