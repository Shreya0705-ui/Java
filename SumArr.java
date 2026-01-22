import java.util.Scanner;
public class SumArr {
   
    int sum = 0;
    int arr[] = new int[5];
    

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        SumArr m = new SumArr();

        for(int i = 0 ; i < 5 ; i++){
            m.arr[i] = s.nextInt();
            m.sum += m.arr[i];
        }
    


        System.out.println(m.sum);

    }
    

}
    

