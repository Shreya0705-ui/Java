Class Car{
    int n ;
    Car(int price){
        this.n=price;
    }
}

Car BMW extends Car{
    int m ;
    m = super.n;
    super(6);

}

Car main{
    public static void main(String[] arg){
        Car c = new Car(5);
        system.out.println(c);
    }
}