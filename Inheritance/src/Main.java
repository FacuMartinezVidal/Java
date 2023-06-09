public class Main {
    public static void main(String[] args) {
        Animals animal = new Animals("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", "Big", 30, "Funny", "Random");
        doAnimalStuff(yorkie, "Medium");
    }

    public static void doAnimalStuff (Animals animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}