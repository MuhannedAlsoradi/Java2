class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }

    public void print() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.y + this.x);
    }
    
}
class MyMainClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.y);
    }
}