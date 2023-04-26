public class Main {
    public static void main(String[] args) {
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("Число равно одному");
                break;
            case 2:
                System.out.println("Число равно двум");
                break;
            case 3:
                System.out.println("Число равно трем");
                break;
            default:
                System.out.println("Число неизвестно");
                break;
        }

        String name = "Meerim";
        switch (name) {
            case "Bermet":
                System.out.println("Привет Бермет");
                break;
            case "Meerim":
                System.out.println("Привет Мээрим");
                break;
            case "Tilek":
                System.out.println("Привет Тилек");
                break;
            default:
                System.out.println("Привет незнакомец");
                break;
        }
    }
}
