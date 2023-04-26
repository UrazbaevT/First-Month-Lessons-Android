import java.util.Arrays;

public class Dog extends Animal { //DRY
    private String[] commands;

    public Dog(String[] commands, int age, Color color) {
        super();
        this.commands = commands;
        this.setAge(age);
        this.setColor(color);
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    @Override
    public String info() {
        return super.info() + " Commands: " + Arrays.toString(this.commands);
    }
}
