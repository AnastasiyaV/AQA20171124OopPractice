public class Car extends Vehicle {
    private String bodyType;
    private int seedCar = 70;

    public Car(String bodyType) {
        super();
        this.bodyType = bodyType;
    }

    public Car(String name, int id, String bodyType, int seedCar) {
        super(name, id, seedCar);
        this.bodyType = bodyType;
    }
    @Override
    int run() {
        return seedCar;
    }
    @Override
    public String toString() {
        return "Car{" +
                "bodyType='" + bodyType + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", seedCar=" + seedCar +
                '}';
    }
}
