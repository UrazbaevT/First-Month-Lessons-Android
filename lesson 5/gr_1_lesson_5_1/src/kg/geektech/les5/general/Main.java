package kg.geektech.les5.general;

import kg.geektech.les5.objects.Car;
import kg.geektech.les5.objects.Chair;

public class Main {
    public static void main(String[] args) {
        int number = 78;
        Car c1 = new Car();
        c1.year = 2018;
        c1.model = "BMW X6";
        c1.volume = 4.4;
        System.out.println(c1);
        System.out.println("Year: " + c1.year + " model: " + c1.model + " volume: " + c1.volume);

        Car c2 = new Car(2020, "Mercedes 220", 6.3);
        System.out.println("Year: " + c2.year + " model: " + c2.model + " volume: " + c2.volume);

        Car myCar = new Car(2019, "Toyota Crown");
        System.out.println("Address of myCar object: " + myCar);
        myCar.volume = 3.2;
        System.out.println("Year: " + myCar.year + " model: " + myCar.model + " volume: " + myCar.volume);

        myCar.drive();
        myCar.drive("Osh");

        c1.drive("Tokmok");
        c1.makeSignal();
        c1.makeSignal();

        Chair chair = new Chair();
        chair.setMaterial("Velure");
        chair.setHeight(-100);
        System.out.println("Material: " + chair.getMaterial() + " height: " + chair.getHeight());

        chair.setHeight(90);
        System.out.println("Material: " + chair.getMaterial() + " height: " + chair.getHeight());


        Chair toyotaChair = new Chair();
        toyotaChair.setMaterial("Leather");
        toyotaChair.setHeight(120);
        myCar.setCarsChair(toyotaChair);
        System.out.println("Year: " + myCar.year + " model: " + myCar.model + " volume: " + myCar.volume
                + "Chair in the car: " + myCar.getCarsChair().getMaterial() + " " + myCar.getCarsChair().getHeight());

    }
}
