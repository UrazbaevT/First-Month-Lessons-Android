public class Main {

    public static void test() {
        // невозвращаемый метод без входящих параметров
        int a = 9;
        System.out.println(a * 2);
    }

    public static void main(String[] args) {
        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();
        test();
        addition(2, 3, "JAVA");
        calculatePerimeter("Auditory 2", 5.0, 4.0);
        calculatePerimeter("Kitchen", 3.5, 2.0);
        calculatePerimeter("Hall", 10.0, 5.5);
        double areaOfAuditory2 = calculateArea(5.0, 4.0);
        System.out.println("Area of Auditory 2 = " + areaOfAuditory2 + " square " + getUnit());
        double areaOfKitchen = calculateArea(3.5, 2.0);
        System.out.println("Area of Kitchen = " + areaOfKitchen + " square " + getUnit());
        double areaOfHall = calculateArea(10.0, 5.5);
        System.out.println("Area of Hall = " + areaOfHall + " square " + getUnit());
        System.out.println("TOTAL area = " +
                (areaOfAuditory2 + areaOfKitchen + areaOfHall)
                + " square " + getUnit());
        calculatePerimeter("dfghj", 4.5, 5.323456789234567);
    }

    public static String getUnit() {
        // возвращаемый метод без входящих параметров
        return "meters";
    }

    public static double calculateArea(double length, double width) {
        // возвращаемый метод с входящими параметрами
        double area = length * width;
        return area;
    }

    public static void calculatePerimeter(String roomName, double length, double width) {
        // невозвращаемый метод с входящими параметрами
        System.out.println("Perimeter of " + roomName + " = "
                + (2 * (length + width)) + " " + getUnit());
    }

    public static void addition(int num1, int num2, String word) {
        // невозвращаемый метод с входящими параметрами
        System.out.println("Result: " + (num1 + num2));
        System.out.println("The value of word: " + word);
    }

    public static void makeTea() {
        // невозвращаемый метод без входящих параметров
        System.out.println("Вскипятить воду");
        System.out.println("Насыпать заварку");
        System.out.println("Залить кипятком");
        System.out.println("Дать настояться");
        System.out.println("Налить в пиалу");
        System.out.println("Добавить сахар или молоко по вкусу");
        test();
    }

}
