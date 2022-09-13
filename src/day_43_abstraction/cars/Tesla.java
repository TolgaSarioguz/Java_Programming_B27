package day_43_abstraction.cars;

public class Tesla extends ElectricCar{
    @Override
    public void start() {
        System.out.println("Key car near by, starting car");
    }

    @Override
    public void charge() {
        System.out.println("telsa charging station");
    }
}

// Tesla is a ElectricCar
// Tesla is a Car
// Tesla is a Object
