public class Car extends Vechail {
    String modelName = "Ferari";

    Car(String modelName, String brand) {
        super(brand);
        this.modelName = modelName;
    }

    public void Honk() {
        System.out.println("Beeeb!");
    }

}
