public class Main {
    public static void main(String[] args) {
        int numberOfStudents = 15;
        int temperature = 14;
        boolean isRainy = true;

        if (numberOfStudents > 10 && temperature > 5) {
            // && - оператор И (AND)
            System.out.println("Go to picnic");
        }
        if (temperature < 0 || temperature > 40) {
            // || - оператор ИЛИ (OR)
            System.out.println("Stay at home");
        }
        if (isRainy || temperature <= 3) {
            System.out.println("Take on a warm clothes");
        }
        // Привет сэнсей
        if (numberOfStudents < 5 || temperature < 15 && isRainy) {
            // false || true && true => 0 + 1 * 1 => 0 + 1 = 1 (TRUE)
            System.out.println("Go to Cafe");
        }
        if (isRainy || temperature < 20 && numberOfStudents >= 20) {
            // true || true && false => 1 + 1 * 0 => 1 + 0 = 1 (TRUE)
            System.out.println("Play tennis");
        }
        if ((isRainy || temperature < 20) && numberOfStudents >= 20) {
            // (true || true) && false => (1 + 1) * 0 => 1 * 0 = 0 (FALSE)
            System.out.println("Play hockey");
        }
        if (isRainy) {
            System.out.println("Take an umbrella");
        }
        if (!isRainy) {
            // ! - оператор отрицания НЕ (NOT)
            System.out.println("Go swimming");
        }

        if (!(isRainy || temperature < 20) && numberOfStudents >= 20) {
            // !(true || true) && false => !(1 + 1) * 0 => 0 * 0 = 0 (FALSE)
            System.out.println("Play volleyball");
        }
        if (temperature != 15) { // оператор проверки на неравенство
            System.out.println("Temperature is not equal to fifteen");
        }
    }
}
