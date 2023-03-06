class Test {
    public static void main(String[] args) {
        Person arrPerson[] = new Person[6];
        arrPerson[0] = new Person(1, "Ali");
        arrPerson[1] = new Person(2, "Sami");
        arrPerson[2] = new Student(33, "Khalid", 3);
        arrPerson[3] = new Student(40, "Othman", 4);
        arrPerson[4] = new JavaStudent(70, "Hamdi", 5, 0, 0);
        arrPerson[5] = new JavaStudent(128, "Ahmad", 6, 0, 0);

        for (int i = 0; i < arrPerson.length; i++) {
            if (arrPerson[i] instanceof JavaStudent) {

                ((JavaStudent) arrPerson[i]).setMidMark(27);
                ((JavaStudent) arrPerson[i]).setFinalMark(38);
                // System.out.println(((JavaStudent) arrPerson[i]).midMark);
                // System.out.println(((JavaStudent) arrPerson[i]).finalMark);

            }
        }
        for (int i = 0; i < arrPerson.length; ++i) {
            arrPerson[i].print();
        }
        for (int i = 0; i <= arrPerson.length; i++) {

            if (i < 5)
                System.out.println(arrPerson[i].equals(arrPerson[i + 1]));
        }
    }
}
