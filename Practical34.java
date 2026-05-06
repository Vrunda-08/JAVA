import java.util.Scanner;

public class Practical34 {

    public void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        Scanner sc = new Scanner(System.in);
        Practical34 v = new Practical34();

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            v.checkEligibility(age);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input");
        }
        finally {
            System.out.println("Validation process completed");
        }
        sc.close();
    }
}