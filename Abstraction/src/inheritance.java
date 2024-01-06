class Vehicle {
    String brand;
    int year;
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void displayInfo() {

        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }
    public void displayCarInfo() {
        System.out.println(super.brand);
        System.out.println("Car Details - Brand: " + brand + ", Year: " + year + ", Doors: " + numberOfDoors);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);

        myCar.displayInfo();
        myCar.displayCarInfo();
    }
}