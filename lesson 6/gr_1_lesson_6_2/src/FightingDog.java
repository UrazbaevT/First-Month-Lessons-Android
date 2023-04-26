public class FightingDog extends Dog {
    private int wins;

    public FightingDog(int wins, String[] commands, int age, Color color) {
        super(commands, age, color);
        this.wins = wins;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void fight() {
        System.out.println(this.getCommands());
        System.out.println("Dog is fighting");
    }

    @Override
    public String info() {
        return super.info() + " Wins: " + this.wins;
    }
}
