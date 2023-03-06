class Person {
    private int no;
    private String name;

    public Person(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void print() {
        System.out.println("No is " + no);
        System.out.println("Name is " + name);
    }

    public boolean equals(Object pr) {
        if (pr instanceof Person) {
            return (((Person) pr).name.equals(this.name) && ((Person) pr).no == this.no);
        } else {
            return false;
        }

    }
}
