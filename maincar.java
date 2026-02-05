class Car{
    int n ;
    Car(int price){
        this.n=price;
    }
}

class BMW extends Car{
    BMW(){
    int m;
     super(6);
    m = n;
    
    }
    

}

class maincar{
    public static void main(String[] arg){
        Car c = new Car(5);
        System.out.println(c.n);
    }
}