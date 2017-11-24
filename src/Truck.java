public class Truck extends Vehicle{
    int truckSpeed = 40;

    public Truck(int truckSpeed) {
        this.truckSpeed = truckSpeed;
    }

    public Truck() {

    }

    @Override
    int run() {
        return truckSpeed;
    }
}
