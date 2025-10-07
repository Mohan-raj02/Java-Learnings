package learnings.oops.garbage_collection;

public class Main{
    public static void main(String[] args) {
        A obj = new A("mohan");

        System.out.println(obj);

//        for(int i = 0; i < 1000000000; i++ ){
//            obj = new A("object is created:"+ i);
//        }
    }
}


//outpu:
//object is created:4389687
//object is created:4389688
//object is created:4389689
//object is created:4389690
//object is created:4389691
//object is destroyed
//object is destroyed
//object is destroyed
//object is destroyed
//object is destroyed




/*
 * GARBAGE COLLECTION IN JAVA - THEORETICAL NOTES
 *
 * DEFINITION:
 * - Garbage Collection (GC) is an automatic memory management process in Java
 * - It removes unused objects from heap memory without programmer intervention
 * - Part of the JVM that helps Java programs run efficiently
 *
 * HOW GARBAGE COLLECTION WORKS:
 * - Identifies which objects are still in use (referenced) and which are not (unreferenced)
 * - Removes objects that are unreachable (no longer referenced by any part of program)
 * - Implemented within the JVM, programmer doesn't need to explicitly mark objects for deletion
 *
 * MEMORY GENERATIONS:
 * - Young Generation: Where new objects are allocated
 * - Old Generation: Where long-lived objects are stored after surviving minor collections
 * - Large Object Heap (LOH): For objects larger than a certain threshold
 *
 * TYPES OF GARBAGE COLLECTION ACTIVITIES:
 * 1. Minor/Incremental GC:
 *    - Occurs when unreachable objects in Young Generation are removed
 *    - Happens frequently
 *    - Faster execution
 *
 * 2. Major/Full GC:
 *    - Occurs when objects are removed from Old Generation
 *    - Happens less frequently than minor GC
 *    - Takes more time to complete
 *
 * PHASES OF GARBAGE COLLECTION:
 * 1. Marking Phase:
 *    - Finds and creates list of all live (reachable) objects
 *    - Uses "mark-and-sweep" algorithm
 *    - Starts from root objects and traces all references
 *
 * 2. Relocating Phase:
 *    - Updates references to objects that will be compacted
 *    - Prepares for memory reorganization
 *
 * 3. Compacting Phase:
 *    - Reclaims space occupied by dead objects
 *    - Compacts surviving objects to reduce fragmentation
 *    - Moves objects toward older end of segment
 *
 * CONDITIONS THAT TRIGGER GARBAGE COLLECTION:
 * - System has low physical memory
 * - Memory used by allocated objects surpasses acceptable threshold
 * - Explicit call to System.gc() or Runtime.getRuntime().gc() (not recommended)
 * - JVM determines it's necessary based on internal algorithms
 *
 * MAKING OBJECTS ELIGIBLE FOR GARBAGE COLLECTION:
 * 1. Nullifying reference variable (obj = null)
 * 2. Re-assigning reference variable (obj = new Object())
 * 3. Objects created inside method (eligible after method execution)
 * 4. Island of Isolation (objects isolated with no reachable references)
 *
 * UNREACHABLE OBJECTS:
 * - Object becomes unreachable when it contains no reference to it
 * - These objects become eligible for garbage collection
 * - GC may not destroy them immediately - runs at JVM's discretion
 *
 * STEPS TO IMPLEMENT GARBAGE COLLECTION CONCEPTS:
 * 1. Create objects normally in your program
 * 2. When object is no longer needed, remove all references to it
 * 3. Set reference variables to null when appropriate
 * 4. Avoid keeping unnecessary references to objects
 * 5. Let JVM handle the actual memory cleanup automatically
 * 6. Monitor memory usage if needed using profiling tools
 * 7. Avoid calling System.gc() explicitly in production code
 *
 * IMPORTANT NOTES:
 * - Garbage collection is unpredictable - cannot control exactly when it runs
 * - All managed threads are suspended during GC except triggering thread
 * - Modern JVMs use optimized algorithms for better performance
 * - finalize() method is deprecated since Java 9 - use try-with-resources instead
 * - GC helps prevent memory leaks but doesn't guarantee it
 *
 * PERFORMANCE CONSIDERATIONS:
 * - Frequent object creation can increase GC overhead
 * - Large objects may be handled differently (Large Object Heap)
 * - Generational collection optimizes for object lifetime patterns
 * - Newer objects typically have shorter lifetimes
 * - Object pooling can reduce GC pressure in some scenarios
 */
