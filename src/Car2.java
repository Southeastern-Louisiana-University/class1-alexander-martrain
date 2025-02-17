package src;

public class Car2 {

    // Attributes
    public String make;
    public String model;
    private int year;

    // Construction
    public Car2(String carMake, String carModel, int carYear) {
        this.make = carMake;
        this.model = carModel;
        this.year = carYear;
    }

    public Car2() {

    }

    public static void main(String[] args) {
        Car2 car = new Car2();
        Car2 newCar = new Car2("make", "model", 2000);
        System.out.println("What is newCar.toString()? " + newCar.toString());
        newCar.toString();
    }

    // make method to display car details
    // override in an appropriate manner
    //

//    public String toString() {
//        return toString() = "new stuff\n";
//    }

}
