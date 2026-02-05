class Car{
    int n ;
    Car(int price){
        this.n=price;
    }
}


class Bmw extends Car{
    int m ;
    m = super.n;
    super(6);

}


class main{
    public static void main(String[] arg){
        Car c = new Car(5);
        system.out.println(c);
    }
}