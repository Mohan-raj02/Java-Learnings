//classes and objects(oops)
package learnings.oops.classes_and_objects;

public class Main {
    public static void main(String[] args){
//        example 1
        Hotel server1 = new Hotel();
        Hotel server2 = new Hotel();
        System.out.println("coffee prize :" + server1.coffee );
        System.out.println("coffee prize :" + server2.tea );

//        example 2
        Student std = new Student();
        std.name = "Mohan";
        std.age = 22;
        std.stdAge();

//        example 3
        Car c1 = new Car();
        c1.brand = "tata";
        c1.model = "SUVs";
        c1.Speed = "180 kmph";
//        String car =
                c1.getCarDetails(c1.brand, c1.model, c1.Speed);
//        System.out.println(car);

    }
}






/*
CLASSES AND OBJECTS IN JAVA - THEORETICAL NOTES

DEFINITION:
- Class: A user-defined blueprint or template that defines properties (attributes)
  and behaviors (methods) for a specific type of object
- Object: An actual instance of a class that exists in memory with specific values
  for attributes and can perform actions defined by methods

KEY CHARACTERISTICS OF CLASSES:
- Logical entity (exists as code structure only)
- No memory allocation during class definition
- Contains data members (attributes/fields) and methods
- Serves as factory to produce objects
- Can be declared only once but used to create multiple objects
- Follows OOP principles: encapsulation, inheritance, polymorphism, abstraction

KEY CHARACTERISTICS OF OBJECTS:
- Physical entity (exists in memory during runtime)
- Has three main characteristics:
  * State: represents data/values stored in object's attributes
  * Behavior: represents functionality through methods
  * Identity: unique identification managed internally by JVM
- Memory allocated in heap when object is created
- Can be manipulated during program execution
- Multiple objects can exist from same class with different attribute values

RELATIONSHIP BETWEEN CLASS AND OBJECT:
- Class is template, Object is instance
- Class defines "what", Object represents "actual thing"
- One class can create many objects
- Objects share same structure but have unique data

STEPS TO IMPLEMENT CLASSES:
1. Use 'class' keyword followed by class name (PascalCase naming convention)
2. Define access specifiers (public, private, protected)
3. Declare data members/attributes (instance variables)
4. Define constructors for object initialization
5. Implement methods for object behavior
6. End class definition with closing brace

STEPS TO CREATE AND USE OBJECTS:
1. Declare object reference variable with class type
2. Use 'new' keyword to instantiate object and allocate memory
3. Call constructor to initialize object
4. Access object attributes and methods using dot (.) operator
5. Perform operations through object methods
6. Object becomes eligible for garbage collection when no longer referenced

MEMORY ALLOCATION:
- Class: No memory allocated (exists only as code structure)
- Object: Memory allocated in heap area during instantiation
- Each object gets separate memory space for its attributes
- Methods are shared among all objects of same class

ALTERNATIVE OBJECT CREATION METHODS:
- newInstance() method
- clone() method
- Factory methods
- Deserialization
- Reflection API

BEST PRACTICES:
- Class names should start with uppercase letter
- Use meaningful names that represent real-world entities
- Follow single responsibility principle for classes
- Properly manage object lifecycle and memory
- Use appropriate access modifiers for encapsulation
*/
