public class Car {
    private int year;
    private String model;
    public static int counter;

    public Car(int year, String model) {
        counter++;
        this.year = year;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void drive() {
        System.out.println("Driving " + this.model);
    }

    public static void addition(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
