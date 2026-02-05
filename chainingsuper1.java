
    class Bird {
    Bird() {
        System.out.println("Bird constructor");
    }
}

class Sparrow extends Bird {
    Sparrow() {
        super();   
        super();  

        System.out.println("Sparrow constructor");

    }
}

public class chainingsuper1 {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
    }
}


