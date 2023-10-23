package Vehicle;

public class Car implements Motion {
    public String make;
    public String model;
    public int mileage;

    public Car(){
        make="Ford";
        model="Ranger";
        mileage=40;
    }

    public Car(String make){
        this.make = make;
    }

    @Override
    public void Drive() {
        System.out.println("You drivin now boi");
    }
}
