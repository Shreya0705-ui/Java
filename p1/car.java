package p1;



 public class car{
    public int mileage;
    public int price;

}

class Main1 {
    public static void main(String[] args){
        car c = new car();
        c.mileage = 32 ;
        c.price = 5000000 ;
        System.out.println(c.mileage);
        System.out.println(c.price);

    }
}
