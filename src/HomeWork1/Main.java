package HomeWork1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Мурка", "Рыжий", 4);
        System.out.println(cat.toString());
        cat.makeSound();
        cat.hasWool();
        cat.hasSpine();
        System.out.println("\n");
        Animal bear = new Bear("Миша", "Коричневый", 187);
        System.out.println(bear.toString());
        ((Mammal)bear).hasSpine();
        ((Wool)bear).hasWool();
        System.out.println("\n");
        Fish fish = new Fish("Моли", "Золотой");
        System.out.println(fish.toString());
        fish.liveInWater();
        fish.hasSpine();
        Mammal whale = new Whale("Кит", "Серый");
        System.out.println(whale.toString());
        whale.makeSound();
        whale.hasSpine();
        ((Water)whale).liveInWater();
    }
}
