package src;

// add three appropriate data fields
// provide appropriate method to the car class
// demonstrate your methods

public class Car {

    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return String.format("Make: %s, Model: %s, Year: %s", make, model, String.valueOf(year));
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2022);
        System.out.println("myCar:\n" + myCar.toString() + "\n--------");

        myCar.setMake("Honda");
        myCar.setModel("Civic");
        myCar.setYear(2024);
        System.out.println("Updated myCar via setters:\n" + myCar.toString() + "\n--------");
//        System.out.printf("\ngetters\ngetMake: %s\ngetModel: %s\ngetYear: %d", myCar.getMake(), myCar.getModel(), myCar.getYear());

        Car carAlex = new Car("Chevrolet", "Malibu", 2020);
        System.out.println("carAlex:\n" + carAlex.toString());
    }

}
