import java.util.Scanner;

class car{
    int model_year ;
    int milege;
    public static void main(String[] args){
        car C1 = new car();
        car C2 = new car();

        Scanner sc = new Scanner();

        C1.model_year=sc.nextInt();
        C1.milege = sc.nextInt();

        C2.model_year = sc.nextInt();
        C2.milege = sc.nextInt();

        System.out.println("The model year of C1 is : " + C1.model_year);   
        System.out.println("The milege  of C1 is : " + C1.milege); 

        System.out.println("The model year of C2 is : " + C2.model_year); 
        System.out.println("The milege  of C2 is : " + C2.milege); 
        
    }
}