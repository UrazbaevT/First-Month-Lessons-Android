import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i = i + 1) {
            System.out.println("Hello " + i);
        }
        for (int i = 1; i <= 10; i++) { // i++ => i = i + 1
            System.out.println("5 x " + i + " = " + 5 * i);
        }
        System.out.println("---------------");
        for (int i = 10; i > 0; i--) { // i-- => i = i - 1
            System.out.println("7 x " + i + " = " + 7 * i);
        }
        System.out.println("---------------");
        for (int i = 10; i > 0; i -= 2) { // i-=2 => i = i - 2; i*=3 => i = i * 3
            System.out.println("9 x " + i + " = " + 9 * i);
        }
        int a = 3;
        while (a <= 5) {
            System.out.println("Java " + a);
            a++;
        }
        String str = "#";
        // str.length()  количество символов в строке
        while (str.length() < 5) {
            System.out.println(str);
            str = str + "#";
        }
        String[] robots = new String[7];
        System.out.println(Arrays.toString(robots));
        for (int i = 0; i < robots.length; i++) {
            robots[i] = "Robots00" + (i + 1);
        }
        System.out.println(Arrays.toString(robots));

        String names[] = {"Kanykei", "Maksim", "Aziret"};
        for (String currentElement : names) {
            System.out.println("Hi dear, " + currentElement);
        }
        int[] numbers = {45, -11, 98, -66, 173};
        System.out.println("**************");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                break; // экстренно прерывает весь цикл
            }
            System.out.println(numbers[i]);
        }
        System.out.println("**************");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                continue; // экстренно прерывает текущий круг
            }
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Внешний цикл " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("Внутренний цикл " + j);
            }
        }
    }
}
