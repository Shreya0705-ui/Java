class A{
    final int a = 10;
    final void foo(){
        System.out.println("Hello world");
    }
}
 
 class B extends A{
    int a = 7;

}


public class final1 {
    public static void main(String[] args){
        // int a = 7;
        A var1 = new A();
        B var2 = new B();
        System.out.println(var1.a);
        System.out.println(var2.a);
       

    }
}
