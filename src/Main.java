import Vehicle.Car;
import Vehicle.RaceCar;

public class Main {
    public static void main(String[] args) {

        Car[] vehicles = {new Car(), new RaceCar()};

        for (Car vehicle : vehicles){
            System.out.println(vehicle.make);
            vehicle.Drive();
        }
    }
}