package Vehicle;

public class RaceCar extends Car implements Motion {
    public RaceCar() {
        make = "RaceCar";
        model = "F1";
    }

    @Override
    public void Drive() {
        System.out.println("you racin now boi");
    }
}
