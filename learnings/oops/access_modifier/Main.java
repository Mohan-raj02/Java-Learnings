package learnings.oops.access_modifier;

public class Main {
    public static void main(String[] args) {
        BankDetails b1 = new BankDetails(120, "credited 100 rupees");
//        int bank = b1.bankBalance;
//       System.out.println(b1.bankBalance);
//
//        b1.bankVisit();

//        ATM A = new ATM(1000, "withdraw fron atm today");
//        System.out.println(A.bankBalance);

//        ATM A = new ATM();
//        System.out.println(A.bankBalance);

        b1.setBankBalance(350);
        b1.getBankBalance();
        System.out.println(b1.getBankBalance());




    }
}

// private can only acces on the same file where it has been used.
// public can be access on anywhere eg: same class, inside the package,same package subclass (inherited child class), subclass on different package, different package and not subclass.
// protected can be access on the same class, same package,same package subclass (inherited child class), subclass on different package
// No modifier can be accessed on the same class, same package, same package subclass (inherited child class)


//for protected:
//-- always make sure it only access on subclass of different package, means if you want to access from different package then it must be on the subclass from different package.
// -- must create object for the subclass name to access protected on different package.




/*
 * JAVA THEORETICAL NOTES: ACCESS MODIFIERS, OBJECT CLASS, AND OBJECT METHODS
 *
 * =============================================================================
 * ACCESS MODIFIERS
 * =============================================================================
 *
 * Access modifiers are keywords that control the visibility and accessibility
 * of classes, variables, methods, and constructors in Java programs.
 *
 * FOUR TYPES OF ACCESS MODIFIERS:
 *
 * 1. PUBLIC MODIFIER:
 *    - Provides unrestricted access from anywhere in the program
 *    - Can be accessed from any class, package, or outside the package
 *    - Most permissive access level
 *    - Used for APIs and interfaces that need global accessibility
 *
 * 2. PRIVATE MODIFIER:
 *    - Restricts access to only within the same class
 *    - Cannot be accessed from subclasses or other classes
 *    - Most restrictive access level
 *    - Used for encapsulation and data hiding
 *    - Protects internal implementation details
 *
 * 3. PROTECTED MODIFIER:
 *    - Allows access within same class, subclasses, and same package
 *    - More restrictive than public but less than private
 *    - Used for inheritance scenarios
 *    - Enables controlled access for class hierarchies
 *
 * 4. DEFAULT/PACKAGE-PRIVATE MODIFIER:
 *    - Applied when no access modifier is specified
 *    - Allows access within same package only
 *    - Cannot be accessed from outside the package
 *    - Provides package-level encapsulation
 *
 * STEPS TO IMPLEMENT ACCESS MODIFIERS:
 *
 * Step 1: Identify the scope requirements for your class members
 * Step 2: Choose appropriate access modifier based on visibility needs
 * Step 3: Apply modifier keyword before the member declaration
 * Step 4: Test accessibility from different classes and packages
 * Step 5: Use getter/setter methods for controlled access to private members
 *
 * =============================================================================
 * OBJECT CLASS
 * =============================================================================
 *
 * The Object class is the root class of all Java classes and serves as the
 * ultimate superclass for every class in Java's class hierarchy.
 *
 * OBJECT CLASS CHARACTERISTICS:
 *
 * - Every class implicitly inherits from Object class
 * - Located in java.lang package
 * - Provides fundamental methods for all objects
 * - Cannot be instantiated directly in meaningful ways
 * - Defines common behavior for all Java objects
 * - Enables polymorphic behavior through inheritance
 *
 * KEY INHERITED METHODS FROM OBJECT CLASS:
 *
 * - toString(): Returns string representation of object
 * - equals(): Compares objects for equality
 * - hashCode(): Returns hash code value for object
 * - getClass(): Returns runtime class information
 * - clone(): Creates object copy
 * - finalize(): Called by garbage collector
 * - wait(), notify(), notifyAll(): Thread synchronization methods
 *
 * STEPS TO WORK WITH OBJECT CLASS:
 *
 * Step 1: Understand that your class automatically extends Object
 * Step 2: Override Object methods when custom behavior is needed
 * Step 3: Implement toString() for meaningful string representation
 * Step 4: Override equals() and hashCode() together for proper comparisons
 * Step 5: Use getClass() for runtime type checking
 * Step 6: Consider overriding clone() for object copying needs
 *
 * =============================================================================
 * OBJECT METHODS
 * =============================================================================
 *
 * Object methods are functions defined within a class that operate on object
 * instances and provide behavior and functionality to objects.
 *
 * TYPES OF OBJECT METHODS:
 *
 * 1. INSTANCE METHODS:
 *    - Belong to specific object instances
 *    - Require object creation to be invoked
 *    - Can access instance variables and other instance methods
 *    - Have access to 'this' reference
 *
 * 2. STATIC METHODS:
 *    - Belong to the class rather than instances
 *    - Can be called without creating objects
 *    - Cannot access instance variables directly
 *    - Shared among all instances of the class
 *
 * 3. ACCESSOR METHODS (GETTERS):
 *    - Provide controlled read access to private fields
 *    - Follow naming convention: get + PropertyName
 *    - Return the value of private instance variables
 *    - Maintain encapsulation principles
 *
 * 4. MUTATOR METHODS (SETTERS):
 *    - Provide controlled write access to private fields
 *    - Follow naming convention: set + PropertyName
 *    - Modify private instance variables safely
 *    - Can include validation logic
 *
 * 5. CONSTRUCTORS:
 *    - Special methods for object initialization
 *    - Same name as class name
 *    - No return type specification
 *    - Called automatically during object creation
 *
 * STEPS TO IMPLEMENT OBJECT METHODS:
 *
 * Step 1: Define method signature with appropriate access modifier
 * Step 2: Specify return type (or void if no return value)
 * Step 3: Add parameter list if method requires input
 * Step 4: Implement method body with required logic
 * Step 5: Use proper naming conventions for clarity
 * Step 6: Add documentation comments for method purpose
 * Step 7: Test method functionality with various inputs
 * Step 8: Consider method overloading for different parameter combinations
 *
 * METHOD DESIGN PRINCIPLES:
 *
 * - Single Responsibility: Each method should have one clear purpose
 * - Encapsulation: Use appropriate access modifiers
 * - Consistency: Follow naming and parameter conventions
 * - Validation: Check input parameters when necessary
 * - Documentation: Provide clear method documentation
 * - Error Handling: Implement appropriate exception handling
 *
 * BEST PRACTICES:
 *
 * - Keep methods focused and concise
 * - Use meaningful method names that describe functionality
 * - Minimize method parameter count
 * - Prefer immutable objects when possible
 * - Follow Java naming conventions consistently
 * - Use access modifiers to control method visibility appropriately
 */
