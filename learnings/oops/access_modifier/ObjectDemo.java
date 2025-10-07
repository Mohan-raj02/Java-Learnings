package learnings.oops.access_modifier;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override         //hashcode : unique number representation of an object eg: 18645356 --random number
    public int hashCode() {
        return super.hashCode();
//        return  num;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;     // this is used to get the object value from the parent class
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override            //toString: it basically gives string representation
    public String toString() {
        return super.toString();
    }

    @Override            //finalize: get calls when garbage collection hits
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(30, 52.0f);
        ObjectDemo obj1 = new ObjectDemo(30, 30.0f);
//        ObjectDemo obj1 = obj;
//        if(obj < obj1){           //error is due to confusion areavies on wht to check, wheteher num or gpa
//            System.out.println("obj is less than obj1");
//        }
        if(obj == obj1){          // checks the variable pointing to the same objectect
            System.out.println("obj is less than obj1");
        }

        if(obj.equals(obj1)){     // checks whether the values for both are equal
            System.out.println("obj is less than obj1");
        }

        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());

//        System.out.println(obj.hashCode());                         // output: 1791741888
//        System.out.println(obj1.hashCode());                        // output: 1595428806

    }
}
