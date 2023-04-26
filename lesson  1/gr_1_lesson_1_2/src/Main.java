public class Main {
    public static void main(String[] args) {
        int temperature = 16;
        int numberOfStudents = 15;
        boolean isRainy = false;

        if (temperature > 10) {
            System.out.println("Go to the park");
        }

        if (numberOfStudents == 22) {
            int cars = 23;
            System.out.println("Number of cars in my city: " + cars);
            System.out.println("Play Football");
        }

        if (isRainy) {
            System.out.println("Take an umbrella");
        } else {
            System.out.println("Take on a cap");
        }

        /*else {
            System.out.println("Good luck!");
        }*/

        if (temperature <= 20) {
            System.out.println("It is cold weather");
        } else {
            System.out.println("It is warm weather");
        }

        if (numberOfStudents > 25) {
            System.out.println("Go to the picnic");
        } else if (numberOfStudents > 10) {
            System.out.println("Go to the cinema");
        } else if (numberOfStudents > 3) {
            System.out.println("Go to Cafe");
        } else {
            System.out.println("stay at home");
        }
    }
}
