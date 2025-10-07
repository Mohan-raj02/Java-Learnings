package learnings.concepts.strings;

public class Main {
    public static void main(String[] args){
//        count vowels
        CountVowels Vowels = new CountVowels();
        int result = Vowels.getCountVowels();
        System.out.println(result);

//        reverse strings
        ReverseStrings reverse = new ReverseStrings();
        String reverseString = reverse.getReverseString();
        System.out.println(reverseString);

//check palindrome
        CheckPalindrome palindrome = new CheckPalindrome();
        palindrome.getPalindrome();
//        boolean result = palindrome.getPalindrome();
//        System.out.println(palindrome.name);

//        count words
        CountWords countwords = new CountWords("Java is fun and powerful");         //constructor
        countwords.getWords();
//        System.out.println(" ");
//        System.out.print(countwords.text);

    }
}



/*
 * JAVA STRING, STRINGBUFFER, STRINGBUILDER AND MEMORY MANAGEMENT
 * ============================================================
 *
 * 1. STRING CLASS
 * --------------
 * - String objects are IMMUTABLE - once created, their values cannot be changed
 * - When you modify a string, a new String object is created in memory
 * - All String literals are stored in String Constant Pool (special area in heap)
 * - String objects created using 'new' keyword are stored in heap memory
 * - Thread-safe due to immutability
 * - Memory inefficient for frequent modifications due to object creation overhead
 *
 * Steps to work with String:
 * Step 1: Create String using literal syntax (stored in pool) or new keyword (heap)
 * Step 2: Any modification creates new object and original remains unchanged
 * Step 3: Garbage collection handles unused String objects
 *
 * 2. STRINGBUFFER CLASS
 * --------------------
 * - StringBuffer objects are MUTABLE - content can be modified without creating new objects
 * - Represents a sequence of characters that can be changed dynamically
 * - All methods are SYNCHRONIZED making it thread-safe for multi-threaded environments
 * - Stored in heap memory (not in string constant pool)
 * - Slower than StringBuilder due to synchronization overhead
 * - Automatically manages capacity and resizes when needed
 *
 * Steps to work with StringBuffer:
 * Step 1: Create StringBuffer object using constructors (default, with capacity, or with string)
 * Step 2: Use methods like append(), insert(), delete(), reverse(), replace() for modifications
 * Step 3: Convert to String using toString() method when needed
 * Step 4: No new object creation during modifications - same object is modified
 *
 * 3. STRINGBUILDER CLASS
 * ---------------------
 * - StringBuilder objects are MUTABLE like StringBuffer
 * - Methods are NOT SYNCHRONIZED making it NOT thread-safe
 * - Faster performance compared to StringBuffer in single-threaded environments
 * - Stored in heap memory
 * - Ideal for scenarios requiring frequent string modifications without thread safety concerns
 * - Automatically manages capacity and resizes internal buffer as needed
 *
 * Steps to work with StringBuilder:
 * Step 1: Create StringBuilder object using appropriate constructor
 * Step 2: Perform modifications using append(), insert(), delete(), reverse(), replace()
 * Step 3: Convert to String using toString() when final result is needed
 * Step 4: Use in single-threaded applications for better performance
 *
 * 4. STRING CONSTANT POOL vs HEAP MEMORY
 * =====================================
 *
 * String Constant Pool:
 * - Special memory area within heap dedicated to storing String literals
 * - Strings created using literal syntax are stored here
 * - JVM checks pool before creating new String - reuses existing if found
 * - Memory efficient as duplicate strings are not created
 * - Managed by JVM for optimization
 *
 * Heap Memory:
 * - String objects created using 'new' keyword are stored in heap
 * - StringBuffer and StringBuilder objects are always stored in heap
 * - No automatic deduplication like string pool
 * - Garbage collection applies to unreferenced objects
 *
 * Steps for Memory Management:
 * Step 1: Use string literals for static strings (stored in pool)
 * Step 2: Use 'new String()' only when you need separate heap objects
 * Step 3: Choose StringBuffer for thread-safe mutable strings
 * Step 4: Choose StringBuilder for single-threaded mutable string operations
 * Step 5: Consider memory implications - immutable strings create many objects
 *
 * PERFORMANCE COMPARISON:
 * ======================
 * String: Slowest for modifications (creates new objects)
 * StringBuffer: Medium speed (synchronized, thread-safe)
 * StringBuilder: Fastest for modifications (not synchronized)
 *
 * THREAD SAFETY:
 * ==============
 * String: Thread-safe (immutable)
 * StringBuffer: Thread-safe (synchronized methods)
 * StringBuilder: Not thread-safe (no synchronization)
 *
 * BEST PRACTICES:
 * ==============
 * - Use String for fixed text that doesn't change
 * - Use StringBuilder for single-threaded string building operations
 * - Use StringBuffer only when thread safety is required
 * - Avoid string concatenation in loops - use StringBuilder/StringBuffer instead
 * - Initialize with appropriate capacity to avoid frequent resizing
 */
