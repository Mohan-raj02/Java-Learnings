package learnings.oops.polymorphism;

public class Numbers {
    double sum(double a, int b){
        return a + b;
    }

    int sum(int a, int b){
        return a + b;
    }

//    void sum(int a, String b){                             //order of the type(data type) should be different
//    }

    int sum(int a , int b , int c){                      //argument/parameters or return type should be different for method overloading
        return a + b;
    }

//    void sum(String b , int a ){                           //order of the type(data type) should be different
//    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(23.00,3));

//        obj.sum(2,3.22);
        //during the compile time only it checks which method to actually run, so it is called compile time polymorphism.
        //allocation of memory happens on run time
        obj.sum(2,3,4);
//        obj.sum(2,3,4,5,6);
    }
}
