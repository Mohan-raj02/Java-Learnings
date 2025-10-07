package learnings.oops.abstract_class;

public class Main {
    public static void main(String[] args) {
//        Any subclass must implement (override) all abstract methods, unless the subclass is also abstract.
//        Abstract classes can have constructors, but you cannot instantiate them directly.
//        Abstract methods have nothing to do with constructors.
//        Constructors are for initializing fields, and abstract classes often have fields to initialize.
//        Abstract classes define a “contract” through abstract methods.
//        Dynamic dispatch ensures the correct overridden method is called at runtime.
        Parent P = new Son(12);
        P.Career();

        Son s = new Son(21);
        s.Career();
        s.normal();

        Daughter d = new Daughter(18);
        d.Career();

//        Parent mom = new Parent();  // you can't create object of an abstract class

        Parent.hello(); // calling static from parent class
    }
}

//    example syntax: abstract void career (String name);
//    Abstract methods → methods without a body (only declared, no code).
//    any class that contains one or more abstract methods, must also be declared as abstract.
//    you can't create object of an abstract(parent abstract class) class.
//    abstract Parent(); abstract constructor is not allowed
//    abstract static method also not allowed because the word abstract is meant for overridden where the static method cannot be overridden, so abstract static is not allowed.
//    but you can create static method in abstract class, only abstract static is not allowed which means using abstract keyword along with static.
//    final keyword not be used on super class in abstract class concept, you can use it inside the class as variable and methods.


/*
ABSTRACT CLASSES IN JAVA - THEORETICAL NOTES

DEFINITION:
An abstract class is a class declared with the 'abstract' keyword that cannot be instantiated directly. It serves as a blueprint or template for other classes to inherit from. Abstract classes are used to achieve data abstraction by hiding certain implementation details while showing only essential information.

KEY CHARACTERISTICS:
        - Cannot create objects/instances directly from abstract classes
- May contain both abstract methods (without implementation) and concrete methods (with implementation)
        - Can have constructors, data members, static methods, and final methods
- Must be extended by subclasses to be used
- If a class contains at least one abstract method, the class must be declared abstract
- Can exist without any abstract methods
- Abstract methods cannot be declared as final or static
- Provides partial implementation that subclasses must complete

ABSTRACT METHODS:
        - Methods declared with 'abstract' keyword
- Have no method body (no implementation)
- End with semicolon instead of method body
- Must be implemented by all non-abstract subclasses
- Can only exist within abstract classes
- Provide method signature that subclasses must follow

PURPOSE AND BENEFITS:
        - Achieve abstraction by hiding unnecessary implementation details
- Provide common interface/template for related classes
- Enforce method implementation in subclasses
- Reduce code duplication through inheritance
- Improve code organization and maintainability
- Enable polymorphism through common abstract parent

STEPS TO IMPLEMENT ABSTRACT CLASSES:

        1. DECLARE ABSTRACT CLASS:
        - Use 'abstract' keyword before class declaration
   - Define common fields and methods needed by subclasses
   - Declare abstract methods that subclasses must implement

2. CREATE CONCRETE SUBCLASSES:
        - Extend the abstract class using 'extends' keyword
   - Implement all abstract methods from parent class
   - Add additional methods and fields as needed
   - Can override non-abstract methods if required

3. INSTANTIATE AND USE:
        - Create objects only from concrete subclasses
   - Access inherited methods and fields through subclass objects
   - Use polymorphism to treat objects as abstract class type

INHERITANCE RULES:
        - Subclass inherits all non-private members from abstract parent
- Must implement all abstract methods or be declared abstract itself
- Can call parent constructor using super() keyword
- Multiple levels of abstract inheritance allowed
- Final classes cannot extend abstract classes

RESTRICTIONS:
        - Cannot instantiate abstract class directly
- Abstract methods cannot be private, final, or static
- Abstract class can extend another abstract class
- Interface vs Abstract Class: Interfaces provide complete abstraction, abstract classes provide partial abstraction

WHEN TO USE ABSTRACT CLASSES:
        - When classes share common code but need different implementations for some methods
- When you want to provide default implementation for some methods
- When you need constructors in your base class
- When you have closely related classes that should share a common interface
- When you want to enforce certain methods to be implemented by subclasses

COMPARISON WITH INTERFACES:
        - Abstract classes can have constructors, interfaces cannot
- Abstract classes can have instance variables, interfaces only have constants
- Classes can extend only one abstract class but implement multiple interfaces
- Abstract classes provide partial abstraction, interfaces provide complete abstraction
*/