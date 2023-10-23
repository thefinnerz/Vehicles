package Vehicle;

public abstract class Car {
    public String make;
    public String model;
    public int mileage;

    public Car(){
        make="Ford";
        model="Ranger";
        mileage=40;
    }

    public Car(String make, String model, int mileage){
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public abstract void Drive();
}
