class A {
    void show() {
        System.out.println("This is class A method");
    }
}

class T1 extends A implements Runnable {

    public void run() {
        System.out.println("Thread is running...");
        show();   
    }
}

public class Thread2 {
    public static void main(String[] args) {

        T1 t = new T1();              
        Thread t2 = new Thread(t);    
        t2.start();                   

    }
}