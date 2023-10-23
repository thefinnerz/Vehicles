import Vehicle.Car;
import Vehicle.RaceCar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sc = "";
        System.out.println("What car?");
        sc = scan.nextLine();
        Car car1 = null;

        try {
            car1 = new Car(sc);
        } catch (Exception e) {
            System.out.println("Wrong input.");
        }


        Car[] vehicles = {car1, new RaceCar()};

        for (Car vehicle : vehicles){
            System.out.println(vehicle.make);
            vehicle.Drive();
        }
    }
}