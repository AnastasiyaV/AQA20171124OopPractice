public class Vehicle {
    protected String name = "no name";
    protected int id = 1;
    protected int speedVehicle= 10;

    public Vehicle(String name, int id, int speedVehicle) {
        this.name = name;
        this.id = id;
        this.speedVehicle = speedVehicle;

    }
    public Vehicle() {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", speedVehicle=" + speedVehicle +
                '}';
    }

    int run( ) {
        return 0;
    }
}
