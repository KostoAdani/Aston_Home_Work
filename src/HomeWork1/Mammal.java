package HomeWork1;

public abstract class Mammal extends Animal implements Spine {

    Mammal(String name, String color) {
        super(name, color);
    }

    public void hasSpine() {
        System.out.println("у животного есть позвоночник");
    }

    public abstract void makeSound();
}
