package HomeWork1;

public class Cat extends Mammal implements Wool {
    private int age;

    public Cat(String name, String color, int age) {
        super(name, color);
        this.age = age;
    }

    public void hasWool() {
        System.out.println("у животного есть шерсть");
    }

    public void makeSound() {
        System.out.println("кошка мяукает");
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", возраст: " + this.getAge();
    }
}
