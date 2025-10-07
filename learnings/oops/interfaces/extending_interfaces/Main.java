package learnings.oops.interfaces.extending_interfaces;

public class Main implements B {
    @Override
    public void greet() {

    }

    @Override
    public void fun() {

    }


}


/*
Java Interfaces - Theoretical Notes

DEFINITION:
An interface in Java is a completely abstract class that serves as a blueprint
for behavior. It is a contract that defines what methods a class must implement
without specifying how they should be implemented.

KEY CHARACTERISTICS:
- Contains only abstract methods (methods without body) by default
- All methods are implicitly public and abstract
- All variables are implicitly public, static, and final (constants)
- Cannot be instantiated directly
- Supports multiple inheritance (a class can implement multiple interfaces)
- Cannot contain constructors
- From Java 8+, can contain default and static methods with implementation

INTERFACE DECLARATION SYNTAX:
- Use 'interface' keyword instead of 'class'
- Interface names conventionally start with capital 'I' or use descriptive names
- Methods declared without implementation (abstract by default)

IMPLEMENTATION PROCESS:
- Classes use 'implements' keyword to implement interfaces
- Must provide concrete implementation for all abstract methods
- Can implement multiple interfaces separated by commas
- If a class implements an interface, it must override all abstract methods

STEPS TO WORK WITH INTERFACES:

Step 1: Define the Interface
- Declare interface using 'interface' keyword
- Define method signatures without implementation
- Declare any constants needed

Step 2: Implement the Interface
- Use 'implements' keyword in class declaration
- Provide concrete implementation for all abstract methods
- Use @Override annotation for clarity

Step 3: Interface Inheritance
- Interfaces can extend other interfaces using 'extends' keyword
- Implementing class must provide implementation for all inherited methods
- Supports multiple interface inheritance

Step 4: Handle Method Conflicts
- When implementing multiple interfaces with same method signatures
- Provide single implementation that satisfies all interfaces
- Use super keyword to call specific interface default methods

ADVANCED CONCEPTS:

Default Methods (Java 8+):
- Methods with implementation in interfaces
- Use 'default' keyword
- Allows adding new methods without breaking existing implementations

Static Methods (Java 8+):
- Utility methods that belong to interface
- Cannot be overridden by implementing classes
- Called using interface name

Functional Interfaces:
- Interfaces with exactly one abstract method
- Can be used with lambda expressions
- Annotated with @FunctionalInterface

BENEFITS:
- Achieves multiple inheritance of type
- Provides loose coupling between classes
- Enables polymorphism and abstraction
- Defines contracts for implementation
- Supports design patterns like Strategy and Observer

BEST PRACTICES:
- Keep interfaces focused and cohesive
- Avoid putting too many methods in single interface
- Use meaningful names that describe the behavior
- Prefer composition over inheritance when possible
- Document the contract clearly in comments

*/