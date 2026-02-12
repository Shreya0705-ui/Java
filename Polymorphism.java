class Subject{
    int sum(int a , int b){
        return a + b ;
    }
    // method overloading
    //  int sum ( int a , int b , int c){
    //  return a + b + c ;
    // }
}


class  BMW extends Subject{
    @Override 
    // incase if there is any other method of this name then it BMW will have 2 methods one own and second of parent 
    int sum(int a , int b){
        return a - b ;
    }

    // if not using override
    // int display(){
    //     int v = super.sum(a,7);
    //     return v; 
    // }
    
}


class Polymorphism {
    public static void main(String[] args){
        Subject d = new Subject();
        BMW e = new BMW();
        System.out.println(d.sum(3,3));
        // System.out.println(d.sum(4, 7 , 8));
         System.out.println(e.sum(3,3));
       


    }
}
