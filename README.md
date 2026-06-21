# Java OOP Concepts - Simplified Analogy

This project is a single-file Java program designed to illustrate the core concepts of Object-Oriented Programming (OOP) using a relatable, respectful context: a **Family** structure consisting of humans and pets.

## 🛠️ Project Structure
The code is contained entirely within a single source file, utilizing package-private top-level classes alongside a single `public class Main` which houses the application's entry point.

---

## 🗺️ System Architecture Diagram

```text
 ┌──────────────────────────────────────────────────────────────┐
 │                      ABSTRACT CLASS                          │
 │                       class Mammal                           │
 ├──────────────────────────────────────────────────────────────┤
 │ ⚙️ PROPERTY:  boolean breathesAir = true                     │
 │ 🛠️ ABSTRACTION: abstract void makeNoise()                    │
 └──────────────────────────────┬───────────────────────────────┘
                                │
                 ┌──────────────┴──────────────┐
                 │  INHERITS FROM (extends)    │
                 ▼                             ▼
 ┌──────────────────────────────┐       ┌───────────────────────┐
 │         CHILD CLASS          │       │      CHILD CLASS      │
 │         class Human          │       │       class Dog       │
 ├──────────────────────────────┤       ├───────────────────────┤
 │ 🛡️ ENCAPSULATION:            │       │                       │
 │  - private int age           │       │                       │
 │  - private String name       │       │                       │
 │                              │       │                       │
 │ 🔓 ACCESS CHANNELS:          │       │                       │
 │  + public String getName()   │       │                       │
 │  + public void setAge()      │       │                       │
 ├──────────────────────────────┤       ├───────────────────────┤
 │ 🎭 POLYMORPHISM:             │       │ 🎭 POLYMORPHISM:      │
 │  void makeNoise() {          │       │  void makeNoise() {   │
 │     print("Hello!");         │       │     print("Woof!");   │
 │  }                           │       │  }                    │
 └──────────────┬───────────────┘       └───────────┬───────────┘
                │                                   │
                │     INSTANTIATED OBJECTS          │
                ▼ (via 'new' keyword)               ▼
       ┌─────────────────┐                 ┌─────────────────┐
       │     OBJECT      │                 │     OBJECT      │
       │  alex (Human)   │                 │     (Dog)       │
       └────────┬────────┘                 └────────┬────────┘
                │                                   │
                └─────────────────┬─────────────────┘
                                  │ Collected into
                                  ▼
 ┌──────────────────────────────────────────────────────────────┐
 │                      Mammal[] family                         │
 │        [  Index 0: alex  ]   |   [  Index 1: Dog  ]          │
 ├──────────────────────────────────────────────────────────────┤
 │ 🔄 ENHANCED FOR-EACH LOOP:                                   │
 │   for (Mammal member : family) -> member.makeNoise();        │
 └──────────────────────────────────────────────────────────────┘
```

---

## 🏛️ The 4 Pillars of OOP Demonstrated

### 1. 🔍 Abstraction
**Definition:** Hiding internal implementation complexities and showing only essential features.
* **In this Code:** The `Mammal` class is declared as `abstract`. You cannot directly create a generic mammal (`new Mammal()`). It establishes a conceptual blueprint that forces child classes to implement the `makeNoise()` action, without defining how they should make that sound.

### 2. 🧬 Inheritance
**Definition:** Allowing a child class to inherit fields and behaviors from a parent class to eliminate redundant code.
* **In this Code:** Both `Human` and `Dog` use the `extends` keyword (`class Human extends Mammal`). Consequently, they automatically inherit the parent property `breathesAir = true` without having to define it themselves.

### 3. 🛡️ Encapsulation
**Definition:** Restricting direct access to an object's internal data fields and exposing them safely through public methods.
* **In this Code:** In the `Human` class, variables like `age` and `name` are marked as `private`. They cannot be altered directly from outside. Instead, external classes must use public **Getter** and **Setter** methods (`setAge(int newAge)`). This allows the class to execute safety checks (e.g., preventing a negative age).

### 4. 🎭 Polymorphism
**Definition:** The ability of different object types to respond uniquely to the same method invocation ("many forms").
* **In this Code:** An array of the parent type (`Mammal[] family`) holds distinct object types—a `Human` and a `Dog`. When looping through the array using an **Enhanced For-Each Loop**, calling `member.makeNoise()` dynamically executes the human's greeting or the dog's bark depending on the underlying object type.

---

## ⚙️ Prerequisites
Before running this program, ensure you have the **Java Development Kit (JDK)** installed on your machine. You can verify this by running `java -version` in your terminal.

---

## 💻 How to Run

Open your terminal or command prompt in the directory where `Main.java` is saved and execute these two simple steps:

### 1. Compile the source file
Use the Java compiler to compile the `.java` file into executable bytecode.
```bash
javac Main.java
```

### 2. Run the generated class file
Use the Java launcher to run the generated `.class` file.
```bash
java Main
```
