package com.qa.automation;

// ==========================================
// 1. ABSTRACTION & INHERITANCE (Parent Class)
// ==========================================
abstract class Mammal {
    // Shared property inherited by all child classes
    boolean breathesAir = true;

    // Abstract method: Forces all children to define their own noise
    abstract void makeNoise();
}

// ==========================================
// 2. CHILD CLASS 1: Human (Demonstrates Encapsulation & Polymorphism)
// ==========================================
class Human extends Mammal {
    // ENCAPSULATION: private variables, hidden from direct outside access
    private int age;
    private final String name;

    // Constructor to initialize human objects
    public Human(String name) {
        this.name = name;
    }

    // ENCAPSULATION: Public Getter to safely read private name
    public String getName() {
        return this.name;
    }

    // ENCAPSULATION: Public Setter with data validation for age
    public void setAge(int newAge) {
        if (newAge >= 0) { // Safety check to prevent negative ages
            this.age = newAge;
        } else {
            System.out.println("Error: Age cannot be negative.");
        }
    }

    public int getAge() {
        return this.age;
    }

    // POLYMORPHISM: Human implements the abstract method in its own way
    @Override
    void makeNoise() {
        System.out.println(name + " says: Hello!");
    }
}

// ==========================================
// 3. CHILD CLASS 2: Dog (Demonstrates Polymorphism)
// ==========================================
class Dog extends Mammal {
    // POLYMORPHISM: Dog implements the same method but acts differently
    @Override
    void makeNoise() {
        System.out.println("The dog says: Woof!");
    }
}

// ==========================================
// 4. MAIN EXECUTABLE CLASS
// ==========================================
public class Main {
    public static void main(String[] args) {

        System.out.println("--- Testing Encapsulation & Inheritance ---");

        // Create a specific Human object
        Human alex = new Human("Alex");

        // Testing ENCAPSULATION: setting age through the safe setter method
        alex.setAge(25);
        System.out.println("Name: " + alex.getName());
        System.out.println("Age: " + alex.getAge());

        // Testing INHERITANCE: accessing parent property 'breathesAir'
        System.out.println("Breathes air? " + alex.breathesAir);

        System.out.println("\n--- Testing Polymorphism and Abstraction ---");
        Mammal[] family = new Mammal[2];
        family[0] = alex;         // Human object inside family array
        family[1] = new Dog();    // Dog object inside family array

        // Testing ABSTRACTION: calling the parent's abstract method
        // Testing POLYMORPHISM: different child implementation of the parent's abstract method
        for (Mammal member : family) {
            member.makeNoise();
        }
    }
}
