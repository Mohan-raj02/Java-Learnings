package learnings.oops.encapsulation;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
//        Example 1: Basic Getter & Setter
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println(acc.getBalance());

//        Example 2: Validation in Setter
        StudentDemo std = new StudentDemo();

        std.setAge(15);

        int returnedAge = std.getAge();
        System.out.println("age:"+ returnedAge);

//        Example 3: Read-Only Property
        Employee emp = new Employee("Mohan");
        emp.getId();
//        emp.setid("raj");
        System.out.println("id:"+ emp.getId());




//        Example 4: Encapsulation with Object Reference

//        Example 5: Encapsulation with Array
        Marks mark = new Marks();
        int[] arr = {80, 90,35};
        mark.setScores(arr);

        int[] s = mark.getScores();
        for(int i : s){
//        System.out.println(Arrays.toString(mark.getScores()));
        System.out.println(i);
        }
    }
}







/*
 * ENCAPSULATION - THEORETICAL CONCEPTS
 *
 * Definition:
 * - Encapsulation is the wrapping up of data and methods under a single unit
 * - It is the mechanism that binds together code and the data it manipulates
 * - Prevents external code from directly accessing internal object components
 * - Creates a protective shield around data to prevent unauthorized access
 *
 * Core Principles:
 * 1. Data Hiding: Internal data is hidden from outside access
 * 2. Controlled Access: Access to data is provided through public methods only
 * 3. Single Unit: Related data and methods are grouped together in one class
 * 4. Interface Consistency: External interface remains stable regardless of internal changes
 *
 * Key Components:
 * - Private Variables: Store the actual data (hidden from outside)
 * - Public Methods: Provide controlled access to private data
 * - Getter Methods: Allow reading/retrieving private data values
 * - Setter Methods: Allow modifying private data with validation
 * - Access Modifiers: Control visibility (private, public, protected)
 *
 * Benefits of Encapsulation:
 * 1. Data Security: Prevents unauthorized direct access to sensitive data
 * 2. Data Integrity: Ensures data remains in valid state through controlled modification
 * 3. Code Maintainability: Internal implementation can change without affecting other code
 * 4. Flexibility: Can add validation logic in setter methods
 * 5. Code Organization: Related functionality is grouped together
 * 6. Reusability: Encapsulated classes can be easily reused in different contexts
 * 7. Debugging: Easier to track data modifications through method calls
 *
 * Implementation Steps:
 *
 * Step 1: Declare Class Variables as Private
 * - Use 'private' keyword for all data members
 * - This prevents direct external access to the variables
 * - Variables become accessible only within the same class
 *
 * Step 2: Create Public Getter Methods
 * - Name convention: get + VariableName (e.g., getName())
 * - Return type should match the variable type
 * - Simply return the value of the private variable
 * - Allows controlled read access to the data
 *
 * Step 3: Create Public Setter Methods
 * - Name convention: set + VariableName (e.g., setName())
 * - Accept parameter of same type as the variable
 * - Include validation logic if needed
 * - Assign parameter value to the private variable
 * - Allows controlled write access to the data
 *
 * Step 4: Implement Validation (Optional)
 * - Add business logic in setter methods
 * - Validate input parameters before assignment
 * - Throw exceptions for invalid inputs
 * - Maintain data consistency and integrity
 *
 * Step 5: Design Public Interface
 * - Expose only necessary methods to outside world
 * - Keep internal helper methods private
 * - Provide meaningful method names
 * - Ensure consistent behavior across methods
 *
 * Access Modifier Rules:
 * - private: Accessible only within the same class
 * - public: Accessible from anywhere in the program
 * - protected: Accessible within package and subclasses
 * - default: Accessible within the same package
 *
 * Best Practices:
 * 1. Always make instance variables private unless there's specific reason
 * 2. Provide public getters and setters only when needed
 * 3. Include input validation in setter methods
 * 4. Use meaningful names for getter and setter methods
 * 5. Keep the public interface minimal and focused
 * 6. Document the expected behavior of public methods
 * 7. Consider immutable objects when data shouldn't change after creation
 *
 * Real-World Analogy:
 * - Like a medicine capsule that hides its contents but provides the medicine's effect
 * - Similar to a car where you use controls (steering, pedals) without knowing internal mechanics
 * - Like a bank account where you can deposit/withdraw through ATM but can't directly access vault
 */
