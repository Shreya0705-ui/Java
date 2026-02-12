
    abstract class Sample {
    int a = 10;

    void f() {
        System.out.println(a);
    }

    abstract void f2();
}

class Child extends Sample {

    void show() {
        super.f();
    }

    @Override
    void f2() {
        System.out.println("done");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Child s = new Child();
        s.show();
        s.f2();
    }
}







// abstract class sample { // hiding details
//     int a = 10;

//     void function() {
//         System.out.println(a);
//     }

// }

// class child extends sample{
//     void function(){
//         super.function(); // we can access parent class method using super keyword
//         System.out.println(super.a);
//         }
// }

// public class Abstraction {
//     public static void main(String[] args) {
//         child s = new child(); // we can not make or access object for abstract class first we need to make a child class because it hide the details 
//         s.function();
//     }
// }
