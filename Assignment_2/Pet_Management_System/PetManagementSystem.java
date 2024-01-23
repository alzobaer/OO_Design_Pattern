import java.util.ArrayList;
import java.util.List;

// Base class for pets
class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Generic pet sound");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// Dog class, inheriting from Pet
class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.toString() + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}

// Cat class, inheriting from Pet
class Cat extends Pet {
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.toString() + '\'' +
                ", isIndoor=" + isIndoor +
                '}';
    }
}

// PetOwner class
class PetOwner {
    private String name;
    private List<Pet> pets;

    public PetOwner(String name) {
        this.name = name;
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void playWithPets() {
        System.out.println(name + " is playing with their pets:");
        for (Pet pet : pets) {
            pet.makeSound();
        }
    }

    @Override
    public String toString() {
        return "PetOwner{" +
                "name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}

// Main class for the Pet Management System
public class PetManagementSystem {
    public static void main(String[] args) {
        // Creating pets
        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat1 = new Cat("Whiskers", 2, true);

        // Creating a pet owner
        PetOwner owner1 = new PetOwner("Alice");
        owner1.addPet(dog1);
        owner1.addPet(cat1);

        // Displaying pet owner information
        System.out.println(owner1);

        // Pet owner playing with pets
        owner1.playWithPets();
    }
}
