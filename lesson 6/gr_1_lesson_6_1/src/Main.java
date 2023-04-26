public class Main {
    public static void main(String[] args) {
        System.out.println(Car.counter);
        Car c1 = new Car(2020, "BMW");
        Car c2 = new Car(2011, "Nissan");
        System.out.println(Car.counter);
        Car.counter = 10;
        Car.addition(8, 9);
    }
}
