// Define an interface Animal with a method bark() and a default method sleep()
interface Animal {
    void bark(); // Abstract method to be implemented by subclasses

    // Default method with a predefined implementation
    default void sleep() {
        System.out.println("Sleeping...");
    }
}

// Class Dog implements the Animal interface
class Dog implements Animal {
    // Implementation of the abstract method bark()
    public void bark() {
        System.out.println("Bark!!!");
    }

    // Overriding the default method sleep() to provide custom behavior
    @Override
    public void sleep() {
        System.out.println("Dog is Sleeping!!!");
    }
}

// Main class to execute the program
class Basics {
    public static void main(String[] args) {
        Dog dog = new Dog();  // Create an instance of Dog
        dog.bark();           // Call the bark() method
        dog.sleep();          // Call the overridden sleep() method
    }
}

// we can have multiple interfaces
// we can not use super keyword in interface because it is not a abstract class
