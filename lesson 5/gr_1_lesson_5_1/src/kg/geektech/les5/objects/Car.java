package kg.geektech.les5.objects;

public class Car {
    public int year;
    public String model;
    public double volume;
    private Chair carsChair;

    public Car() {
    } // default constructor

    public Car(int theYear, String theModel, double theVolume) {
        year = theYear;
        model = theModel;
        volume = theVolume;
    }

    public Car(int theYear, double theVolume, String theModel) {
        year = theYear;
        model = theModel;
        volume = theVolume;
    }

    public Car(int theYear, int theVolume, String theModel) {
        year = theYear;
        model = theModel;
        volume = theVolume;
    }

    public Car(int year, String model) {
        System.out.println("Address of this: " + this);
        this.year = year;
        this.model = model;
    }

    public void drive() {
        System.out.println("kg.geektech.les5.objects.Car " + this.model + " is driving");
    }

    public void drive(String city) {
        System.out.println("kg.geektech.les5.objects.Car " + this.model + " is driving to " + city);
    }

    public void makeSignal() {
        System.out.println("kg.geektech.les5.objects.Car " + this.model + " beeeeeeeep");
    }

    public Chair getCarsChair() {
        return carsChair;
    }

    public void setCarsChair(Chair carsChair) {
        this.carsChair = carsChair;
    }
}
