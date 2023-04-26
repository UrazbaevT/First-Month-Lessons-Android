public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(3 + 7 * 4 / 2 - 1);
        System.out.println(7 % 2); // Оператор modulus
        System.out.println("Hi " + "JAVA");
        System.out.println("Результат: " + 6 + 7);
        System.out.println("Результат: " + (6 + 7));

        int ageOfMyFriend = 27; // объявление и инициализация переменной

        System.out.println("Возраст моего друга: " + ageOfMyFriend);
        System.out.println(ageOfMyFriend + 10);
        ageOfMyFriend = 19;
        System.out.println(ageOfMyFriend);

        int apples; // объявление переменной

        System.out.println("Programming");
        apples = 9; // присваивание значения переменной

        boolean isItNight = true;
        double digit = 78.123;
        char letter = 'f';
        // isItNight = 324;
        String myName = "John Parker 11";
        System.out.println(isItNight + " " + digit + " "
                + myName + letter);

        final String BIG_CITY = "Tokyo";
        // BIG_CITY = "New York";

        final double PI = 3.14;
    }
}
