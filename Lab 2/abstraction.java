abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public abstract void sound();

    public void sleep() {
        System.out.println("Sleeping");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("Dog skreaming");
    }
}