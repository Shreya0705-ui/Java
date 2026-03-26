import java.util.* ;

public class LinkedListCollections {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
         LinkedList <Integer> head = new LinkedList <>();
         for (int i = 0 ; i < 10 ; i++){
            head.addLast(sc.nextInt());
        }

        HashMap <Integer , Integer> freqMap = new HashMap<>();
        for(int num : head){
            if (freqMap.containsKey(num)){
                freqMap.put(num ,freqMap.get(num)+1);

            }
            else{
                freqMap.put(num , 1);
            }
        }
        System.out.println("Print all elements: ");
        for ( int num : head){
            if( freqMap.get(num) == 1){
                System.out.println(num);
            }
        }

    }
}
