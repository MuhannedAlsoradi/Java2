class JavaStudent extends Student {
    int midMark, finalMark;

    JavaStudent(int successHours, String name, int no, int midMark, int finalMark) {
        super(successHours, name, no);
        this.midMark = midMark;
        this.finalMark = finalMark;
    }

    public void setMidMark(int midMark) {
        this.midMark = midMark;
    }

    public void setFinalMark(int finalMark) {
        this.finalMark = finalMark;
    }

    @Override
    public void print() {
        System.out.println("mid mark is: " + midMark + " \nfinal mark is: " + finalMark);
        super.print();
    }
}
