package learnings.oops.constructors;

public class Main {
    public static void main(String[] args) {
//
//        Student Mohan = new Student();               // by default constructor(Explicit default constructor)
        Student Mohan = new Student("Mohan", 81.2f, 31);

        System.out.println("this is my name:" + Mohan.name);
        System.out.println("this is my roll no:" + Mohan.rlno);
        System.out.println("this is my mark:" + Mohan.marks);

//        Student Darwin = new Student();
//        System.out.println("this is my name:" + Darwin.name);

        Student random = new Student(Mohan);
        System.out.println("randon:"+ random.name);


//        this is how you call a constructor from another constructor
//        internally: new Student (13, "default person", 100.0f)
        Student random2 = new Student();
        System.out.println(random2.name);


        Student one = new Student();
        Student two = one;

        one.name = "Something something";
        System.out.println(two.name);
    }
}


// DEFAULT CONSTRUCTOR IN JAVA - THEORETICAL NOTES

// DEFINITION:
// A default constructor is a constructor that has no parameters and is automatically
// created by the Java compiler when no other constructors are explicitly defined in a class

// TWO TYPES OF DEFAULT CONSTRUCTORS:

// 1. IMPLICIT DEFAULT CONSTRUCTOR:
//    - Automatically provided by Java compiler
//    - Created only when NO constructor is defined in the class
//    - Takes no parameters
//    - Initializes object with default values
//    - Not visible in source code (created behind the scenes)

// 2. EXPLICIT DEFAULT CONSTRUCTOR:
//    - Manually written by programmer
//    - Takes no parameters
//    - Replaces the compiler-generated default constructor
//    - Visible in source code
//    - Can contain custom initialization logic

// WHEN DEFAULT CONSTRUCTOR IS CREATED:
// - Only when NO constructors are defined in the class
// - Once ANY constructor (parameterized or non-parameterized) is defined,
//   compiler stops providing default constructor
// - Must be explicitly defined if needed after creating other constructors

// WHAT DEFAULT CONSTRUCTOR DOES:
// - Initializes instance variables with default values:
//   * Numeric types (byte, short, int, long, float, double) = 0
//   * boolean = false
//   * char = '\u0000' (Unicode null character)
//   * Reference types (String, objects) = null
// - Calls superclass constructor (super())
// - Allocates memory for object on heap

// IMPORTANT DISTINCTION:
// Default Constructor ≠ No-Argument Constructor
// - Default constructor: Created by compiler automatically
// - No-argument constructor: Created by programmer with no parameters
// - Both serve similar purpose but have different origins

// STEPS OF DEFAULT CONSTRUCTOR EXECUTION:

// STEP 1: OBJECT CREATION REQUEST
// When new ClassName() is called without parameters

// STEP 2: COMPILER CHECK
// Compiler checks if any constructor exists in the class

// STEP 3: DEFAULT CONSTRUCTOR PROVISION
// If no constructor found, compiler automatically provides default constructor

// STEP 4: MEMORY ALLOCATION
// Memory allocated on heap for new object

// STEP 5: SUPERCLASS CONSTRUCTOR CALL
// Implicit call to parent class constructor (super())

// STEP 6: INSTANCE VARIABLE INITIALIZATION
// All instance variables initialized with their default values

// STEP 7: CONSTRUCTOR BODY EXECUTION
// Any code in constructor body is executed (empty for implicit default)

// STEP 8: OBJECT REFERENCE RETURN
// Reference to newly created object is returned

// KEY RULES AND POINTS:

// RULE 1: AUTOMATIC CREATION
// Default constructor is created automatically only when no other constructors exist

// RULE 2: PARAMETER RESTRICTION
// Default constructor never takes any parameters

// RULE 3: ACCESS MODIFIER
// Default constructor has same access modifier as the class
// - public class → public default constructor
// - package-private class → package-private default constructor

// RULE 4: INHERITANCE BEHAVIOR
// Default constructor always calls superclass default constructor using super()

// RULE 5: OVERRIDING BEHAVIOR
// Once any constructor is defined, default constructor is no longer provided
// Must explicitly create no-argument constructor if needed

// RULE 6: FINAL VARIABLES
// Default constructor cannot initialize final variables
// Final variables must be initialized explicitly in custom constructors

// COMMON MISCONCEPTIONS:
// - Default constructor is NOT the same as no-argument constructor
// - Default constructor is NOT always present (only when no other constructors exist)
// - Default constructor does NOT contain any custom logic (unless explicitly written)

// BEST PRACTICES:
// - Always provide explicit constructors for better control
// - Use explicit no-argument constructor instead of relying on default
// - Initialize final variables in custom constructors
// - Consider providing both parameterized and no-argument constructors
