import Vehicle.Car;
import Vehicle.RaceCar;

public class Main {
    public static void main(String[] args) {

        Car[] vehicles = {new RaceCar(), new RaceCar()};

        for ( int i = 0; i < vehicles.length; i ++ ){
            System.out.println(vehicles[i].make);
            vehicles[i].Drive();
        }
    }
}