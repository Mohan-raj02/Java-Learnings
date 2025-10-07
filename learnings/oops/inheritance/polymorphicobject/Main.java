package learnings.oops.inheritance.polymorphicobject;

public class Main{
    public static void main(String[] args){
        Animal a1 = new Dog();
        Animal a2 = new Cat();


//        a1.speak();  --error

        //Here, the reference type is Animal (parent).
        //The actual object created is Dog or Cat.
        //This is called upcasting (parent reference → child object).
        //If a child class overrides a method from the parent (sound()),
        //then at runtime, the JVM decides which version to call based on the actual object (Dog or Cat).
        //This is called dynamic method dispatch or runtime polymorphism.
        //The compiler only looks at the reference type (Animal) during compile time, and since Animal has no speak(), it errors out.
        //If you want speak() to work polymorphically, you must declare it in Animal and override it in Dog and Cat.

//        a1.sound();               // output -- "animal sound" , since the method in animal class
        a1.sound();            // output -- "dog barks" , since the method exist in child dog class it overrides the parent class
        a2.sound();
    }
}


/*
 * DYNAMIC DISPATCH (DYNAMIC METHOD DISPATCH) IN JAVA
 * Dynamic Method Dispatch-- The JVM picks the correct overridden method at runtime, not compile time.
 * ==================================================
 *
 * DEFINITION:
 * Dynamic dispatch is the process of selecting which implementation of a
 * polymorphic method to call at runtime rather than compile time. It is the
 * mechanism that enables runtime polymorphism in Java through method overriding.
 *
 * KEY CONCEPTS:
 * - Method selection happens at runtime based on actual object type
 * - Superclass reference can point to subclass objects (upcasting)
 * - JVM determines which overridden method version to execute
 * - Different from static dispatch where method is determined at compile time
 * - Essential for implementing runtime polymorphism in object-oriented programming
 *
 * HOW IT WORKS:
 * 1. Superclass reference variable is declared
 * 2. Reference can point to objects of subclass types
 * 3. When method is called through reference, JVM checks actual object type
 * 4. JVM selects appropriate overridden method implementation
 * 5. Method execution occurs based on object type, not reference type
 *
 * IMPLEMENTATION MECHANISM:
 * - Java uses Virtual Method Table (vtable) internally
 * - Each object contains pointer to its class vtable
 * - vtable maps method names to actual implementations
 * - Runtime lookup determines correct method to invoke
 * - Slight performance overhead due to runtime resolution
 *
 * REQUIREMENTS FOR DYNAMIC DISPATCH:
 * 1. Inheritance relationship between classes
 * 2. Method overriding in subclasses
 * 3. Superclass reference pointing to subclass object
 * 4. Non-static, non-final, non-private methods
 *
 * STEPS TO IMPLEMENT:
 * Step 1: Create superclass with method to be overridden
 * Step 2: Create subclasses extending the superclass
 * Step 3: Override the method in each subclass with specific implementation
 * Step 4: Declare superclass reference variable
 * Step 5: Assign subclass objects to superclass reference
 * Step 6: Call overridden method through superclass reference
 * Step 7: JVM automatically dispatches to correct implementation at runtime
 *
 * BENEFITS:
 * - Enables polymorphic behavior
 * - Code flexibility and extensibility
 * - Runtime decision making
 * - Support for object-oriented design principles
 *
 * CONSIDERATIONS:
 * - Small runtime performance cost due to method lookup
 * - Method must be non-static, non-final, non-private
 * - Only works with overridden methods, not overloaded methods
 * - Type of object (not reference) determines method selection
 */
