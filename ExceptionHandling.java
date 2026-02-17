import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        String name;
        int age;
        float salary;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Name: ");
            name = sc.nextLine();

            System.out.print("Enter Age: ");
            age = sc.nextInt();

            System.out.print("Enter Salary: ");
            salary = sc.nextFloat();

            if (name.length() > 20) {
                throw new IllegalArgumentException();
            }


            if (age <= 5) {
                throw new IllegalArgumentException();
            }

            if (salary <= 4000000) {
                throw new IllegalArgumentException();
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Data Entered");
        } finally {
            System.out.println("Data inserted successfully");
        }
    }
}
