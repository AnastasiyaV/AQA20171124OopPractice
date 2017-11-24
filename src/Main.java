
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Vehicle1",1,20);
        Vehicle car2 = new Car("veh2",2,"sedun2", 50);
//        System.out.println(vehicle.toString());
//        System.out.println(car2.toString());

        Vehicle truck = new Truck(44);
        System.out.println("run method with vehicle "+ vehicle.run());
        System.out.println("run method with car2 " + car2.run());
        System.out.println("run method with truck "+truck.run());
        
    }


}
