public class Car {
    String make;
    int year;
    String color;
    String model;
    String plate;
    int numOfCylinders;
    double mileage;
    public Car(String make, int year, String color, String model, String plate, int numOfCylinders){
        this.make = make;
        this.year = year;
        this.color = color;
        this.model = model;
        this.plate = plate;
        this.numOfCylinders = numOfCylinders;
        this.mileage = 5.0;

    }
    public void printInfo(){
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Plate: " + plate);
        System.out.println("Number Of Cylinders: " + numOfCylinders);
        System.out.println("Mileage: " + mileage);
        System.out.println("=====================================================");
    }
    public void drive(double miles){
        mileage = mileage + miles;
    }
}
