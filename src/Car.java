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

    public void displayInfo() {
        System.out.printf("displayInfo\nMake: %s\nModel: %s\nYear %d", make, model, year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2022);
        myCar.displayInfo();

        // Modifying values using setter methods
        myCar.setMake("Honda");
        myCar.setModel("Civic");
        myCar.setYear(2024);
        System.out.printf("\ngetters\ngetMake: %s\ngetModel: %s\ngetYear: %d", myCar.getMake(), myCar.getModel(), myCar.getYear());

        System.out.println("\nUpdated (via setters) Car Info:");
        myCar.displayInfo();
    }
}
