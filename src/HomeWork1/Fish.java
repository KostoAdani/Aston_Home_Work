package HomeWork1;

public class Fish extends Mammal implements Water {
    public Fish(String name, String color) {
        super(name, color);
    }

    public void liveInWater() {
        System.out.println("животное живет в воде");
    }

    public void makeSound() {
        System.out.println("рыба молчит");
    }
}
