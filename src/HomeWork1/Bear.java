package HomeWork1;

public class Bear extends Mammal implements Wool {
    private int height;

    public Bear(String name, String color, int height) {
        super(name, color);
        this.height = height;
    }

    public void hasWool() {
        System.out.println("у животного есть шерсть");
    }

    public void makeSound() {
        System.out.println("медведь рычит");
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", рост " + this.height;
    }
}
