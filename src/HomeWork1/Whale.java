package HomeWork1;

public class Whale extends Mammal implements Water {
    public Whale(String name, String color) {
        super(name, color);
    }

    public void liveInWater() {
        System.out.println("животное живет в воде");
    }

    public void makeSound() {
        System.out.println("кит издает звуки");
    }
}
