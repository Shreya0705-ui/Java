
    import java.util.Scanner;

class check {

    int[] arr = new int[5];
    boolean isDuplicate = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        check obj = new check();

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < obj.arr.length; i++) {
            obj.arr[i] = sc.nextInt();
        }

        for (int i = 0; i < obj.arr.length; i++) {
            for (int j = i + 1; j < obj.arr.length; j++) {
                if (obj.arr[i] == obj.arr[j]) {
                    obj.isDuplicate = true;
                    break;
                }
            }
        }

        if (obj.isDuplicate) {
            System.out.println("Duplicate elements found");
        } else {
            System.out.println("No duplicate elements");
        }
    }
}

