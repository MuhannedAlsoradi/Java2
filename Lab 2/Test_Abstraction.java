public class Test_Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog("dog name");
        System.out.println("\n=================================================================\n");
        System.out.println(dog.name);
        dog.sound();
        dog.sleep();
        System.out.println("\n=================================================================\n");
    }
}
