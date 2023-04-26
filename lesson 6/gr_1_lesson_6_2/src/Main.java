public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor(Color.YELLOW);
        cat.setAge(2);
        System.out.println(cat.info());

        String[] commandsOfMyDog = {"Sit", "Stay", "Voice"};
        Dog myDog = new Dog(commandsOfMyDog, 1, Color.RED);
        System.out.println(myDog.info());

        FightingDog fightingDog = new FightingDog(6, new String[]{"Fight"},
                2, Color.BLUE);
        System.out.println(fightingDog.info());

        String str = "Hi";
        Integer number = 6;

        /*if (cat.getColor() == "Blak") {
            System.out.println("The cat is beautiful");
        }*/

        if (fightingDog.getColor() == Color.RED) {
            System.out.println("The fighting dog is pretty");
        }

    }
}
