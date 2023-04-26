package kg.geektech.les5.objects;

import java.util.Random;

public class Chair {
    private int height;
    private String material;

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        if (height < 0) {
            System.out.println("Wrong value for height, it must be a positive number");
            this.height = generateDefaultHeight();
        } else {
            this.height = height;
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    private int generateDefaultHeight() {
        Random random = new Random();
        return random.nextInt(100) + 20;
    }
}
