package learnings.oops.exceptionHandling;

import learnings.oops.garbage_collection.A;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            int c = a / b;  // try this and catch the error
//            divide( a , b);

//            throw new Exception("Just for fum");//mimicing exception

            String name = "Mohan";
            if (name.equals("Mohan")) {
                throw new MyException("name is Mohan");
            }
        } catch (MyException e){                    // either use Exception or ArithmeticException, both will work because ArithmeticException is the subclass of Exception class
            System.out.println(e.getMessage());          // output: / by zero
        }  catch (ArithmeticException e){                    // either use Exception or ArithmeticException, both will work because ArithmeticException is the subclass of Exception class
            System.out.println(e.getMessage());          // output: / by zero
        }  catch (Exception e){
            System.out.println("normal exception");
        } finally{      // executes either or not finds error(even if error has or not it will execute)
            System.out.println("Anyway i'll print this(this will always execute)");
        }
    }

    static int divide(int a, int b) throws ArithmeticException { // have to use here what has to be thrown. (either use Exception or ArithmeticException)
        if(  b == 0){
//            System.out.println();
            throw new ArithmeticException("please do not divide by zero"); //(either use Exception or ArithmeticException)
        }
        return a / b ;
    }
}
