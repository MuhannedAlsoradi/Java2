public class Test {
    public static void main(String[] args) {
        // Car car = new Car("Ferari", "Skoda");
        // Vechail vechail = new Vechail("BMW");
        // car.Honk();
        // System.out.println(car.brand);
        // System.out.println(car.modelName);
        // System.out.println(vechail.brand);
        Cat cat = new Cat("Cat name");
        Dog dog = new Dog("Dog name");
        System.out.println(
                "----------------------------------------------------------------------------------------------\n");
        cat.Voice();
        dog.Voice();
        System.out.println(cat.name);
        System.out.println(dog.name + "\n");

    }
}
