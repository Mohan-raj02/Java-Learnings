package learnings.oops.inheritance.multiplemethods;

public class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
    void stop() { System.out.println("Vehicle stops"); }
}
class Car extends Vehicle {
    void honk() { System.out.println("Car honks"); }
}

